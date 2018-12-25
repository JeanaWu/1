package cn.IQTest.Application.Controllor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.IQTest.Application.Service.IQQuestionService;

public class DeleteIQQuestionControllor extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8");
		String[] ids = request.getParameterValues("items");
        if(ids!=null&&ids.length!=0) {
        	IQQuestionService iq = new IQQuestionService();
        	for(String id:ids) {
        		iq.deleteQuestion(id);
        	}	
        }
        request.getRequestDispatcher("/WEB-INF/MyJsp.jsp").forward(request, response);
		
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doGet(req, resp);
    }   
}
