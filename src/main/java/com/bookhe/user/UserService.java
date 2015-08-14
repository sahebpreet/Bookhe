package com.bookhe.user;

import org.springframework.context.ApplicationContext;
import com.bookhe.controllers.SingletonApplicationContext;
import com.bookhe.user.dao.UserRegisterDAOImpl;
import com.bookhe.user.dto.User;

public class UserService {
	public void registerUser(User user){
		ApplicationContext applicationContext = SingletonApplicationContext.getApplicationContext();
		UserRegisterDAOImpl userRegisterDAOImpl = (UserRegisterDAOImpl) applicationContext.getBean("UserRegisterDAOBean");
		userRegisterDAOImpl.registerUser(user);
	}
	public boolean validateUser(User user){
		ApplicationContext applicationContext = SingletonApplicationContext.getApplicationContext();
		UserRegisterDAOImpl userRegisterDAOImpl = (UserRegisterDAOImpl) applicationContext.getBean("UserRegisterDAOBean");
		return userRegisterDAOImpl.validateUser(user);
	}
}
