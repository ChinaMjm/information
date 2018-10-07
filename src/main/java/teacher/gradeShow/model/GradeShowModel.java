package main.java.teacher.gradeShow.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.database.LinkDatabase;

public class GradeShowModel {
	
	List showAllList = new ArrayList();
	public List show(String banji, String xueyuan, String course) {
		// TODO Auto-generated method stub

		String sql="select username,realname,"+course+" from "+xueyuan+" where banji=?";
		LinkDatabase database = new LinkDatabase();
		database.start();
		PreparedStatement statement;
		try {
			statement = database.connection.prepareStatement(sql);
			statement.setString(1, banji);
			ResultSet resultset = statement.executeQuery();
			while(resultset.next()){
				List showList = new ArrayList();
				String username = resultset.getString("username");
				String realname = resultset.getString("realname");
				String course1 = resultset.getString(course);
				showList.add(username);
				showList.add(realname);
				showList.add(course1);
				showAllList.add(showList);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return showAllList;
	}

}
