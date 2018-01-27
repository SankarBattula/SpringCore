package com.sankar.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sankar.spring.bean.GreetingBean;


public class GreetingTest {
	
	//private static BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/sankar/spring/context/applicationContext.xml"));
	private static ApplicationContext context = new ClassPathXmlApplicationContext("com/sankar/spring/context/applicationContext.xml");
	public static void main(String[] args) {
		
		GreetingBean greetingBean =  (GreetingBean) context.getBean("gb");
		System.out.println(greetingBean.getName());		
		
		String aliasNames[] = context.getAliases("gb");
		System.out.println("The following are Alias names of gb:");
		for(int i=0;i<aliasNames.length;i++) {
			System.out.println(aliasNames[i]);
		}
	}
}


