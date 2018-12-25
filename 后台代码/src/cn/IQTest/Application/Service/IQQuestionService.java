package cn.IQTest.Application.Service;

import java.util.List;

import cn.IQTest.Application.Dao.TestDao;
import cn.IQTest.Application.pojo.IQQuestion;

public class IQQuestionService {

	private static  TestDao dao = null;
	static {
		try {
			dao = new TestDao();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public List<IQQuestion> getQustionList(){
		return dao.selectQuestion();
	}
	public String getQuestion(){
		List<IQQuestion> list= dao.selectQuestion();
		StringBuffer sb = new StringBuffer("{\"problem\":[");
		for(int i=0;i<list.size();i++) {
			IQQuestion q = list.get(i);
			String question = "{ \"question\":"+"\""+q.getQuestion() +"\""
                    + ",\"A\":"+"\""+q.getA()+"\""
                    + ",\"B\":"+"\""+q.getB()+"\""
                    + ",\"C\":"+"\""+q.getC()+"\""
                    + ",\"D\":"+"\""+q.getD()+"\""
                    + ",\"E\":"+"\""+q.getE()+"\""
                    + ",\"F\":"+"\""+q.getF()+"\""
                    + ",\"G\":"+"\""+q.getG()+"\""
                    + ",\"H\":"+"\""+q.getH()+"\""
                    + ",\"answer\":"+"\""+q.getAnswer()+"\""
                    + ",\"type\":"+"\""+q.getType()+"\""
                    +"}";
			sb.append(question);
			if(i!=list.size()-1) {
				sb.append(",");
			}
		}
		sb.append(" ]}");
		return sb.toString();
	}
	public boolean deleteQuestion(String id) {
		boolean result = dao.deleteQuestion(Integer.parseInt(id));
		return result;
	}
	public boolean insertQuestiion(IQQuestion iQQuestion) {
		boolean result = dao.insertQuestion(iQQuestion);
		return result;
	}
}
