package com.training.jdbc.service;

import com.training.jdbc.repository.UserRepository;

public class UserService {
	
	private UserRepository repository;
	 public UserService(UserRepository repository) {
	        this.repository = repository;
	    }
	public String displayUserName(String id) {
		String userName = repository.findUserName(id);
		return userName;
	}

}
