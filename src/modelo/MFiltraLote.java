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
				//System.out.println("resultset almacen:"+rs2.getInt(1)+" kg: "+rs2.getDouble(2)+" lote: "+lote);
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
		
		
		
		
		return kgpa;
		
	}
	
	/**
	 * metodo para sacar los valores pertenecientes a otros lotes
	 * 
	 */
	

	public List<OLote>  getkgLoteDestino(int lote) throws SQLException {
		
		System.out.println(lote);
		
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
			System.out.println(rs.getInt(1)+" "+rs.getDouble(2)+"  "+rs.getInt(3));
			cuentaAlmacen=rs.getInt(1);
			cuentaKg=rs.getDouble(2);
			loteM=rs.getInt(3);
			
			OLote temp=new OLote(cuentaAlmacen,cuentaKg,lote,loteM);
			lotesMezclados.add(temp);
			System.out.println(lotesMezclados.size());
			
		}
		
		
		System.out.println(lotesMezclados.size());
		ArrayList<OLote> lotesFiltrados=new ArrayList<OLote>();
		
		
		
		//for (OLote oLote : lotesMezclados) {
			
			/*for (ListIterator<OLote> iter = lotesMezclados.listIterator(); iter.hasNext(); ) {
			    OLote temp = iter.next();
			    System.out.println(temp.getAlmacen()+"  "+temp.getKg()+"  "+temp.getLoteH()+"  "+temp.getloteDest());
			
			    iter
			    
			   /* if(iter.hasNext()) {
			    	
			    	if(element.getAlmacen()==iter.next().getAlmacen() && 
			    			element.getloteDest()==iter.next().getloteDest() && element.getLoteH()==iter.next().getLoteH() ) {
			    		
			    		OLote temp=new OLote(element.getAlmacen(),(element.getKg()+iter.next().getKg()),element.getLoteH(),element.getloteDest());
			    		lotesFiltrados.add(temp);
			    		System.out.println(lotesFiltrados.size());
			    	}
			    	
			    	
			    }*/
			    
			    
			    
			/*for (OLote oLote2 : lotesMezclados) {
				if(it.hasNext()) {
					it.next();
				}
				if(oLote.getAlmacen()==oLote2.getAlmacen() && oLote.getloteDest()==oLote2.getloteDest() 
						&& oLote.getLoteH()==oLote2.getLoteH()) {
					

					double kgx=oLote.getKg()+oLote2.getKg();
					
					OLote tempn=new OLote(oLote.getAlmacen(),kgx,oLote.getLoteH(),oLote.getloteDest());
					
					lotesFiltrados.add(tempn);
					System.out.println("lote añadido: "+oLote.getAlmacen()+"  "+kgx+" "+oLote.getLoteH()+"  "+oLote.getloteDest());
					
				}else {
					
					
					
				}
			}
			
			
			
			
			
		}*/
		
		
		
		
		int contador=0;
		boolean insertado=false;
		
		//System.out.println("num de lotes mezclados"+lotesMezclados.size()+"\n"+lotesMezclados.get(0)+"\n"+lotesMezclados.get(1)+"\n"+lotesMezclados.get(2));
			
		if(lotesMezclados.size()!=1) {
		for(int i=0;i<lotesMezclados.size();i++) {
		
				insertado=false;
				System.out.println("vuelta a primero i="+(i)+ " cantidad de lotes: "+lotesMezclados.size()+"\n"+"analizando--  alamcen: "
				+lotesMezclados.get(i).getAlmacen()+" kg: "+lotesMezclados.get(i).getKg()+" lote dest: "
						+lotesMezclados.get(i).getloteDest());
			
			
			for (int j=0;j<lotesMezclados.size();j++) {//empieza en j=1 para empezar con el segundo elemento de la lista
				
				contador++;
				
				System.out.println("vueltas que da dentro del segundo "+contador);
				if(i==j) {
					//break;
			}else if(lotesMezclados.get(i).getAlmacen()==lotesMezclados.get(j).getAlmacen() && lotesMezclados.get(i).getloteDest()==lotesMezclados.get(j).getloteDest()
						&& lotesMezclados.get(i).getLoteH()==lotesMezclados.get(j).getLoteH()) {
					
					
					
					double kgx=lotesMezclados.get(i).getKg()+lotesMezclados.get(j).getKg();
					
					OLote tempn=new OLote(lotesMezclados.get(i).getAlmacen(),kgx,lotesMezclados.get(i).getLoteH(),lotesMezclados.get(i).getloteDest());
					
					
					
					lotesFiltrados.add(tempn);
					//lotesMezclados.remove(j);
					
					//i=i+1;//adelanta el primer buble for ya que el suiente elemento ya a sido sumado.
					System.out.println("j= "+j);
					System.out.println("num lotes fitrados "+lotesFiltrados.size());
					i=i+1;
					insertado=true;
					//break;
					 
					
					
				}else {
					
				
			}
		}if(insertado==false)lotesFiltrados.add(lotesMezclados.get(i));
		System.out.println("num lotes fitrados"+lotesFiltrados.size());	
			
				
			}
		}else {
			
			/*lotesFiltrados=(ArrayList<OLote>) lotesMezclados;
			System.out.println(lotesMezclados.size()+"\n"+lotesFiltrados.size());*/
			//System.out.println("lote: "+lotesFiltrados.get(1).getAlmacen()+"  "+lotesFiltrados.get(1).getKg()+"  "+lotesFiltrados.get(1).getLoteH()+"  "+lotesFiltrados.get(1).getloteDest());
		}
		
			
			
			
		
		
		//return lotesMezclados;
		return lotesFiltrados;
}
}
