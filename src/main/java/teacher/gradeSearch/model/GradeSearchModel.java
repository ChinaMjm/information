 package main.java.teacher.gradeSearch.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.database.LinkDatabase;

public class GradeSearchModel {

	List listAll = new ArrayList();
	public List search(String username) {
		// TODO Auto-generated method stub
		// 连接数据库
		LinkDatabase database = new LinkDatabase();
		database.start();
		String sql ="SELECT xueyuan,courseNumber,courseName,banji FROM courseone,paikeone WHERE courseName=course AND teacher=?";
		PreparedStatement statement;
		try {
			statement = database.connection.prepareStatement(sql);
			statement.setString(1, username);
			ResultSet resultset = statement.executeQuery();
			while(resultset.next()){
				List list = new ArrayList();
				String xueyuan = resultset.getString("xueyuan");
				String courseNumber = resultset.getString("courseNumber");
				String courseName = resultset.getString("courseName");
				String banji = resultset.getString("banji");
				list.add(xueyuan);
				list.add(courseName);
				list.add(courseNumber);
				list.add(banji);
				listAll.add(list);
			}
			database.connection.close();
		}	catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listAll;
	}

}
