package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import controlador.OAlmacen;
import controlador.OLote;
import controlador.Oproveedores;



public class MAlmacen {
	
	
	
	public List<OAlmacen> getAlmacenes() throws Exception{
	
List<OAlmacen> almacenes=new ArrayList<>();
	
	//establecer conexion
	
	Connection miconexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
	
	//crear sentencia sql
	
	Statement mist=miconexion.createStatement();
	
	//ejecutar sentencia sql
	
	ResultSet rs=mist.executeQuery("SELECT * FROM ALMACEN");
	
	//recorrer rs
	
	while(rs.next()) {
		
		int rid=rs.getInt(1);
		String rnombre=rs.getString(2);
		String rtipoalm=rs.getString(3);
		double rcapacidad=rs.getDouble(4);
		String rsituacion=rs.getString(5);
		String rubicacion=rs.getString(6);
		double rkgAlmacenados=rs.getDouble(7);
		
		
		
		OAlmacen tempalm=new OAlmacen(rid,rnombre,rtipoalm,rcapacidad,rsituacion,rubicacion,rkgAlmacenados);
		almacenes.add(tempalm);
		
		
	}
	return almacenes;

}
	public void  setAlmacenes(OAlmacen nuevoAlm) {
		
		Connection miconexion;
		try {
			miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
			
			String sql="INSERT INTO ALMACEN (ID,NOMBRE,TIPO_ALMACEN,CAPACIDAD,SITUACION,UBICACION,KG_ALMACENADOS)"+
			"VALUES(?,?,?,?,?,?,?)";
			
			PreparedStatement mist=miconexion.prepareStatement(sql);
			mist.setInt(1, nuevoAlm.getId());
			mist.setString(2, nuevoAlm.getNombre());
			mist.setString(3, nuevoAlm.getTipoAlmacen());
			mist.setDouble(4, nuevoAlm.getCapacidad());
			mist.setString(5, nuevoAlm.getSituacion());
			mist.setString(6, nuevoAlm.getUbicacion());
			mist.setDouble(7, nuevoAlm.getKgAlmacenados());

			mist.execute();
			
			System.out.println("almacen insertado");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error en consulta");
			e.printStackTrace();
		}
			
		}
	
	
	public double getCapacidad(int Id){
		double capacidad = 0;
		Connection miconexion;
		try {
			miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
			String sql="SELECT CAPACIDAD FROM ALMACEN WHERE ID=?";
			PreparedStatement mist=miconexion.prepareStatement(sql);
			mist.setInt(1, Id);
						
			ResultSet rs=mist.executeQuery();
			while(rs.next()) {
				
				capacidad=rs.getDouble(1);
				
				
			}
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error en consulta");
			e.printStackTrace();
		}
		
		
		return capacidad;
		
		
	}
	
	public List<OLote> getSumLotesPorAlmacenComprados(int id){
		
		List<OLote> lotesAlmacen=new ArrayList<OLote>();
		
		Connection miconexion;
		try {
			miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
		
			String sql="SELECT SUM(KG),LOTE FROM PROVISION WHERE ID_ALMACEN=? AND (LOTE_MEZCLA=0 OR ACCION='SUSTRAIDO PARA PREMEZCLA') GROUP BY LOTE";

			PreparedStatement mist=miconexion.prepareStatement(sql);
			
			mist.setInt(1,id);
			
			ResultSet rs=mist.executeQuery();
			
			while (rs.next()) {
				
			double kg=rs.getDouble(1);
			int lote=rs.getInt(2);
			
				
				
				
				OLote tempkg=new OLote(id,kg,lote,0);
				lotesAlmacen.add(tempkg);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error en consulta");
			e.printStackTrace();
		}
		
		
		
		return lotesAlmacen;
		
		
		
		
		
	}public List<OLote> getSumLotesPorAlmacenCreados(int id){
		
		List<OLote> lotesAlmacenCreados=new ArrayList<OLote>();
		
		Connection miconexion;
		try {
			miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
		
			String sql="SELECT SUM(KG),LOTE_MEZCLA FROM PROVISION WHERE ID_ALMACEN=? AND ACCION='AÑADIDO PARA PREMEZCLA' GROUP BY LOTE_MEZCLA";

			PreparedStatement mist=miconexion.prepareStatement(sql);
			
			mist.setInt(1,id);
			
			ResultSet rs=mist.executeQuery();
			
			while (rs.next()) {
				
				
				double kg=rs.getDouble(1);
				int lote=rs.getInt(2);
				
					
					
					
					OLote tempkg=new OLote(id,kg,lote,0);
					lotesAlmacenCreados.add(tempkg);
				}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error en consulta");
			e.printStackTrace();
		}
		
		
		
		return lotesAlmacenCreados;
		
	}
}
