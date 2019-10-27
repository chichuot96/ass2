package fpt.aptech.t1902E.assignment2.connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	private final static String url="jdbc:mysql://localhost:3306/manage_school?serverTimezone=UTC";
	private final static String name="root";
	private final static String password="";
	   public static Connection getConnect(){
	        Connection con = null;
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            con=DriverManager.getConnection(url,name,password);
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	      return con;
	    }
	    
}
