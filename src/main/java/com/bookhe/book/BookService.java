package com.bookhe.book;

import com.bookhe.book.dao.BookDAOImpl;
import com.bookhe.book.dto.Book;

public class BookService {
	public void addBook(Book book){
		BookDAOImpl daoImpl = new BookDAOImpl();
		daoImpl.addBook(book);
	}
}
