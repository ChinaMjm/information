package main.java.xuesheng.grade.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.login.bean.User;
import main.java.xuesheng.grade.model.GradeModel;
import main.java.xuesheng.grade.model.GradeNameModel;

public class GradeController extends HttpServlet {

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
		User user = (User) session.getAttribute("user");
		String username = user.getUsername();
		String zhuanyedaihao = user.getZhuanyedaihao();
		List listValue = new GradeModel().getGrade(username,zhuanyedaihao);
		List listName = new GradeNameModel().getName(zhuanyedaihao);
		session.setAttribute("listValue", listValue);
		session.setAttribute("listName", listName);
		request.getRequestDispatcher("grade-show.jsp").forward(request, response);		
	}

	

}
