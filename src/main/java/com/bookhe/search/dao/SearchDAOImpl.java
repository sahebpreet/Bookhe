package com.bookhe.search.dao;

import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.bookhe.book.dto.Book;

public class SearchDAOImpl implements SearchDAO{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//Keywords searched in name,author,publisher
	public ArrayList<Book> searchByKeyword(String[] keywords) {
		
		String query_name=generateQuery("book_name", keywords);
		String query_author=generateQuery("book_author", keywords);
		String query_publisher=generateQuery("book_publisher", keywords);
		
		String final_query=query_name+" UNION "+query_author+" UNION "+query_publisher;
		
		SqlRowSet srs=jdbcTemplate.queryForRowSet(final_query);
		ArrayList<Book> books=new ArrayList<Book>();
		
		for(srs.first();!srs.isAfterLast();srs.next())
		{
			Book b=new Book(srs.getString(2), srs.getString(3), srs.getString(4), srs.getString(5), srs.getString(6), srs.getDouble(9), srs.getString(8), srs.getString(7), srs.getString(10));
			books.add(b);
		}
		
		System.out.println("At end");
		
		return books;
		
		
	}
	
	//Search by keyword and location
	public ArrayList<Book> searchByKeywordAndLocation(String[] keywords,String location) {
		return null;
	}
	
	//Query generator for searching
	private String generateQuery(String column,String[] keywords)
	{
		int keywords_length=keywords.length;
		
		String query="select * from book where "+column+" LIKE ";
		
		for(int i=0;i<keywords_length;i++)
		{
			if(i<keywords_length-1)
				query=query+"'%"+keywords[i]+"%' OR "+column+" LIKE ";
			else
				query=query+"'%"+keywords[i]+"%'";
		}
		
		return query;
	}

}
