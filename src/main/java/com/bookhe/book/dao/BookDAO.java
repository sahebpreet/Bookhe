package com.bookhe.book.dao;

import java.util.List;

import com.bookhe.book.dto.Book;
import com.bookhe.user.dto.User;


public interface BookDAO {
	public void addBook(Book book,User user);
	public Book getBookByISBN(String ISBN);
	public Book getBookByname(String name);
	public List<Book> getBooks();
	
}
