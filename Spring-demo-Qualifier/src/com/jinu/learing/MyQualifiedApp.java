package com.jinu.learing;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyQualifiedApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		TrackCoach thecoah=context.getBean("trackCoach",TrackCoach.class);
		System.out.println(thecoah.getDailyworkout());
		System.out.println(thecoah.getDailyfortunes());
		System.out.println(thecoah.getEmail());
		System.out.println(thecoah.getLocation());
		context.close();
	}

}
