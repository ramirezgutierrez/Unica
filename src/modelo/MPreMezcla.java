package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import controlador.OLote;
import controlador.OPreMezcla;

public class MPreMezcla {
	
	public void setOrden(OPreMezcla orden) {
		Connection miconexion;
		try {
			miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
			
			String sql="INSERT INTO ORDEN_PREMEZCLA(COD_ORDEN,EMPLEADO,KG,FECHA,ALMACEN_DESTINO,LOTE_MEZCLA)"+
			"VALUES(?,?,?,?,?,?)";
			PreparedStatement mist=miconexion.prepareStatement(sql);
			
			mist.setInt(1,orden.getCodOrd());
			mist.setInt(2,orden.getEmpleado());
			mist.setDouble(3,orden.getKg());
			
			
			java.util.Date fechautil= new java.util.Date();
			fechautil=orden.getFecha();
			java.sql.Date fechasql=new java.sql.Date(fechautil.getTime()); 
			
			mist.setDate(4,fechasql);
			
			mist.setInt(5,orden.getAlmacenDestino());
			
			mist.setInt(6, orden.getLotePreM());
			
			mist.execute();
			
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("error en consulta");
		e.printStackTrace();
	}
	
	}
	
	
	
	
	
	
	public ArrayList getListaAlmacen() {
		
		ArrayList lista =new ArrayList();
		
		try {
			Connection miconexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
			String sql="SELECT DISTINCT ID_ALMACEN FROM PROVISION";
			Statement mist=miconexion.createStatement();
			ResultSet rs=mist.executeQuery(sql);
			while(rs.next()) {
				
				lista.add(rs.getInt(1));
				
				
			}
			rs.close();
			miconexion.close();
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		return lista;
		
		
		
		
		
	}
	
	public ArrayList  getListaLotes(int idAlmacen) {
		
		ArrayList listaLotes = new ArrayList();
		
		try {
			Connection miconexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
			String sql="SELECT DISTINCT LOTE FROM PROVISION WHERE ID_ALMACEN=?";
			
			PreparedStatement mist=miconexion.prepareStatement(sql);
			mist.setInt(1, idAlmacen);
			
			ResultSet rs=mist.executeQuery();
			
			while(rs.next()) {
				
				listaLotes.add(rs.getInt(1));
				
				
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		return listaLotes;
		
		
	}

	public String getEnvase(int lote) {
		String tipoEnvase="";
		
		try {
		Connection miconexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
		String sql="SELECT ENVASE FROM ORDEN_COMPRA WHERE LOTE=?";
		PreparedStatement mist=miconexion.prepareStatement(sql);
		mist.setInt(1, lote);
		
		ResultSet rs=mist.executeQuery();
		while(rs.next()) {
			
			tipoEnvase=rs.getString(1);
			
			
			
		}
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return tipoEnvase;
		
	}
	public double getKgAlmacen(int lote, int almacen) {
		
		double kg=0;
		double kgrest=0;
		
		try {
			Connection miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
		
		String sql="SELECT KG  FROM PROVISION WHERE LOTE=? AND ID_ALMACEN=? AND (ACCION='AÑADIDO' OR ACCION='AÑADIDO POR TRASPASO' OR ACCION='SUSTRAIDO POR TRASPASO') ";

		PreparedStatement mist=miconexion.prepareStatement(sql);
		
		mist.setInt(1, lote);
		mist.setInt(2, almacen);
		
		ResultSet rs=mist.executeQuery();
		
		while(rs.next()){
			
		kg=kg+rs.getDouble(1);	
			
			
			
		}
		
		System.out.println(kg);
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
		Connection miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
		
		String sql1="SELECT KG  FROM PROVISION WHERE LOTE=? AND ID_ALMACEN=? AND ACCION='SUSTRAIDO PARA PREMEZCLA'";
		
		PreparedStatement mist1=miconexion.prepareStatement(sql1);
		
		
		mist1.setInt(1, lote);
		mist1.setInt(2, almacen);
		ResultSet rs1=mist1.executeQuery();
		
		
		
		while(rs1.next()) {
			
			kgrest=kgrest+rs1.getDouble(1);
			
			
			
		}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println(kgrest);
		return kg+kgrest;
	}
	
	
	
}
