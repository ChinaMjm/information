package main.java.sys.courseIn.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.sys.courseIn.bean.TeacherCourseOne;
import main.java.sys.courseIn.model.ClassroomModel;
import main.java.sys.courseIn.model.CourseInSearchModel;

public class CourseInSearcheController extends HttpServlet {

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
		
		String course = request.getParameter("course");
		String grade = request.getParameter("grade");
		List courselist =new CourseInSearchModel().search(course,grade);
		List classlist = new ClassroomModel().searchRoom();
		HttpSession session = request.getSession();
		session.setAttribute("courselist", courselist);
		session.setAttribute("classlist", classlist);
		session.setAttribute("grade", grade);
		
		request.getRequestDispatcher("course-in.jsp").forward(request,response);
	}

}
