package main.java.sys.xuesheng.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.login.bean.User;
import main.java.sys.xuesheng.model.XueshengModel;

public class XueshengController extends HttpServlet {

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

		User user = new User();
		user.setAddress(request.getParameter("address"));
		user.setBanji(request.getParameter("banji"));
		user.setChushengTime(request.getParameter("chushengTime"));
		user.setGrade(request.getParameter("grade"));
		user.setPassword(request.getParameter("password"));
		user.setPhone(request.getParameter("phone"));
		user.setProfessional(request.getParameter("professional"));
		user.setRealname(request.getParameter("realname"));
		user.setRole("Ñ§Éú");
		user.setRuxueTime(request.getParameter("ruxueTime"));
		user.setSex(request.getParameter("sex"));
		user.setUsername(request.getParameter("username"));
		user.setZhuanye(request.getParameter("zhuanyedaihao"));
		user.setZhuanye(request.getParameter("zhuanye"));
		new XueshengModel().input(user);
	}

}
