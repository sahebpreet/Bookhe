package com.bookhe.user.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bookhe.book.dto.Book;
import com.bookhe.user.dto.Address;
import com.bookhe.user.dto.User;

public class UserRegisterDAOImpl implements UserRegisterDAO{
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

	public void registerUser(User user) {
		if(jdbcTemplate!=null){
			String addsql="insert into address_user(Street,City,State) values(?,?,?)";
			Address add = user.getAddress();
			jdbcTemplate.update(addsql,new Object[]{add.getStreet(),add.getCity(),add.getState()});
			
			String qry="select Address_id from address_user where Street=? AND City=? AND State=?";
			int address_id=jdbcTemplate.queryForInt(qry, new Object[]{add.getStreet(),add.getCity(),add.getState()});
			
			String sql="insert into user(Username,Contact,Password,Address_id,Points) values(?,?,?,?,?)";
			jdbcTemplate.update(sql,new Object[]{user.getEmailId(),
					user.getContactNumber(),user.getPassword(),address_id,user.getPoints()
					});
		}
		else{
			System.out.println("error in register user");
		}
	} 
	@SuppressWarnings("unused")
	private static final class UserMapper implements RowMapper<User>{
		public User mapRow(ResultSet rs,int rowNo) throws SQLException{
			System.out.println("warning : book Image Url is not added in the DB but still is in the dto");
			User user = new User();
			
			//book mapper code must be added here
			Book book = new Book(
					rs.getString("ISBN"),rs.getString("book_name"),rs.getString("book_author"),
					rs.getString("book_publisher"),rs.getString("book_edition"),rs.getInt("book_cost"),
					rs.getString("book_category"),rs.getString("book_url"),"");
			
			return user;
		}
	}
	public boolean validateUser(User user){
		String emailId = user.getEmailId();
		String password = user.getPassword();
		try{
			String pass = jdbcTemplate.queryForObject("select password from user where username=?",
					new Object[]{emailId},String.class);
			if(pass.equals(password)){
				return true;
			}
			else{
				return false;
			}
			//jdbcTemplate.queryForInt("select * from user where username=? and password=?",emailId,password);
		}
		catch(EmptyResultDataAccessException e){
			e.printStackTrace();
			return false;
		}
	}

}
