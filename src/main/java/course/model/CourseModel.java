package main.java.course.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import main.java.course.bean.PaikeOne;
import main.java.database.LinkDatabase;

public class CourseModel {
																																																																																																																																																																																				
	String sql = "select * from paikeOne where banji = ";
	public List getCourse(String banji) {
		
		List list = new ArrayList();
		// TODO Auto-generated method stub
		// 连接数据库
		LinkDatabase database = new LinkDatabase();
		database.start();
		System.out.println("链接数据库");
		
		sql = sql + "'"+banji+"'";
		PreparedStatement statement;
		try {
			statement = database.connection.prepareStatement(sql);
			ResultSet resultset = statement.executeQuery();
			while(resultset.next()){
				int id = resultset.getInt("id");

				String teacher = resultset.getString("teacher");
				String course = resultset.getString("course");
				String classroom = resultset.getString("address");
				Timestamp startTime = resultset.getTimestamp("startTime");
				Timestamp endTime = resultset.getTimestamp("endTime");
				String week = resultset.getString("dayTime");
				int timeNumber = resultset.getInt("timeNumber");
								
				DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
				String startTime1 = sdf.format(startTime);
				String endTime1 = sdf.format(endTime);
				
				PaikeOne paikeOne = new PaikeOne();
				paikeOne.setId(id);
				paikeOne.setClassroom(classroom);
				paikeOne.setCourse(course);
				paikeOne.setEndTime(endTime1);
				paikeOne.setStartTime(startTime1);
				paikeOne.setTeacher(teacher);

				paikeOne.setTimeNumber(timeNumber);
				paikeOne.setWeek(week);
				
				
				list.add(paikeOne);
			}
		}	catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
