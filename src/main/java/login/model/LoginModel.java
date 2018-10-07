package main.java.login.model;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;

import com.mysql.jdbc.Connection;

import main.java.database.LinkDatabase;
import main.java.login.bean.User;

public class LoginModel {

	String sql = "select * from ";
	Connection conn;
	
	public User login(User user) {
		
		//连接数据库
		LinkDatabase database = new LinkDatabase();
		database.start();
		System.out.println("链接数据库");
		
		String username = user.getUsername();
		String password = user.getPassword();
		
		//加判断是大几的学生
		
		String table = new Judge().judge(username);
		sql = sql + table;
		System.out.println(sql);
		PreparedStatement statement;
		try {
			statement = database.connection.prepareStatement(sql);
			ResultSet resultset = statement.executeQuery();
			while(resultset.next()){
				String usernamejud = resultset.getString("username");
				String passwordjud = resultset.getString("password");
				int id = resultset.getInt("id");
				String sex = resultset.getString("sex");
				String realname = resultset.getString("realname");
				String address = resultset.getString("address");
				String grade = resultset.getString("grade");
				String role = resultset.getString("role");
				String banji = resultset.getString("banji");
				String professional = resultset.getString("professional");
				String zhuanye = resultset.getString("zhuanye");
				String zhuanyedaihao = resultset.getString("zhuanyedaihao");
				String phone = resultset.getString("phone");
				Date chushengTime2 = resultset.getDate("chusheng_time");
				String chushengTime = chushengTime2.toString();
				Date ruxueTime2 = resultset.getDate("ruxue_time");
				String ruxueTime = ruxueTime2.toString();
				
				if(username.equals(usernamejud) && password.equals(passwordjud)) {
					user.setAddress(address);
					user.setUsername(usernamejud);
					user.setPassword(passwordjud);
					user.setGrade(grade);
					user.setId(id);
					user.setRealname(realname);
					user.setSex(sex);
					user.setRole(role);
					user.setProfessional(professional);
					user.setBanji(banji);
					user.setZhuanye(zhuanye);
					user.setZhuanyedaihao(zhuanyedaihao);
					user.setPhone(phone);
					user.setChushengTime(chushengTime);
					user.setRuxueTime(ruxueTime);
					return user;
				}
			}
			database.connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
		
	}
	
	
}
