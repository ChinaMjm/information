package main.java.sys.courseIn.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.database.LinkDatabase;
import main.java.sys.courseIn.bean.Classroom;

public class ClassroomModel {

	public List searchRoom() {
		// TODO Auto-generated method stub
		String sql = "select * from classroom";
		List list = new ArrayList();
		// 连接数据库
		LinkDatabase database = new LinkDatabase();
		database.start();
		PreparedStatement statement;
		try {
			statement = database.connection.prepareStatement(sql);
			ResultSet resultset = statement.executeQuery();
			while (resultset.next()) {
				String address = resultset.getString("address");
				Classroom classroom = new Classroom();
				classroom.setAddress(address);
				list.add(classroom);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}

}
