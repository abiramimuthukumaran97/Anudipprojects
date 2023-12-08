package com.example.bookstoremanage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.bookstoremanage.entities.Books;

@Repository
public interface BooksRepo extends JpaRepository<Books, Integer> {

	@Query(value =  "select * from Books where booksId =?" , nativeQuery = true)
	Books findBybooksId(int booksId);

	
	
	
}

