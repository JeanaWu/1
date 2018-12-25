package cn.IQTest.Application.Dao;

import java.sql.*;
import java.util.concurrent.ArrayBlockingQueue;
/**
 * 
 * @author Sheen
 */

public class DaoUtil {

	//连接数据库，这是驱动，用户名等
	private static final int SIZE = 10;
	private static DaoUtil daoutil=null;
	private static ArrayBlockingQueue<Connection> connQueue = new ArrayBlockingQueue<Connection>(SIZE);
	private String root;
	private String user;
	private String password;
	private DaoUtil() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		this.user="root";
		this.password="huanhuansama";//sheen
		this.root = "jdbc:mysql://47.106.155.131:3306/iqtest";
	}
	
	//数据库连接
	private   Connection createConn() throws SQLException {
		return  DriverManager.getConnection(root,user,password);
	}
	
	@SuppressWarnings("finally")
	public Connection getConn()  {
		Connection conn =null;
		try {
			conn = connQueue.take();
		}finally {
			return conn;
		}
	}
	
	public void releaseConn(Connection conn)   {
		try {
			connQueue.put(conn);
		} catch (InterruptedException e) {

		}
	}
	
	//单例模式
	public static synchronized DaoUtil getInstance() throws Exception {
		if(daoutil==null) {
			synchronized(DaoUtil.class) {
				if(daoutil==null) {
					daoutil = new DaoUtil();
					for(int i=0;i<10;i++) {
						Connection conn = daoutil.createConn();
						connQueue.put(conn);
					}
				}
			}
		}
		return daoutil;
	}
}
