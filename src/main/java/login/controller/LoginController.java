package main.java.login.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.login.bean.User;
import main.java.login.model.LoginModel;

import sun.misc.UCDecoder;

public class LoginController extends HttpServlet {


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		  //���÷���������ı���ΪUTF-8
	    response.setCharacterEncoding("UTF-8");
	    //��������������������html,������utf-8�ı������鿴������ݡ�
	    response.setContentType("text/html; charset=utf-8");
	    PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	     
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		user = new LoginModel().login(user);
		
		if(user.getRealname()!= null){
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			String role = user.getRole();
			System.out.println("rang��"+role);
			session.setAttribute("role", role);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else{
			out.print("<script language='JavaScript'>alert('������û�����������������');location.href='/information/HUI/login.jsp';</script>");
		}
	}

}
