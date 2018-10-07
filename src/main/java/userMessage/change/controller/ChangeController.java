package main.java.userMessage.change.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.login.bean.User;
import main.java.userMessage.change.model.ChangeModel;

public class ChangeController extends HttpServlet {

	
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
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String chushengTime = request.getParameter("chushengTime");
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		String role = user.getRole();
		String username = user.getUsername();
		new ChangeModel().change(password,address,phone,chushengTime,role,username);
		out.write("<script>alert('修改信息成功!');</script>");
	}

}
