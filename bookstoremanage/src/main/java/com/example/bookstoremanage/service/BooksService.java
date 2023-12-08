package com.example.bookstoremanage.service;

import com.example.bookstoremanage.entities.Books;

public interface BooksService {
	Books getBookById(int booksId );
	Books addBooks(Books books);
	Books updateDb(int booksId,Books books);
	void deleteDb(int booksId);
}