package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import controlador.ODepositoAcondicionado;

public class MDepositoAcondicionado {

	
	public void setDeposito(ODepositoAcondicionado nuevoDeposito) {
		
		
		
		
		Connection miconexion;
		try {
			miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
			
			String sql="INSERT INTO DEPOSITO_ACONDICIONADO (ID,TIPO,CAPACIDAD)"+
			"VALUES(?,?,?)";
			
			PreparedStatement mist=miconexion.prepareStatement(sql);
			mist.setInt(1, nuevoDeposito.getId());
			mist.setString(2, nuevoDeposito.getTipo());
			mist.setDouble(3, nuevoDeposito.getCapacidad());
			
			mist.execute();
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error en consulta");
			e.printStackTrace();
		}
			
		
		
		
		
	}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

