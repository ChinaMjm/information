package main.java.xuesheng.grade.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.database.LinkDatabase;

import com.mysql.jdbc.Connection;

public class GradeModel {

	String sql = "select * from ";
	Connection conn;
	List list = new ArrayList();//采用集合的方法将学生的成绩保存下来
	public List getGrade(String username, String zhuanyedaihao) {
		// TODO Auto-generated method stub
		sql = sql + zhuanyedaihao +" where username =" + username;
		System.out.println(sql);
		// 连接数据库
		LinkDatabase database = new LinkDatabase();
		database.start();

		PreparedStatement statement;
		try {
			statement = database.connection.prepareStatement(sql);
			ResultSet resultset = statement.executeQuery();
			ResultSetMetaData metaData = resultset.getMetaData();
			while (resultset.next()) {
				 for (int i = 0; i < metaData.getColumnCount(); i++) {  
		                // resultSet数据下标从1开始  
		               String s = resultset.getString(i + 1);
		               list.add(s);
		          }  
				 return list;
			}
			database.connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}
}
