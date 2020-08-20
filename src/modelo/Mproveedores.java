package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import controlador.Oproveedores;


public class Mproveedores {



public List<Oproveedores> getProveedores() throws Exception{
	
	List<Oproveedores> proveedores=new ArrayList<>();
	
	//establecer conexion
	
	Connection miconexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
	
	//crear sentencia sql
	
	Statement mist=miconexion.createStatement();
	
	//ejecutar sentencia sql
	
	ResultSet rs=mist.executeQuery("SELECT * FROM PROVEEDORES");
	
	//recorrer rs
	
	while(rs.next()) {
		
		int rid=rs.getInt(1);
		String rnombre=rs.getString(2);
		String rrazon=rs.getString(3);
		String rcorreo=rs.getString(10);
		String rdni=rs.getString(4);
		String rdireccion=rs.getString(5);
		String rpoblacion=rs.getString(6);
		String rciudad=rs.getString(7);
		String rpais=rs.getString(8);
		int rcp=rs.getInt(9);
		int rfax=rs.getInt(11);
		int rtlfp=rs.getInt(12);
		int rtlfs=rs.getInt(13);
		String robservaciones=rs.getString(14);
		
		
		Oproveedores tempoprov=new Oproveedores(rid,rnombre,rrazon,rdni,rdireccion,rpoblacion,rciudad,rpais,rcp,rcorreo,rfax,rtlfp,rtlfs,robservaciones);
		proveedores.add(tempoprov);
		
		
	}
	return proveedores;
	
	
	
	
}

public void  setProveedor(Oproveedores nuevoprov) {
	
Connection miconexion;
try {
	miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
	
	String sql="INSERT INTO PROVEEDORES (ID,NOMBRE,RAZON_SOCIAL,DNI,DIRECCION,POBLACION,CIUDAD,PAIS,CP,CORREO,FAX,NTELP,NTELS,OBSERVACIONES)"+
	"VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	PreparedStatement mist=miconexion.prepareStatement(sql);
	mist.setInt(1, nuevoprov.getId());
	mist.setString(2, nuevoprov.getNombre());
	mist.setString(3, nuevoprov.getRazon());
	mist.setString(4, nuevoprov.getDni());
	mist.setString(5, nuevoprov.getDireccion());
	mist.setString(6, nuevoprov.getPoblacion());
	mist.setString(7, nuevoprov.getCiudad());
	mist.setString(8, nuevoprov.getPais());
	mist.setInt(9, nuevoprov.getCp());
	mist.setString(10, nuevoprov.getCorreo());
	mist.setInt(11, nuevoprov.getFax());
	mist.setInt(12, nuevoprov.getTelp());
	mist.setInt(13, nuevoprov.getTels());
	mist.setString(14, nuevoprov.getObservaciones());

	mist.execute();
	
	System.out.println("cliente insertado");
	
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	System.out.println("error en consulta");
	e.printStackTrace();
}
	
}
}