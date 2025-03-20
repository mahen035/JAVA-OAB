package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcDemo {

	public static void main(String[] args) {
		
		   // String url = jdbc:oracle:thin:@localhost:1521:FREE
		    String url = "jdbc:postgresql://localhost:5432/testdb";
	        String username = "postgres";
	        String password = "pass123";
			try {
			  Class.forName("org.postgresql.Driver");
	        // Connect to the database
	          Connection connection = DriverManager.getConnection(url, username, password);
	          if(connection != null) {
	        	  System.out.println("Connected Successfully");
	          }
	          else {
	        	  System.out.println("Unable to Connect!!");
	          }
			}
			catch(Exception e) {
				System.out.println("Exception");
			}
	}

}
