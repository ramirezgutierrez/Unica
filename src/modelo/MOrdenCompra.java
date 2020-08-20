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

import controlador.OrdenCompra;



public class MOrdenCompra {

	
	public List<OrdenCompra> getOrdenCompra() throws Exception{
		
		List<OrdenCompra> compras=new ArrayList<>();
			
			//establecer conexion
			
			Connection miconexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
			
			//crear sentencia sql
			
			Statement mist=miconexion.createStatement();
			
			//ejecutar sentencia sql
			
			ResultSet rs=mist.executeQuery("SELECT * FROM ORDEN_COMPRA");
			
			//recorrer rs
			
			while(rs.next()) {
				
				int rcod=rs.getInt(1);
				int rid=rs.getInt(2);
				double rkg=rs.getInt(3);
				int rlote=rs.getInt(4);
				double rkgrestantes=rs.getDouble(5);
				int ralmacen=rs.getInt(6);
				int rempleados=rs.getInt(7);
				String rmuestras=rs.getString(8);
				Date rfecha=rs.getDate(9);
				String rtipoGrano=rs.getString(10);
				String renvase=rs.getString(11);
				
				
				
				OrdenCompra temporden=new OrdenCompra(rcod,rid,rkg,rlote,rkgrestantes,ralmacen,rempleados,rmuestras,rfecha,rtipoGrano,renvase);
				compras.add(temporden);
				
				rs.close();
			}
			return compras;

		}
			public void  setOrdenCompra(OrdenCompra nuevaOrden) {
				
				Connection miconexion;
				try {
					miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
					
					String sql="INSERT INTO ORDEN_COMPRA(COD_ORDEN_COMPRA,ID_PROVEEDOR,KG,LOTE,KG_RESTANTES,ALMACEN,EMPLEADO,MUESTRAS,FECHA,TIPO_GRANO,ENVASE)"+
					"VALUES(?,?,?,?,?,?,?,?,?,?,?)";
					
					PreparedStatement mist=miconexion.prepareStatement(sql);
					mist.setInt(1,nuevaOrden.getCodCompra());
					mist.setInt(2,nuevaOrden.getIdProveedor());
					mist.setDouble(3,nuevaOrden.getKg());
					mist.setInt(4,nuevaOrden.getLote());
					mist.setDouble(5,nuevaOrden.getKgRestantes());
					mist.setInt(6,nuevaOrden.getAlmacen());
					mist.setInt(7,nuevaOrden.getEmpleado());
					mist.setString(8,nuevaOrden.getMuestras());
					java.util.Date fechautil= new java.util.Date();
							fechautil=nuevaOrden.getFecha();
							java.sql.Date fechasql=new java.sql.Date(fechautil.getTime()); 
					
					mist.setDate(9,fechasql);
					mist.setString(10,nuevaOrden.getTipoGrano());
					mist.setString(11,nuevaOrden.getEnvase());

					mist.execute();
					
					/*
					 * 
					 * aqui insertamos en el almacen los kg
					 * 
					 * 
					 * 
					 */
					
					String sql3="SELECT * FROM PROVISION WHERE ID_ALMACEN=?";
					PreparedStatement mist3=miconexion.prepareStatement(sql3);
					mist3.setInt(1, nuevaOrden.getAlmacen());
					
					ResultSet rs2=mist3.executeQuery();
					
					double provision=0;
					while(rs2.next()) {
						 provision=rs2.getDouble(5);
					}
					
					String sql2="INSERT INTO PROVISION(ID_ALMACEN,LOTE,KG,ACCION,PROVISION,ID_TRANSACCION)"+
					
							"VALUES(?,?,?,?,?,?)";
					
					PreparedStatement mist2=miconexion.prepareStatement(sql2);
					
					mist2.setInt(1, nuevaOrden.getAlmacen());
					mist2.setInt(2, nuevaOrden.getLote());
					mist2.setDouble(3, nuevaOrden.getKg());
					mist2.setString(4,  "AÑADIDO");
					mist2.setDouble(5, provision+nuevaOrden.getKg() );
					mist2.setInt(6, 0);
					
					mist2.execute();
					
					
					
					
					
					
					
					System.out.println("orden insertado");
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("error en consulta");
					e.printStackTrace();
				}
					
				}
}
