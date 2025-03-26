package com.training.junit;

public class UserManager {
	
	private int userCount;

	public int getUserCount() {
		return userCount;
	}

	public void setUserCount(int userCount) {
		this.userCount = userCount;
	}
	
	public int addUser(String user) {
		return userCount++;
	}
	
	public void reset() {
		userCount = 0;
	}
	

}
