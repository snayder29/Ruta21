package Conexion;

import java.sql.*;

public class conection {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
	
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectionURL = "jdbc:sqlserver://snayderbryan.database.windows.net:1433;databaseName=Ruta_21;user=snayder@snayderbryan;password=Espartan117;encrypt=true;trustServerCertificate=false;loginTimeout=30";
			
			Connection connection = null;
			
			try {
				Connection con = DriverManager.getConnection(connectionURL);
				
				System.out.println("nos conectamos" + con);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
	}		

}
