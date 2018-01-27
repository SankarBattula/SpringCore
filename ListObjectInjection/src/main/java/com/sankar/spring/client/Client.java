package com.sankar.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sankar.spring.bean.College;


public class Client {
	
	//private static BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/sankar/spring/context/applicationContext.xml"));
	private static ApplicationContext context = new ClassPathXmlApplicationContext("com/sankar/spring/context/applicationContext.xml");
	public static void main(String[] args) {
		
		College college =  (College) context.getBean("college");
		college.displayDetails();
	}
}


