package com.sankar.spring.bean;

public class Servlet {
	
	private Service service;
	
	public Servlet(Service service) {
		this.service = service;
		System.out.println("Servelt constructor");
	}
	
	public void servletMethod() {
		System.out.println("Servlet.serviceMethod() called");
		service.serviceMethod();
	}

}
