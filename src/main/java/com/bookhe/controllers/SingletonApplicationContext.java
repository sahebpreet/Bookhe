package com.bookhe.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonApplicationContext {

	private static ApplicationContext ac;
	
	
	static
	{
		ac=new ClassPathXmlApplicationContext("spring.xml");
	}
	
	public static ApplicationContext getApplicationContext()
	{
		return ac;
	}
	
}
