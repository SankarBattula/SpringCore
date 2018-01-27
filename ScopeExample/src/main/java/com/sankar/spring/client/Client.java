package com.sankar.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sankar.spring.bean.SpringBean;

public class Client {
	
	private static ApplicationContext context = new ClassPathXmlApplicationContext("com/sankar/spring/context/applicationContext.xml");
	public static void main(String[] args) {
		
		SpringBean greetingBean1 =  (SpringBean) context.getBean("sb");
		System.out.println("Object 1-->" + greetingBean1);		
		
		SpringBean greetingBean2 =  (SpringBean) context.getBean("sb");
		System.out.println("Object 1-->" + greetingBean2);
		
		SpringBean greetingBean3 =  (SpringBean) context.getBean("sb");
		System.out.println("Object 1-->" + greetingBean3);
		
	}
}


