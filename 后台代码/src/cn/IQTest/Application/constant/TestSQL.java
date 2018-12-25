package cn.IQTest.Application.constant;

public class TestSQL {

	public static String SELECT_QUESTION ="select id,answer,question,A,B,C,D,E,F,G,H,type from iqtest order by type asc,id asc";
	public static String INSERT_QUESTION="insert into iqtest(answer,question,A,B,C,D,E,F,G,H,type) values(?,?,?,?,?,?,?,?,?,?,?)";
	public static String DELECT_QUESTION = "delete from iqtest where id=?";
	
}
