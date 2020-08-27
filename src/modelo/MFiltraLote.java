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
		
		
		int cuenta=1;
		int i=0;
		Connection miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
		
		String sql="SELECT DISTINCT ID_ALMACEN FROM PROVISION WHERE LOTE=? AND LOTE_MEZCLA=0";

		PreparedStatement mist=miconexion.prepareStatement(sql);
		
		mist.setInt(1, lote);
		
		ResultSet rs=mist.executeQuery();
		
		while(rs.next()) {
			
			cuenta++;
			
		}
		
		int [] almacenes=new int[cuenta];
		rs=mist.executeQuery();
		while(rs.next()) {
			
			 almacenes[i]=rs.getInt(1);
		
		
		i++;
		
		}
		
		
		
		/*
		 * rescatar sumatorio de kg por almacen
		 */
		
		String sql2="SELECT ID_ALMACEN,KG FROM PROVISION WHERE LOTE=? AND LOTE_MEZCLA=0 OR ACCION='SUSTRAIDO PARA PREMEZCLA'";

		PreparedStatement mist2=miconexion.prepareStatement(sql2);
		
		mist2.setInt(1, lote);
		
		ResultSet rs2=mist2.executeQuery();
		int alm=-1;
		double contadorkg=0;
		
		List<OLote> kgpa = new ArrayList<OLote>();
		
		
		for(int j=0;j<almacenes.length;j++) {
			
			
			
			if(alm!=almacenes[j]) {
				
				
			alm=almacenes[j];
			rs2=mist2.executeQuery();
			while(rs2.next()) {
				
				try {
					if (rs2.getInt(1)==alm) {//y igual a lotemezcla
						contadorkg=contadorkg+rs2.getDouble(2);
						
						
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}OLote tempkg=new OLote(alm,contadorkg,lote,0);
			kgpa.add(tempkg);
			
			contadorkg=0;
			}
		}
		
		
		
		
		return kgpa;
		
	}
	
	/**
	 * metodo para sacar los valores pertenecientes a otros lotes
	 * 
	 */
	

	public List<OLote>  getkgLoteDestino(int lote) throws SQLException {
		
		List<OLote> listaD = new ArrayList<OLote>();
		
		List<OLote> lotesMezclados=new ArrayList<>();
		
		int cuentaAlmacen;
		double cuentaKg;
		int loteM;
				
		Connection miconexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
		
		String sql="SELECT ID_ALMACEN,KG,LOTE_MEZCLA FROM PROVISION WHERE LOTE=? AND ACCION='AÑADIDO PARA PREMEZCLA'";

		PreparedStatement mist=miconexion.prepareStatement(sql);
		
		mist.setInt(1, lote);
		
		ResultSet rs=mist.executeQuery();
		
		while (rs.next()) {
			
			cuentaAlmacen=rs.getInt(1);
			cuentaKg=rs.getDouble(2);
			loteM=rs.getInt(3);
			
			OLote temp=new OLote(cuentaAlmacen,cuentaKg,lote,loteM);
			lotesMezclados.add(temp);
			
			
		}
		
		
		
		
		return lotesMezclados;
}
}
