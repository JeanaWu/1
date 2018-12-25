package cn.IQTest.Application.Controllor;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.IQTest.Application.Service.IQQuestionService;
import cn.IQTest.Application.pojo.IQQuestion;

public class SelectIQQuestionListControllor extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		IQQuestionService iq = new IQQuestionService();
		response.setCharacterEncoding("utf-8");
    	request.setCharacterEncoding("utf-8");
		List<IQQuestion> list = iq.getQustionList();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/WEB-INF/MyJsp.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doGet(req, resp);
    }
}
