package com.bookhe.controllers;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookhe.book.dto.Book;
import com.bookhe.search.SearchService;
import com.bookhe.search.dao.SearchDAO;

@Controller
public class SearchController {

	@RequestMapping(value="/search/{keyword}/{location}", method = RequestMethod.GET )
	public String searchBook( @PathVariable("keyword") String keyword, @PathVariable("location") String location, Model model ) {
		ApplicationContext ac = SingletonApplicationContext.getApplicationContext();
		SearchService searchService = new SearchService( ( SearchDAO )ac.getBean( "sdi" ) );
		ArrayList<Book> results = searchService.search( keyword, location );
		model.addAttribute( "searchResults", results );
		model.addAttribute( "keywords", keyword );
		return "search/searchResults";
	}
}
