package modelo;
import java.sql.*;
public class ConectorBBDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
			Connection miconexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/harinera", "root", "");
			
			Statement mist=miconexion.createStatement();
			
			ResultSet rs=mist.executeQuery("SELECT * FROM PROVEEDORES");
			
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+"  "+ rs.getString(2)+"  "+rs.getString(3));
				
				
			}
			
			
			
			
			
			
			
		}catch(Exception e) {
			
		System.out.println( "estas jodido");
			e.printStackTrace();
		}
		
		
		
		
	}

}
