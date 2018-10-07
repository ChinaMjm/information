package main.java.sys.courseIn.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import main.java.database.LinkDatabase;
import main.java.sys.courseIn.bean.Paike;

public class CourseInModel {

	public void in(Paike paike, String grade) {
		// TODO Auto-generated method stub
		String teacher = paike.getTeacher();
		String course = paike.getCourse();
		String dayTime = paike.getDayTime();
		String address = paike.getAddress();
		String startTime = paike.getStartTime();
		String endTime = paike.getEndTime();
		String timeNumber = paike.getTimeNumber();
		String banji = paike.getBanji();
		String xueyuan = paike.getXueyuan();

		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		format.setLenient(false);
		try {
			Timestamp startTime1 = new Timestamp(format.parse(startTime).getTime());
			Timestamp endTime1 = new Timestamp(format.parse(endTime).getTime());

			String table = "paikeone";
			if (grade.equals("大一")) {
				table = "paikeone";
			} else if (grade.equals("大二")) {
				table = "paiketwo";
			} else if (grade.equals("大三")) {
				table = "paikethree";
			} else if (grade.equals("大四")) {
				table = "paikefour";
			}
			// 连接数据库
			String sql = "insert into "
					+ table
					+ "(teacher,course,address,startTime,endTime,dayTime,timeNumber,banji,xueyuan) values(?,?,?,?,?,?,?,?,?)";
			System.out.println(sql);
			LinkDatabase database = new LinkDatabase();
			database.start();
			try {
				PreparedStatement statement = database.connection
						.prepareStatement(sql);
				statement.setString(1, teacher);
				statement.setString(2, course);
				statement.setString(3, address);
				statement.setTimestamp(4, startTime1);
				statement.setTimestamp(5, endTime1);
				statement.setString(6, dayTime);
				statement.setString(7, timeNumber);
				statement.setString(8, banji);
				statement.setString(9, xueyuan);

				statement.executeUpdate();
				database.connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
	}

}
