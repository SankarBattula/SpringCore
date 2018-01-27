package com.sankar.spring.bean;

import java.util.Iterator;
import java.util.List;

public class InstituteBean {
	
	private String name;
	private List<String> facultyNames;
	private List<String> courseNames;
	
	public void setCourseNames(List<String> courseNames) {
		this.courseNames = courseNames;
	}
	public void setFacultyNames(List<String> facultyNames) {
		this.facultyNames = facultyNames;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void displayDetails() {
		
		System.out.println("Institute Name " + name);
		System.out.println("Faculty Names are ...");
		for(String facultyName : facultyNames) {
			System.out.println(facultyName);
		}
		Iterator<String> iterator = courseNames.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
