package cn.IQTest.Application.Controllor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.IQTest.Application.Service.IQQuestionService;
import cn.IQTest.Application.pojo.IQQuestion;

public class InsertIQQuestionControllor extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		IQQuestionService iq = new IQQuestionService();
		request.setCharacterEncoding("utf-8");
		String answer = request.getParameter("answer");
		String A = request.getParameter("a");
		String B = request.getParameter("b");
		String C = request.getParameter("c");
		String D = request.getParameter("d");
		String E = request.getParameter("e");
		String F = request.getParameter("f");
		String G = request.getParameter("g");
		String H = request.getParameter("h");
		String question = request.getParameter("question");
		String type = request.getParameter("type");
		IQQuestion  q = new IQQuestion();
		q.setQuestion(question);
		q.setA(A);
		q.setB(B);
		q.setC(C);
		q.setD(D);
		q.setE(E);
		q.setF(F);
		q.setG(G);
		q.setH(H);
		q.setType(type);
		q.setAnswer(answer);
	    boolean result = iq.insertQuestiion(q);
	    request.getRequestDispatcher("/WEB-INF/MyJsp.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	doGet(req, resp);
    }   
}
