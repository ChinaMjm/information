package main.java.banzhuren.search.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.banzhuren.search.model.SearchModel;
import main.java.banzhuren.search.model.SearchModel2;
import main.java.login.bean.User;
import main.java.xuesheng.grade.model.GradeNameModel;

public class SearchController extends HttpServlet {

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
		String zhuanye = new SearchModel().search(user.getUsername());
		System.out.println(zhuanye);
		List listName = new GradeNameModel().getName(zhuanye);
		List listTest = new SearchModel2().show(zhuanye);
//		for(int i=0;i<listName.size();i++){
//			System.out.print(listName.get(i)+" ");
//		}
//		System.out.println();
//		for(int i=0;i<listTest.size();i++){
//			System.out.print(listTest.get(i)+" ");
//		}
		
		System.out.println(listTest.get(0));
		System.out.println(listTest.get(1));
		System.out.println(listTest);
		
		session.setAttribute("listName", listName);
		session.setAttribute("listTest", listTest);
		request.getRequestDispatcher("banzhuren.jsp").forward(request, response);		
		
	}



}
