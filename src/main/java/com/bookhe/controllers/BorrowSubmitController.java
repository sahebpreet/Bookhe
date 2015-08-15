package com.bookhe.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bookhe.book.dao.BorrowerDAOImpl;

@Controller
public class BorrowSubmitController {
	
	@RequestMapping(value="/borrow",method=RequestMethod.GET)
	public void borrowBook(@RequestParam("isbn") String isbn, @RequestParam("borrowerUsername") String borrowerUsername)
	{
		ApplicationContext ac=SingletonApplicationContext.getApplicationContext();
		BorrowerDAOImpl bdi=ac.getBean("bdi",BorrowerDAOImpl.class);
		
		bdi.borrow(isbn, borrowerUsername);
		
	}
	
}
