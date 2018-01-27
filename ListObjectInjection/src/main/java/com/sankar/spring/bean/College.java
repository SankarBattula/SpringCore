package com.sankar.spring.bean;

import java.util.Iterator;
import java.util.List;

public class College {
	
	private String name;
	private List<Student> students;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public void displayDetails() {
		
		System.out.println("College Name is " + name);
		System.out.println("Student details are ...");
		
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.getSno());
			System.out.println(student.getSname());
			System.out.println(student.getFee());
		}
	}
	

}
