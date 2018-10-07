package main.java.sys.course.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.course.bean.PaikeOne;
import main.java.course.model.CourseModel;
import main.java.course.model.ListModel;

public class SysCourseController extends HttpServlet {

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


		  //���÷���������ı���ΪUTF-8
	    request.setCharacterEncoding("UTF-8");
	    //��������������������html,������utf-8�ı������鿴������ݡ�
	    response.setContentType("text/html; charset=utf-8");
		
		HttpSession session3 = request.getSession();
		String banji = request.getParameter("banji");
		System.out.println(banji);
		List list = new CourseModel().getCourse(banji);
		PaikeOne[][] arr = new ListModel().changeList(list);
		session3.setAttribute("arr", arr);	
		request.getRequestDispatcher("course-show.jsp").forward(request, response);
	}

}
