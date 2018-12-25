package cn.IQTest.Application.Controllor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.IQTest.Application.Service.IQQuestionService;

public class SelectIQQuestionControllor extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		IQQuestionService iq = new IQQuestionService();
		String json = iq.getQuestion();
		response.setCharacterEncoding("utf-8");
    	request.setCharacterEncoding("utf-8");
    	response.setContentType("application/json; charset=utf-8");
    	response.getWriter().write(json);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doGet(req, resp);
    }   
}
