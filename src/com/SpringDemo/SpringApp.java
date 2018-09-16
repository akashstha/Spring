package com.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext content=new ClassPathXmlApplicationContext("applicationContent.xml");
		
		Coach coach=content.getBean("thecoach",Coach.class);
		Coach coach1=content.getBean("coach1",Coach.class);

		
		System.out.println(coach.dailyworkout());
		System.out.println(coach1.dailyworkout());
		
		content.close();
	}

}
