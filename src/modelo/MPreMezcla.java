package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MPreMezcla {
	
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
	
	
	
}
