package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import controlador.OLote;


/**
 * clase que filtra el seguimiento de los lotes
 * @author ramir
 *
 */
public class MFiltraLote {
	
	/**
	 * metodo que rescata el total de kg comprados de un lote
	 * @param lote
	 * @return double kgTotales
	 */
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
		
		miconexion.close();
		rs.close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return kg;

		
		
		
		
}
	/**
	 * rescata los kg del lote que aún no han sido mezclados
	 * @param lote
	 * @return List<OLote> devuelve un ArrayList de objetos OLote 
	 * @throws SQLException lanza excepción sql debido a las consultas parametrizadas
	 */
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
		
		String sql2="SELECT ID_ALMACEN,KG FROM PROVISION WHERE LOTE=? AND (LOTE_MEZCLA=0 OR ACCION='SUSTRAIDO PARA PREMEZCLA')";

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
					if (rs2.getInt(1)==alm) {                //y igual a lotemezcla
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
		
		
		miconexion.close();
		rs.close();
		rs2.close();
		
		return kgpa;
		
	}
	
	
	
/**
 * metodo para obtener una lista de lotes que han sido mezclados en los silos
 * @param lote
 * @return List<OLote> retorna un ArrayList de objetos de tipo OLote
 * @throws SQLException lanza excepción sql debido a las consultas parametrizadas
 */
	public List<OLote>  getkgLoteDestino(int lote) throws SQLException {
		
		
		
		List<OLote> lotesMezclados=new ArrayList<>();//guardamos en esta lista todos los lotes que han servido para mezclarse
		
		int cuentaAlmacen;
		double cuentaKg;
		int loteM;
				
		Connection miconexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
		
		//alamacenamos todas las partes del lote que han servido para una mezcla
		
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
		
		
		
		ArrayList<OLote> lotesFiltrados=new ArrayList<OLote>();//lista donde acabaran filtrados los lotes provenientes de lotesMezclados
		
		
	
		
			
		boolean insertado=false;//bandera
		
			
		if(lotesMezclados.size()!=1) {
		for(int i=0;i<lotesMezclados.size();i++) {
			
			
				insertado=false;//bandera para indicar que ha habido al menos una coincidencia y cambiar el sumatorio
				
			   
			   double kgx=lotesMezclados.get(i).getKg();//variable iniciada para el sumatorio en el bucleanidado
			   
			
			for (int j=0;j<lotesMezclados.size();j++) {//empieza en j=1 para empezar con el segundo elemento de la lista
				
				
				
				
				if(i==j) {//condicion para que no se compare a si mismo
					
			}else if(lotesMezclados.get(i).getAlmacen()==lotesMezclados.get(j).getAlmacen() && lotesMezclados.get(i).getloteDest()==lotesMezclados.get(j).getloteDest()
						&& lotesMezclados.get(i).getLoteH()==lotesMezclados.get(j).getLoteH()) {
					
					
					
					
					 kgx=kgx+lotesMezclados.get(j).getKg();
					
					
					
					i=i+1;//aumenta la posicion para no comparar el siguiente elemento
					insertado=true;
					
					 
					
					
				}else {
					
				
			}

				 
		
				
		}
			if(insertado==true)	lotesFiltrados.add(new OLote(lotesMezclados.get(i).getAlmacen(),
					kgx,lotesMezclados.get(i).getLoteH(),lotesMezclados.get(i).getloteDest()));//inserta el sumatorio
			//de las coincidencias
			if(insertado==false)lotesFiltrados.add(lotesMezclados.get(i));//si no coincide es insertado sin cambios
			
				
			}
		}else {
			
			}
		
			
			
		miconexion.close();
		rs.close();
		
		
		
		
		return lotesFiltrados;
}
	public double  getkgLimpia(int lote) throws SQLException {
		
		double kgTotales=0;
		
		
        Connection miconexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
		
		//alamacenamos todas las partes del lote que han servido para una mezcla
		
		String sql="SELECT SUM(KG) FROM PROVISION WHERE (LOTE=? AND ACCION='SUSTRAIDO PARA LIMPIA')";

		PreparedStatement mist=miconexion.prepareStatement(sql);
		
		mist.setInt(1, lote);
		
		ResultSet rs=mist.executeQuery();
		
		
		
		while (rs.next()) {
			
			
			kgTotales=rs.getDouble(1);
		}
			
		
		
		
		
		
		return kgTotales;
	}
}
