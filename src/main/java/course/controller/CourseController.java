package main.java.course.controller;

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
import main.java.login.bean.User;

public class CourseController extends HttpServlet {

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

		HttpSession session = request.getSession();
		
		User user = (User)session.getAttribute("user");
		String banji = user.getBanji();
		
		List list = new CourseModel().getCourse(banji);
		PaikeOne[][] arr = new ListModel().changeList(list);
		session.setAttribute("arr", arr);
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		for(int i=0;i<7;i++){
			for(int j=0;j<7;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		request.getRequestDispatcher("course-show.jsp").forward(request, response);
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

		
	}

}
