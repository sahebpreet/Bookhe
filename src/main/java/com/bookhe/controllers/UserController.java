package com.bookhe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

	@RequestMapping( value = "/login/", method=RequestMethod.GET)
	public String loginUser() {
		//get the post parameters
		
		// get the current uri and redirect.
		return "index";
	}
}
