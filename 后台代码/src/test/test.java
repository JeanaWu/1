package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.IQTest.Application.constant.TestSQL;
import cn.IQTest.Application.pojo.IQQuestion;



public class test {

	public static void main(String arg[]) throws ClassNotFoundException, SQLException {
		
		
		/*Class.forName("com.mysql.jdbc.Driver");
		String user="root";
	    String password="huanhuansama";//sheen
		String root = "jdbc:mysql://47.106.155.131:3306/iqtest";
		Connection conn = DriverManager.getConnection(root,user,password);
		
		java.sql.Statement statement = conn.createStatement();
		//ResultSet r = statement.executeQuery(sql);
		List<IQQuestion> l = new ArrayList<>();
		while(r.next()) {
			IQQuestion i = new IQQuestion();
			
			
			l.add(i);
		}
		statement.close();
		String sql_ = "update iqtest set answer=? where id=? ";
		PreparedStatement p = conn.prepareStatement(sql_);
		p.setString(1,"E" );
		p.setInt(2, 72);
		p.execute();
		p.close();*/
	}
}
