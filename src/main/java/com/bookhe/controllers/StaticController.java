package com.bookhe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StaticController {

	@RequestMapping(value="s/{path}", method = RequestMethod.GET)
	public String loadStaticContent( @PathVariable("path") String path ) {
		return path;
	}
}
