package com.training.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class JdbcDemo {

	public static void main(String[] args) {
		
		   // String url = jdbc:oracle:thin:@localhost:1521:FREE
//		    String url = "jdbc:postgresql://localhost:5432/testdb";
//	        String username = "postgres";
//	        String password = "pass123";
				
			try {
				Properties props = new Properties();
				FileInputStream input = new FileInputStream("db.properties");
				props.load(input);
				String url = props.getProperty("db.url");
				String username = props.getProperty("db.user");
				String password = props.getProperty("db.password");
				
			  Class.forName("org.postgresql.Driver");
	        // Connect to the database
	          Connection connection = DriverManager.getConnection(url, username, password);
	          
	          //Statement stmt = connection.createStatement();
	          PreparedStatement pstmt = connection.prepareStatement("Select * from employee where emp_name=?");
	          pstmt.setString(1, "Rauf");
	          ResultSet rs = pstmt.executeQuery();
	          //ResultSet rs = stmt.executeQuery("Select * from employee where emp_name='Rauf'");
	          while(rs.next()) {
	        	  System.out.println("ID:"+rs.getString(1)+" Name: "+rs.getString(2));
	          }
	          
			}
			catch(Exception e) {
				System.out.println(e);
			}
	}

}
