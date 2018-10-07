package main.java.banzhuren.search.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.database.LinkDatabase;

public class SearchModel2 {

	public List show(String zhuanye) {
		List list2 = new ArrayList();
		// TODO Auto-generated method stub
		String sql = "select * from ";
		sql = sql + zhuanye;
		LinkDatabase database = new LinkDatabase();
		database.start();
		PreparedStatement statement;
		try {
			statement = database.connection.prepareStatement(sql);
			ResultSet resultset = statement.executeQuery();
			ResultSetMetaData metaData = resultset.getMetaData();
			System.out.println(metaData.getColumnCount()+"数量");
			while (resultset.next()) {
				List list = new ArrayList();
				for (int i = 0; i < metaData.getColumnCount(); i++) {
					// resultSet数据下标从1开始
					String s = resultset.getString(i + 1);
					list.add(s);
				}
				list2.add(list);
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list2;

	}
}
