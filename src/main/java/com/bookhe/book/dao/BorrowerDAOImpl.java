package com.bookhe.book.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class BorrowerDAOImpl implements BorrowerDAO{
	
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
	
	
	public void borrow(String ISBN, String borrowerUsername) {
		String queryBookId="select Book_Id from book where ISBN='"+ISBN+"'";
		String queryBorrowerId="select UID from user where Username='"+borrowerUsername+"'";
		
		int bookId=jdbcTemplate.queryForInt(queryBookId);
		int borrowerId=jdbcTemplate.queryForInt(queryBorrowerId);
		
		String updateBorrower="update book_owner_borrower set Borrower_Id="+borrowerId+" where Book_Id="+bookId;
		
		jdbcTemplate.execute(updateBorrower);
		
		String queryOwnerId="select Owner_Id from book_owner_borrower where Book_Id="+bookId;
		
		int ownerId=jdbcTemplate.queryForInt(queryOwnerId);
		
		String queryCost="select book_cost from book where ISBN='"+ISBN+"'";
		
		double bookCost=jdbcTemplate.queryForObject(queryCost, Double.class);
		
		String queryUpdateOwnerPoints="update user set Points=Points+"+bookCost+" where UID="+ownerId;
		
		jdbcTemplate.execute(queryUpdateOwnerPoints);
		
		String queryUpdateBorrowerPoints="update user set Points=Points-"+bookCost+" where UID="+borrowerId;
		
		jdbcTemplate.execute(queryUpdateBorrowerPoints);
		
	}
	
	

}
