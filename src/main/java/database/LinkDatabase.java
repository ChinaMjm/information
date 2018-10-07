package main.java.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class LinkDatabase {
	
	
	public static Connection connection;
	
	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void start() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {		
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/information","root","manjiaman");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
}
