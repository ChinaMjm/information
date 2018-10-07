package main.java.sys.xuesheng.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import main.java.database.LinkDatabase;
import main.java.login.bean.User;

public class XueshengModel {

	String sql = "insert into userone(username,password,sex,realname,address,phone,professional,ruxue_time,chusheng_time,grade,zhuanye,zhuanyedaihao,banji,role) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	public void input(User user) {
		// TODO Auto-generated method stub
		LinkDatabase database = new LinkDatabase();
		database.start();
		
		PreparedStatement statement;
		try {
			statement = database.connection.prepareStatement(sql);
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getSex());
			statement.setString(4, user.getRealname());
			statement.setString(5, user.getAddress());
			statement.setString(6, user.getPhone());
			statement.setString(7, user.getProfessional());
			statement.setString(8, user.getRuxueTime());
			statement.setString(9, user.getChushengTime());
			statement.setString(10, user.getGrade());
			statement.setString(11, user.getZhuanye());
			statement.setString(12, user.getZhuanyedaihao());
			statement.setString(13, user.getBanji());
			statement.setString(14, user.getRole());
			statement.execute();
			database.connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
