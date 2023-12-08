package com.example.bookstoremanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstoremanage.entities.Books;
import com.example.bookstoremanage.service.BooksService;

@RestController
public class BooksController {

	@Autowired
	BooksService booksService;
	
	@GetMapping("/books/{Id}")
	public Books getBooksById(@PathVariable int booksId) {
		return booksService.getBookById(booksId); 
	}
	
	@PostMapping("/postbooks")
	public Books addBooks(@RequestBody Books books) {
		
		return booksService.addBooks(books);
	}
	
	@PutMapping("/updatebooks")
	public Books updateDb(@RequestHeader int booksId ,@RequestBody Books books) {
		
		return booksService.updateDb(booksId ,books); 
	}
	@DeleteMapping("/deletebooks")
	public String delete(@RequestHeader int booksId ) {
		booksService.deleteDb(booksId );
		return "data deleted";
	}
	
	
}


