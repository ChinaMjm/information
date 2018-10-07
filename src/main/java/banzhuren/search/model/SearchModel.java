package main.java.banzhuren.search.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.database.LinkDatabase;
import main.java.xuesheng.grade.model.GradeModel;
import main.java.xuesheng.grade.model.GradeNameModel;

public class SearchModel {
	

	String zhuanye;
	public String search(String username) {
		String sql ="select * from banzhuren where username=?";
		// TODO Auto-generated method stub
		LinkDatabase database = new LinkDatabase();
		database.start();
		PreparedStatement statement;
		try {
			statement = database.connection.prepareStatement(sql);
			statement.setString(1, username);
			ResultSet resultset = statement.executeQuery();
			
			while(resultset.next()){
			
				zhuanye = resultset.getString("zhuanye");
				
				return zhuanye;	
			}
			database.connection.close();
		}	catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return zhuanye;	
		
	}


}
