package com.bookhe.book.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bookhe.book.dto.Book;


public class BookDAOImpl implements BookDAO{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println("paramters intialized");
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//add book using a book object and jdbc
	public void addBook(Book book){
		
		if(jdbcTemplate!=null){
			//warning line 
			System.out.println("book Image Url is not added in the DB but still is int the class");
			
			String sql = "insert into book(ISBN,book_name,book_author,book_publisher,"
					+ "book_edition,book_url,book_category,book_cost) "
					+ "values( "
					+"'"+book.getISBN()+"',"
					+"'"+book.getName()+"',"
					+"'"+book.getAuthor()+"',"
					+"'"+book.getPublisher()+"',"
					+"'"+book.getEdition()+"',"
					+"'"+book.getEbookUrl()+"',"
					+"'"+book.getCategory()+"',"
					+"'"+book.getCost()+"');";
			jdbcTemplate.update(sql);
		}
		else{
			System.out.println("JDBC Parameters not initialized");
		}
	}
	
	//retrieving a book using ISBN
	public Book getBookByISBN(String ISBN) {
		try{
			String sql = "select * from book where book_id=?";
			return jdbcTemplate.queryForObject(sql, new Object[]{ISBN},new BookMapper());
		}
		catch(EmptyResultDataAccessException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	//retrieving a book by name
	public Book getBookByname(String name) {
		try{
			String sql = "select * from book where book_name=?";
			return jdbcTemplate.queryForObject(sql, new Object[]{name},new BookMapper());
		}
		catch(EmptyResultDataAccessException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	private static final class BookMapper implements RowMapper<Book>{
		public Book mapRow(ResultSet rs,int rowNo) throws SQLException{
			System.out.println("warning : book Image Url is not added in the DB but still is in the dto");
			Book book = new Book(
					rs.getString("ISBN"),rs.getString("book_name"),rs.getString("book_author"),
					rs.getString("book_publisher"),rs.getString("book_edition"),rs.getInt("book_cost"),
					rs.getString("book_category"),rs.getString("book_url"),"");
			
			return book;
		}
	}
	public List<Book> getBooks() {
		try{
			String sql = "select * from book";
			return jdbcTemplate.query(sql, new BookMapper());
		}
		catch(EmptyResultDataAccessException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	

}
