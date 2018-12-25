package cn.IQTest.Application.Controllor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminController extends HttpServlet {

	
	@Override
	//获得servlet对象
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	@Override
	//保存与更新资源
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = "sheen";
		String password = "123456";
		String a =req.getParameter("username");
		String b = req.getParameter("password");
		if(a!=null&&b!=null&&req.getParameter("username").equals(username)&&req.getParameter("password").equals(password)) {
			req.getRequestDispatcher("/WEB-INF/MyJsp.jsp").forward(req, resp);
		}else {
			req.setAttribute("message", "用户名或者密码错误");
			req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
		}
		
		
	}
	
}

