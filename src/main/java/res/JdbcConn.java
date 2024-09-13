package res;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConn {
	static String driver ="com.mysql.cj.jdbc.Driver";
	static String url="jdbc:mysql://localhost:3306/tmf_restaurant";
	static String username="root";
	static String password="0000";
	public static Connection getCon() throws Exception
	{
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, username, password);
		return con;
		 
		 
	 }


}
