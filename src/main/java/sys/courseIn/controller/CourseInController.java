package main.java.sys.courseIn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.sys.courseIn.bean.Paike;
import main.java.sys.courseIn.model.CourseInModel;

public class CourseInController extends HttpServlet {

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
		
		  //设置服务器输出的编码为UTF-8
	    response.setCharacterEncoding("UTF-8");
	    //告诉浏览器输出的内容是html,并且以utf-8的编码来查看这个内容。
	    response.setContentType("text/html; charset=utf-8");
	    PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		String grade = request.getParameter("grade");
		String banji = request.getParameter("banji");
		String teacherName = request.getParameter("teacherName");
		String course = request.getParameter("course");
		String address = request.getParameter("classroom");
		String startTime = request.getParameter("startTime");
		String endTime = request.getParameter("endTime");
		String week = request.getParameter("week");
		String timeNumber = request.getParameter("timeNumber");
		String xueyuan = request.getParameter("xueyuan");
		
		Paike paike = new Paike();
		paike.setAddress(address);
		paike.setBanji(banji);
		paike.setCourse(course);
		paike.setEndTime(endTime);
		paike.setStartTime(startTime);
		paike.setTeacher(teacherName);
		paike.setTimeNumber(timeNumber);
		paike.setDayTime(week);
		paike.setXueyuan(xueyuan);
		
		System.out.println("年级是"+grade);
		new CourseInModel().in(paike,grade);
		  
		out.write("<script>alert('添加课程成功，请重新查询课表验证');</script>");
//		request.getRequestDispatcher("search.jsp").forward(request,response);

	}

}
