package com.bookhe.book;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bookhe.book.dao.BookDAOImpl;
import com.bookhe.book.dto.Book;

public class BookService {
	public void addBook(Book book){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		BookDAOImpl daoImpl = (BookDAOImpl) applicationContext.getBean("BookDAOBean");
		daoImpl.addBook(book);
	}
}
