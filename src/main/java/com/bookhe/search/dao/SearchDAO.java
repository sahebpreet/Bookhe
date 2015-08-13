package com.bookhe.search.dao;

import java.util.ArrayList;

import com.bookhe.book.dto.Book;

public interface SearchDAO {
	
	ArrayList<Book> searchByKeyword(String[] keywords);
	ArrayList<Book> searchByKeywordAndLocation(String[] keywords,String location);
}
