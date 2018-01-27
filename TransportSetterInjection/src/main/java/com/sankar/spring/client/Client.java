package com.sankar.spring.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sankar.spring.customer.TransportCustomer;

public class Client {
	
	private static BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/sankar/spring/context/applicationContext.xml"));
	public static void main(String[] args) {
		TransportCustomer transportCustomer = (TransportCustomer) factory.getBean("tc");
		transportCustomer.useTransport();
		
	}

}


