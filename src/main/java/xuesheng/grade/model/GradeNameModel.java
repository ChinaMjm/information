package main.java.xuesheng.grade.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.database.LinkDatabase;

public class GradeNameModel {
	List list = new ArrayList();
	String sql = "select * from zhuanye where zhuanyedaihao=?";

	public List getName(String zhuanyedaihao) {
		// TODO Auto-generated method stub
		LinkDatabase database = new LinkDatabase();
		database.start();

		PreparedStatement statement;
		try {
			statement = database.connection.prepareStatement(sql);
			statement.setString(1, zhuanyedaihao);
			ResultSet resultset = statement.executeQuery();
			ResultSetMetaData metaData = resultset.getMetaData();
			while (resultset.next()) {

				for (int i = 0; i < metaData.getColumnCount(); i++) {
					// resultSet数据下标从1开始
					String s = resultset.getString(i + 1);
					if (s == null) {
						return list;
					}
					list.add(s);
				}
				return list;

			}
			database.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
