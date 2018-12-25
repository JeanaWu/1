package cn.IQTest.Application.Controllor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.IQTest.Application.Service.GiveScore;

public class ScoreController extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setCharacterEncoding("utf-8");
    	request.setCharacterEncoding("utf-8");
    	String age = request.getParameter("age");
    	int num = Integer.parseInt(request.getParameter("num"));
    	double score = GiveScore.get(age, num);
    	String[] res = GiveScore.getGrade(score).split("&");
    	String json = "{\"iq\":\""+res[0]+"\",\"des\":\""+res[1]+"\"}";
    	response.setContentType("application/json; charset=utf-8");
    	response.getWriter().write(json);
	}
}
