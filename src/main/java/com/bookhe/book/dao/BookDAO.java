package com.bookhe.book.dao;

import java.util.List;

import com.bookhe.book.dto.Book;


public interface BookDAO {
	public void addBook(Book book);
	public Book getBookByISBN(String ISBN);
	public Book getBookByname(String name);
	public List<Book> getBooks();
	
}
