package com.bookhe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bookhe.user.UserService;
import com.bookhe.user.dto.User;

@Controller
public class UserController {

	@RequestMapping( value = "/login", method=RequestMethod.POST)
	public String loginUser( @RequestParam(value="emailId", required=false) String emailId, 
	        @RequestParam(value="password", required=false) String password, Model model ) {
		System.out.println( emailId + password );
		UserService userService = new UserService();
		User user = new User();
		user.setEmailId( emailId );
		user.setPassword( password );
		if( userService.validateUser( user ) ) {
			model.addAttribute( "success", true );
		} else {
			model.addAttribute( "success", false );
		}
		return "user/loginResult";
	}
}
