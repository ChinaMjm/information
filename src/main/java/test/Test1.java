package main.java.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.database.LinkDatabase;

import com.mysql.fabric.Response;

public class Test1 extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		
//		Timestamp ts = new Timestamp(System.currentTimeMillis());  
//	    DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
//	    String tsStr = sdf.format(ts);  
//	    System.out.println(tsStr);
		
//		String startTime = "2017-10-5";
//		String endTime = "2019-5-9";
//		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//		  format.setLenient(false);
//		  //要转换字符串 str_test
//		  String str_test ="2011-04-24"; 
//		  try {
//		   Timestamp startTime1 = new Timestamp(format.parse(startTime).getTime());
//		   Timestamp endTime1 = new Timestamp(format.parse(endTime).getTime());
//		   System.out.println(startTime1);
//		   System.out.println(endTime1);
//		  } catch (Exception e) {
//		   // TODO Auto-generated catch block
//		   
//		  }

		/**
		  //设置服务器输出的编码为UTF-8
	    response.setCharacterEncoding("UTF-8");
	    //告诉浏览器输出的内容是html,并且以utf-8的编码来查看这个内容。
	    response.setContentType("text/html; charset=utf-8");
	    PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		out.write("<script>alert('更新成功!');</script>");
		*/
		String sql = "UPDATE userone SET ruxue_time =? WHERE id = ?";
		String time = "2015-1-1";
		LinkDatabase database = new LinkDatabase();
		database.start();
		PreparedStatement statement;
		try {
			statement = database.connection.prepareStatement(sql);
			statement.setString(1, time);
			statement.setInt(2, 1);
			statement.execute();
			System.out.println("sucess");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
