package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import controlador.OOrdenLimpia;

public class MOrdenLimpia {

	public void setOrdenLimpia(OOrdenLimpia orden) {
		
		Connection miconexion;
		try {
			miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
			
			String sql="INSERT INTO ORDEN_LIMPIA(COD_ORDEN,EMPLEADO,KG,LOTE_MEZCLA,FECHA,ALMACEN_DESTINO,ALMACEN_ORIGEN,PERDIDA_LIMPIA)"
					+ "VALUES(?,?,?,?,?,?,?,?)";
			PreparedStatement mist=miconexion.prepareStatement(sql);
			
			mist.setInt(1, orden.getCodOrden());
			mist.setInt(2, orden.getEmpleado());
			mist.setDouble(3, orden.getKg());
			mist.setInt(4, orden.getLoteMezcla());
			
			java.util.Date fechautil= new java.util.Date();
			fechautil=orden.getFecha();
			java.sql.Date fechasql=new java.sql.Date(fechautil.getTime()); 
			
			
			mist.setDate(5,fechasql);
			mist.setInt(6, orden.getAlmDestino());
			mist.setInt(7, orden.getAlmOrigen());
			mist.setDouble(8, orden.getMerma());
			
			mist.execute();
			
		
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error en consulta");
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
}
