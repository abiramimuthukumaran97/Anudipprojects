package com.example.bookstoremanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.bookstoremanage.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	@Query(value =  "select * from User where email =?" , nativeQuery = true)
	User findByEmail(String email);

	
	
	
}

