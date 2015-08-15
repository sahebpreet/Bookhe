package com.bookhe.book.dao;

public interface BorrowerDAO {
	
	void borrow(String ISBN,String borrowerUsername);
	
}
