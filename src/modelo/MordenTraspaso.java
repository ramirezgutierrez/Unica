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

import controlador.OOrdenTraspaso;




public class MordenTraspaso {

	


	public List<OOrdenTraspaso> getOrdenTraspaso() throws Exception{
		
		List<OOrdenTraspaso> traspasos=new ArrayList<>();
			
			//establecer conexion
			
			Connection miconexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
			
			//crear sentencia sql
			
			Statement mist=miconexion.createStatement();
			
			//ejecutar sentencia sql
			
			ResultSet rs=mist.executeQuery("SELECT * FROM ORDEN_TRASVASE");
			
			//recorrer rs
			
			while(rs.next()) {
				
				int rcodord=rs.getInt(1);
				int rempleado=rs.getInt(2);
				double rkg=rs.getInt(3);
				int rlote=rs.getInt(4);
				Date rfecha=rs.getDate(5);
				int ralmorigen=rs.getInt(6);
				int ralmdestino=rs.getInt(7);
				
				
				
				
				OOrdenTraspaso tempOrdenT=new OOrdenTraspaso(rcodord,rempleado,rkg,rlote,rfecha,ralmorigen,ralmdestino);
				traspasos.add(tempOrdenT);
				
				
			}
			return traspasos;

		}
			public void  setOrdenTraspaso(OOrdenTraspaso nuevoTraspaso) {
				
				Connection miconexion;
				try {
					miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
					
					String sql="INSERT INTO ORDEN_TRASVASE(COD_ORDEN,EMPLEADO,KG,LOTE,FECHA,ALMACEN_ORIGEN,ALMACEN_DESTINO)"+
					"VALUES(?,?,?,?,?,?,?)";
					
					PreparedStatement mist=miconexion.prepareStatement(sql);
					mist.setInt(1,nuevoTraspaso.getCodord());
					mist.setInt(2,nuevoTraspaso.getEmpleado());
					mist.setDouble(3,nuevoTraspaso.getKg());
					mist.setInt(4, nuevoTraspaso.getLote());
					
					java.util.Date fechautil= new java.util.Date();
					fechautil=nuevoTraspaso.getFecha();
					java.sql.Date fechasql=new java.sql.Date(fechautil.getTime()); 
					
					mist.setDate(5,fechasql);
					
					mist.setInt(6,nuevoTraspaso.getAlmOrigen());
					mist.setInt(7,nuevoTraspaso.getAlmDestino());
					
					mist.execute();
					
					System.out.println("orden traspaso insertado");
					
					
					/*
					 * 
					 * aqui insertamos los kg en el almacen destino.
					 * 
					 * 
					 * 
					 */
					
					String sql3="SELECT * FROM PROVISION WHERE ID_ALMACEN=?";
					PreparedStatement mist3=miconexion.prepareStatement(sql3);
					mist3.setInt(1, nuevoTraspaso.getAlmDestino());
					
					ResultSet rs2=mist3.executeQuery();
					
					double provision=0;
					while(rs2.next()) {
						 provision=rs2.getDouble(5);
					}
					
					String sql2="INSERT INTO PROVISION(ID_ALMACEN,LOTE,KG,ACCION,PROVISION,ID_TRANSACCION)"+
					
							"VALUES(?,?,?,?,?,?)";
					
					PreparedStatement mist2=miconexion.prepareStatement(sql2);
					
					mist2.setInt(1, nuevoTraspaso.getAlmDestino());
					mist2.setInt(2, nuevoTraspaso.getLote());
					mist2.setDouble(3, nuevoTraspaso.getKg());
					mist2.setString(4,  "AÑADIDO POR TRASPASO");
					mist2.setDouble(5, provision+nuevoTraspaso.getKg());
					mist2.setInt(6, 0);
					
					mist2.execute();
					
					
					/*
					 * 
					 * aqui restamos los kg en el almacen origen.
					 * 
					 * 
					 * 
					 */
					
					
					String sql4="SELECT * FROM PROVISION WHERE ID_ALMACEN=?";
					PreparedStatement mist4=miconexion.prepareStatement(sql4);
					mist4.setInt(1, nuevoTraspaso.getAlmOrigen());
					
					ResultSet rs3=mist4.executeQuery();
					
					
					
					 provision=0;
					
					while(rs3.next()) {
						 provision=rs3.getDouble(5);
					}
					
					
					
					
					
					mist2.setInt(1, nuevoTraspaso.getAlmOrigen());
					mist2.setInt(2, nuevoTraspaso.getLote());
					mist2.setDouble(3, -nuevoTraspaso.getKg());
					mist2.setString(4,  "SUSTRAIDO POR TRASPASO");
					mist2.setDouble(5, provision-nuevoTraspaso.getKg());
					mist2.setInt(6, 0);
					
					mist2.execute();
					
					
					
					
					
					
					System.out.println("orden insertado");
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("error en consulta");
					e.printStackTrace();
				}
					
				}

			public void setPreMezclaProvision(OOrdenTraspaso preMezcla,int nuevoLote,int almDestino) {
				
				
				double provision=0;
				double provision2=0;
				Connection miconexion;
				try {
					miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
					
					String sql2="SELECT PROVISION FROM PROVISION WHERE LOTE=?";
					PreparedStatement mist=miconexion.prepareStatement(sql2);
					mist.setInt(1, preMezcla.getLote());
					ResultSet rs=mist.executeQuery();
					while(rs.next()){
						provision=rs.getDouble(1);
						
					}
					
					String sql="INSERT INTO PROVISION(ID_ALMACEN,LOTE,KG,ACCION,PROVISION,ID_TRANSACCION,LOTE_MEZCLA)"+
							"VALUES(?,?,?,?,?,?,?)";
					PreparedStatement mist2=miconexion.prepareStatement(sql);
					
					mist2.setInt(1, preMezcla.getAlmOrigen());
					
					mist2.setInt(2, preMezcla.getLote());
					mist2.setDouble(3, -preMezcla.getKg());
					mist2.setString(4,  "SUSTRAIDO PARA PREMEZCLA ");
					mist2.setDouble(5, provision-preMezcla.getKg());
					mist2.setInt(6, 0);
					mist2.setInt(7, nuevoLote);
				
				
				
					mist2.execute();
				
					
					
					/*
					 * AÑADIR CONJUNTO DE LOTE
					 */
					String sql3="SELECT PROVISION FROM PROVISION WHERE LOTE_MEZCLA=?";
					PreparedStatement mist3=miconexion.prepareStatement(sql3);
					mist3.setInt(1,nuevoLote);
					ResultSet rs3=mist3.executeQuery();
					
					while(rs3.next()) {
						
						provision2=rs3.getDouble(1);
						System.out.println(provision2+"--------");
					}
					
					String sql4="INSERT INTO PROVISION(ID_ALMACEN,LOTE,KG,ACCION,PROVISION,ID_TRANSACCION,LOTE_MEZCLA)"+
							"VALUES(?,?,?,?,?,?,?)";
					
					PreparedStatement mist4=miconexion.prepareStatement(sql4);
					
					mist2.setInt(1, almDestino);
					
					mist2.setInt(2, preMezcla.getLote());
					mist2.setDouble(3, preMezcla.getKg());
					mist2.setString(4,  "AÑADIDO PARA PREMEZCLA ");
					mist2.setDouble(5, provision2+preMezcla.getKg());
					System.out.println(preMezcla.getKg());
					mist2.setInt(6, 0);
					mist2.setInt(7, nuevoLote);
					mist2.execute();
					
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("error en consulta");
				e.printStackTrace();
			}

			}
			public int getCodigoSiguiente() {
				int codigo=0;
				
				Connection miconexion;
				try {
					miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
					String sql="SELECT ID_TRANSACCION FROM PROVISION";
					
					Statement mist=miconexion.createStatement();
					
					ResultSet rs=mist.executeQuery(sql);
					
					while(rs.next()) {
						
						codigo=rs.getInt(1)+1;
						
					}
					
					
					
					
				}catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("error en consulta");
					e.printStackTrace();
				}
				
				
				
				
				
				// TODO Auto-generated method stub
				return codigo;
			}
			
			
			
			
}