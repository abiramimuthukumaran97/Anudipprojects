package com.example.bookstoremanage.serviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.example.bookstoremanage.entities.User;
import com.example.bookstoremanage.exception.ResourceNotFoundException;
import com.example.bookstoremanage.repository.UserRepo;
import com.example.bookstoremanage.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public User login(String email, String password) {
		 User s = userRepo.findByEmail(email);
		 
		 if(s!=null) {
			 if(s.getPassword().equals(password)) {
				 return s;
			 }else {
				throw new ResourceNotFoundException();
			}
		 }else {
			 throw new ResourceNotFoundException();
		 }
	  
	}

	@Override
	public User addUser(User user) {
		return  userRepo.save(user);
	}

	@Override
	public User updateDb(String email,User user) {
		
		
		User s1 = userRepo.findByEmail(email);
		
		if(s1!=null) {
			s1.setFirstName(user.getFirstName());   
			s1.setLastName(user.getLastName());
			s1.setPassword(user.getPassword());
		return userRepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}

	@Override
	public void deleteDb(String email) {
	
		
		User s2 = userRepo.findByEmail(email);
		
		if(s2!=null) {
			userRepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
	}

	
	
}