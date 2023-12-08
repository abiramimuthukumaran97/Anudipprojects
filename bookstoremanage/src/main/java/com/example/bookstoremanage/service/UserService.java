package com.example.bookstoremanage.service;

import com.example.bookstoremanage.entities.User;

public interface UserService { 
	User login(String email, String password );


	User addUser(User user);

	User updateDb(String email,User user);

	void deleteDb(String email);
}

