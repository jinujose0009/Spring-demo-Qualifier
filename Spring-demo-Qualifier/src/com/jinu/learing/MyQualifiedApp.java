package com.jinu.learing;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyQualifiedApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach thecoah=context.getBean("trackCoach",Coach.class);
		System.out.println(thecoah.getDailyworkout());
		System.out.println(thecoah.getDailyfortunes());
		context.close();
	}

}
