package main.java.teacher.gradeShow.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.teacher.gradeShow.model.GradeShowModel;

public class GradeShowController extends HttpServlet {

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String banji = request.getParameter("banji");
		String xueyuan = request.getParameter("xueyuan");
		String course = request.getParameter("course");
		HttpSession session = request.getSession();
		List showAllList = new GradeShowModel().show(banji, xueyuan, course);
		session.setAttribute("showAllList", showAllList);
		session.setAttribute("course", course);
		request.getRequestDispatcher("teacherShow.jsp").forward(request,
				response);
	}

}
