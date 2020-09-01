package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import controlador.OLote;
import controlador.OLoteN;
import controlador.OOrdenLimpia;



public class MOrdenLimpia {

	public void setOrdenLimpia(OOrdenLimpia orden) {
		
		Connection miconexion;
		try {
			miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
			
			String sql="INSERT INTO ORDEN_LIMPIA(COD_ORDEN,EMPLEADO,KG,LOTE_MEZCLA,FECHA,DEPOSITO_ACONDICIONADO,PERDIDA_LIMPIA)"
					+ "VALUES(?,?,?,?,?,?,?)";
			PreparedStatement mist=miconexion.prepareStatement(sql);
			
			mist.setInt(1, orden.getCodOrden());
			mist.setInt(2, orden.getEmpleado());
			mist.setDouble(3, orden.getKg());
			mist.setInt(4, orden.getLoteMezcla());
			
			java.util.Date fechautil= new java.util.Date();
			fechautil=orden.getFecha();
			java.sql.Date fechasql=new java.sql.Date(fechautil.getTime()); 
			
			
			mist.setDate(5,fechasql);
			mist.setInt(6, orden.getDepAcondicionado());
			
			mist.setDouble(7, orden.getMerma());
			
			mist.execute();
			
		
			miconexion.close();
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error en consulta");
			e.printStackTrace();
		}
		
		
			
			
			
			
			
		}
		
		
	public List<OLoteN> getLotesMezcla(){
		
		List<OLoteN> listaLotesM=new ArrayList<OLoteN>();
		
		Connection miconexion;
		try {
			miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
			Statement mist=miconexion.createStatement();
			
			ResultSet rs=mist.executeQuery("SELECT DISTINCT LOTE_MEZCLA FROM PROVISION");
		
			while(rs.next()) {
				
				
				int lote=rs.getInt(1);
				
				
				OLoteN temp=new OLoteN(lote,"CREADO");
				listaLotesM.add(temp);
			}
			rs.close();
			Statement mist2=miconexion.createStatement();
			
			ResultSet rs2=mist2.executeQuery("SELECT DISTINCT LOTE FROM PROVISION ");
			
			while(rs2.next()) {
				
				
				int lote=rs2.getInt(1);
				
			
				
				OLoteN temp=new OLoteN(lote,"COMPRADO");
				listaLotesM.add(temp);
			}
			
			miconexion.close();
			rs.close();
			rs2.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error en consulta");
			e.printStackTrace();
		}
		
		
		
		
		return listaLotesM;
		
		
		
		
		
		
	}
public List<OLote>  getkgLotecreado(int lote) throws SQLException {
		
		
		
		List<OLote> lotesMezclados=new ArrayList<>();//guardamos en esta lista todos los lotes que han servido para mezclarse
		
		int cuentaAlmacen;
		double cuentaKg;
		int loteM;
				
		Connection miconexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
		
		//alamacenamos todas las partes del lote que han servido para una mezcla
		
		String sql="SELECT ID_ALMACEN,SUM(KG) FROM PROVISION WHERE LOTE_MEZCLA=? AND ACCION='AÑADIDO PARA PREMEZCLA' GROUP BY ID_ALMACEN";

		PreparedStatement mist=miconexion.prepareStatement(sql);
		
		mist.setInt(1, lote);
		
		ResultSet rs=mist.executeQuery();
		
		while (rs.next()) {
			
			cuentaAlmacen=rs.getInt(1);
			cuentaKg=rs.getDouble(2);
			loteM=lote;
			
			OLote temp=new OLote(cuentaAlmacen,cuentaKg,loteM,0);
			lotesMezclados.add(temp);
			
			
		}
		
		
		miconexion.close();
		rs.close();
	
		
		
		return lotesMezclados;
}


	public List<OLote> getKgLoteComprado(int lote)throws SQLException {
	
	List<OLote> lotesMezclados=new ArrayList<>();//guardamos en esta lista todos los lotes que han servido para mezclarse
	
	int cuentaAlmacen;
	double cuentaKg;
	int loteM;
			
	Connection miconexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
	
	
	
	String sql="SELECT ID_ALMACEN,SUM(KG) FROM PROVISION WHERE LOTE=? AND (ACCION='AÑADIDO' OR ACCION='SUSTRAIDO PARA PREMEZCLA'"
			+ " OR ACCION='AÑADIDO POR TRASPASO' OR ACCION='SUSTRAIDO POR TRASPASO')GROUP BY ID_ALMACEN";

	PreparedStatement mist=miconexion.prepareStatement(sql);
	
	mist.setInt(1, lote);
	
	ResultSet rs=mist.executeQuery();
	
	while (rs.next()) {
		
		cuentaAlmacen=rs.getInt(1);
		cuentaKg=rs.getDouble(2);
		loteM=lote;
		
		OLote temp=new OLote(cuentaAlmacen,cuentaKg,loteM,0);
		lotesMezclados.add(temp);
		
		
	}
	miconexion.close();
	rs.close();
	
	

	
	
	return lotesMezclados;
}
	public void SetLimpiaProvision(controlador.OOrdenLimpiaProvision trasp) {
		double provision=0;
		
		Connection miconexion;
		
		try {
			
			miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
			
			String sql="SELECT PROVISION FROM PROVISION WHERE ID_ALMACEN=?";
			PreparedStatement mist=miconexion.prepareStatement(sql);
			mist.setInt(1, trasp.getId_alm());
			ResultSet rs=mist.executeQuery();
			while(rs.next()){
				provision=rs.getDouble(1);
				
			}
			
		
			
			String sql2="INSERT INTO PROVISION(ID_ALMACEN,LOTE,KG,ACCION,PROVISION,ID_TRANSACCION,LOTE_MEZCLA)"+
					"VALUES(?,?,?,?,?,?,?)";
			PreparedStatement mist2=miconexion.prepareStatement(sql2);
			
			mist2.setInt(1, trasp.getId_alm());
			
			mist2.setInt(2, trasp.getLote_comprado());
			mist2.setDouble(3,-trasp.getKg());
			mist2.setString(4,  "SUSTRAIDO PARA LIMPIA ");
			mist2.setDouble(5, provision-trasp.getKg());
			mist2.setInt(6, 0);
			mist2.setInt(7, trasp.getLote_mezcla());
			
		
		
			mist2.execute();
		
		
			miconexion.close();
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("error en consulta");
		e.printStackTrace();
	}finally {
		
	}
	}

}
