package main.java.sys.courseIn.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.TabableView;

import main.java.database.LinkDatabase;
import main.java.sys.courseIn.bean.TeacherCourseOne;

public class CourseInSearchModel {

	String sql = "select * from ";

	public List search(String course, String grade) {
		List list = new ArrayList();
		// TODO Auto-generated method stub
		if (grade.equals("大一")) {
			sql = sql + "teachercourseone ";
		} else if (grade.equals("大二")) {
			sql = sql + "teachercoursetwo ";
		} else if (grade.equals("大三")) {
			sql = sql + "teachercoursethree ";
		} else if (grade.equals("大三")) {
			sql = sql + "teachercoursefour ";
		}
		sql = sql + "where course =" + "'" + course + "'";
		// 连接数据库
		LinkDatabase database = new LinkDatabase();
		database.start();
		PreparedStatement statement;
		try {
			statement = database.connection.prepareStatement(sql);
			ResultSet resultset = statement.executeQuery();
			while(resultset.next()){
				int id = resultset.getInt("id");
				int teacherId = resultset.getInt("teacherId");
				String teacherName = resultset.getString("teacherName");
				int courseId = resultset.getInt("courseId");
				String course1 = resultset.getString("course");
				System.out.println(id+" "+teacherId+" "+ teacherName+" "+courseId+" "+course);
				
				//获取对象并给对象赋值
				TeacherCourseOne teacherCourseOne = new TeacherCourseOne();
				teacherCourseOne.setCourse(course);
				teacherCourseOne.setCourseId(courseId);
				teacherCourseOne.setId(id);
				teacherCourseOne.setTeacherId(teacherId);
				teacherCourseOne.setTeacherName(teacherName);
				//将对象存入list集合中作为返回值到controller层
				list.add(teacherCourseOne);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;	
	}

}
