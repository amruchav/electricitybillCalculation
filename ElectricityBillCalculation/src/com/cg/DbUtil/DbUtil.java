package com.cg.DbUtil;
import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class DbUtil {
	static Connection conn=null;
	
	public static Connection getConnection()
	{
		try
		{
			InitialContext ic=new InitialContext();
			DataSource ds=(DataSource) ic.lookup("java:/jdbc/OracleDS");
			System.out.println("hii");
			conn =ds.getConnection();
			System.out.println(conn);
		}
		catch(SQLException e){
			
			
		}
		catch(NamingException e){
			
		}
		return conn;
}
}
