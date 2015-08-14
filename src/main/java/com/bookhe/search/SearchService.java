package com.bookhe.search;

import java.util.ArrayList;

import com.bookhe.book.dto.Book;
import com.bookhe.search.dao.SearchDAO;

public class SearchService {

	private SearchDAO searchDao;

	public SearchService( SearchDAO searchDao ) {
		this.searchDao = searchDao;
	}

	public ArrayList<Book> search( String keyword, String location ){
		return searchDao.searchByKeyword( keyword.toLowerCase().split( "\\s+") );
	}
}
