package com.training.jdbc.repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class UserRepository {
	public String findUserName(String userId) {
		String userName = null;
		String url = "jdbc:postgresql://localhost:5432/testdb";
        String username = "postgres";
        String password = "pass123";
	
		try {
		  Class.forName("org.postgresql.Driver");
        // Connect to the database
          Connection connection = DriverManager.getConnection(url, username, password);
          
          //Statement stmt = connection.createStatement();
          PreparedStatement pstmt = connection.prepareStatement("Select * from employee where emp_id=?");
          pstmt.setString(1, userId);
          ResultSet rs = pstmt.executeQuery();
          //ResultSet rs = stmt.executeQuery("Select * from employee where emp_name='Rauf'");
          while(rs.next()) {
        	  //System.out.println("ID:"+rs.getString(1)+" Name: "+rs.getString(2));
        	  userName = rs.getString(2);
          }
          
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return userName;
	}

}
