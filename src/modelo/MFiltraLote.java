package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import controlador.OLote;



public class MFiltraLote {
	
	public double getkgcomprados(int lote) {
		double kg=0;
		Connection miconexion;
		try {
			miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
		
		String sql="SELECT KG FROM ORDEN_COMPRA WHERE LOTE=?";
		
		PreparedStatement mist=miconexion.prepareStatement(sql);
		
		mist.setInt(1, lote);
		
		ResultSet rs=mist.executeQuery();
		
		while(rs.next()) {
			
			kg=rs.getDouble(1);
		}
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return kg;

		
		
		
		
}
	public List<OLote>  getkgalmacen(int lote) throws SQLException {
		
		
		int [] almacenes=null;
		int i=0;
		Connection miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
		
		String sql="SELECT ID_ALMACEN FROM PROVISION WHERE LOTE=?";

		PreparedStatement mist=miconexion.prepareStatement(sql);
		
		mist.setInt(1, lote);
		
		ResultSet rs=mist.executeQuery();
		
		while(rs.next()) {
			
			almacenes[i]=rs.getInt(1);
		
		
		i++;
		
		}
		
		Arrays.sort(almacenes);
		
		/*
		 * rescatar sumatorio por kg en almacen
		 */
		
		String sql2="SELECT ID_ALMACEN,KG FROM PROVISION WHERE LOTE=?";

		PreparedStatement mist2=miconexion.prepareStatement(sql);
		
		mist.setInt(1, lote);
		
		ResultSet rs2=mist.executeQuery();
		int alm=-1;
		double contadorkg=0;
		
		List<OLote> kgpa = new ArrayList<OLote>();
		
		
		for(int j=0;j<almacenes.length;j++) {
			
			if(alm!=almacenes[j]) {
			alm=almacenes[j];
			
			while(rs.next()) {
				
				try {
					if (rs.getInt(1)==alm) {
						
						contadorkg=contadorkg+rs.getDouble(2);
						
						//OLote tempkg=new Olote(alm)
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			OLote tempkg=new OLote(alm,contadorkg);
			kgpa.add(tempkg);
			
			}
		}
		
		
		
		
		return kgpa;
		
	}
}
