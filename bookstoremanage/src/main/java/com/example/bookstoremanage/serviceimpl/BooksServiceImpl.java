package com.example.bookstoremanage.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookstoremanage.entities.Books;
import com.example.bookstoremanage.entities.User;
import com.example.bookstoremanage.exception.ResourceNotFoundException;
import com.example.bookstoremanage.repository.BooksRepo;
import com.example.bookstoremanage.service.BooksService;

@Service
public class BooksServiceImpl implements BooksService {

	@Autowired
	BooksRepo booksRepo;
	public Books getBooksById(int booksId) {
		Optional<Books> rm=Optional.ofNullable(booksRepo.findBybooksId( booksId));
		Books books;
		if(rm.isPresent())
		{
			 books=rm.get();
		}else {
				throw new ResourceNotFoundException();
			}
		return books;
	  
	}

	public Books addBooks(Books books) {
		// TODO Auto-generated method stub
		return  booksRepo.save(books);
	}

	@Override
	public Books getBookById(int bookId) {
	
		return null;
	}

	
	@Override
	public Books updateDb(int booksId, Books books) {
		// TODO Auto-generated method stub
       Books s1 = booksRepo.findBybooksId(booksId);
		
		if(s1!=null) {
			s1.setTitle(books.getTitle());   
			s1.setAuthor(books.getAuthor());
			s1.setPrice(books.getPrice());
			s1.setQuantity(books.getQuantity());
		return booksRepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}

	@Override
	public void deleteDb(int booksId) {
		// TODO Auto-generated method stub
		
	}

	
	
}
