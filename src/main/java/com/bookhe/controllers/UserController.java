package com.bookhe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.bookhe.user.UserService;
import com.bookhe.user.dto.User;

@Controller
@SessionAttributes("user")
public class UserController {

	@RequestMapping( value = "/login", method=RequestMethod.POST)
	public String loginUser( @RequestParam(value="emailId", required=false) String emailId, 
	        @RequestParam(value="password", required=false) String password, Model model) {
		UserService userService = new UserService();
		User user = new User();
		user.setEmailId( emailId );
		user.setPassword( password );
		if( userService.validateUser( user ) ) {
			model.addAttribute( "success", true );
			model.addAttribute( "user", user );
		} else {
			model.addAttribute( "success", false );
		}
		return "user/loginResult";
	}

	@RequestMapping( value="/userProfile", method=RequestMethod.GET)
	public String userProfile( Model model ) {
		return "user/userProfile";
	}

	@RequestMapping( value="/logout", method=RequestMethod.GET )
	public String logoutUser( SessionStatus status ) {
		status.setComplete();
		return "redirect:/s/index";
	}
}
