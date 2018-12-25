package cn.IQTest.Application.Dao;

import java.util.ArrayList;
import java.util.List;

import java.sql.*;

import cn.IQTest.Application.constant.TestSQL;
import cn.IQTest.Application.pojo.IQQuestion;

public class TestDao {

	private DaoUtil dao ;
	public TestDao() throws Exception {
		dao = DaoUtil.getInstance();
	}
	
	
	public List<IQQuestion> selectQuestion(){
		List<IQQuestion> result = new ArrayList<IQQuestion>();
		Connection conn = dao.getConn();
		Statement statement = null;
		try {
			statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery(TestSQL.SELECT_QUESTION);
			while(resultSet.next()) {
				IQQuestion q = new IQQuestion();
				q.setA(resultSet.getString("A"));
				q.setB(resultSet.getString("B"));
				q.setC(resultSet.getString("C"));
				q.setD(resultSet.getString("D"));
				q.setE(resultSet.getString("E"));
				q.setF(resultSet.getString("F"));
				q.setG(resultSet.getString("G"));
				q.setH(resultSet.getString("H"));
				q.setId(resultSet.getInt("id"));
				q.setAnswer(resultSet.getString("answer"));
				q.setType(resultSet.getString("type"));
				q.setQuestion(resultSet.getString("question"));
				result.add(q);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			dao.releaseConn(conn);
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	public boolean deleteQuestion(int id) {
		boolean result = false;
		Connection conn = dao.getConn();
		PreparedStatement prepareStatement = null;
		try {
			prepareStatement = conn.prepareStatement(TestSQL.DELECT_QUESTION);
			prepareStatement.setInt(1, id);
			result = prepareStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			dao.releaseConn(conn);
			try {
				prepareStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public boolean insertQuestion(IQQuestion iQQuestion) {
		Connection conn = dao.getConn();
		boolean result = false;
		PreparedStatement prepareStatement = null;
		try {
			prepareStatement = conn.prepareStatement(TestSQL.INSERT_QUESTION);
		    prepareStatement.setString(1,iQQuestion.getAnswer());
		    prepareStatement.setString(2, iQQuestion.getQuestion());
		    prepareStatement.setString(3, iQQuestion.getA());
		    prepareStatement.setString(4, iQQuestion.getB());
		    prepareStatement.setString(5, iQQuestion.getC());
		    prepareStatement.setString(6, iQQuestion.getD());
		    prepareStatement.setString(7, iQQuestion.getE());
		    prepareStatement.setString(8, iQQuestion.getF());
		    prepareStatement.setString(9, iQQuestion.getG());
		    prepareStatement.setString(10, iQQuestion.getH());
		    prepareStatement.setString(11, iQQuestion.getType());
		    result = prepareStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			dao.releaseConn(conn);
			try {
				prepareStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
		
	}
}
