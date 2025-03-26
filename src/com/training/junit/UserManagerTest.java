package com.training.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserManagerTest {
	
	private UserManager userManager;

	@BeforeEach
	public void setUp() {
		userManager = new UserManager();
		System.out.println("User object created");
	}
	
	@AfterEach
	public void tearDown() {
		userManager.reset();
		System.out.println("User count reset successfully");
	}
	@Test
	public void addUserTest() {
		userManager.addUser("John");
		userManager.addUser("Ali");
		assertEquals(2, userManager.getUserCount(), "User added successfully");
	}
	
	@Test
	public void resetTest() {
		userManager.addUser("John");
		userManager.reset();
		assertEquals(0, userManager.getUserCount());
	}

}
