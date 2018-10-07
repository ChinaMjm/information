package main.java.userMessage.change.model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import main.java.database.LinkDatabase;

public class ChangeModel {

	String sql;
	public void change(String password, String address, String phone,
			String chushengTime, String role, String username) {
		// TODO Auto-generated method stub
	
		String table;
		LinkDatabase database = new LinkDatabase();
		database.start();
		if(role.equals("Ñ§Éú")){
			table="userone";
		}else{
			table="systeacher";
		}
		sql = "update " + table + " set password=?,address=?,phone=?,chusheng_time=? where username=?";

		try {
			PreparedStatement statement = database.connection.prepareStatement(sql);
			
			statement.setString(1, password);
			statement.setString(2,address);
			statement.setString(3, phone);
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				java.util.Date d = sdf.parse(chushengTime);
				statement.setDate(4, new java.sql.Date(d.getTime()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("³ö´í");
			}
			statement.setString(5, username);
			statement.executeUpdate();
			System.out.println(sql);
			database.connection.close();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
	
	}

}
