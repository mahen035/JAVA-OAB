package com.training.jdbc.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.training.jdbc.repository.UserRepository;

public class UserServiceTest {
	
	private UserRepository repository;
	private UserService service;
	@BeforeEach
	public void setUp() {
		repository = mock(UserRepository.class);
		service = new UserService(repository);
	}
	@Test
	public void displayUserNameTest() {
		
		String mockUser = "John";
        //when(repository.findUserName("A101").thenReturn(mockUser));
		when(repository.findUserName("A101")).thenReturn(mockUser);
     
		String result = service.displayUserName("A101");
        // Assert: Verify the result
		assertEquals("John", result);
  		
	}

}
