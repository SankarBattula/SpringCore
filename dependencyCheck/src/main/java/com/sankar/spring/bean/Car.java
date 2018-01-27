package com.sankar.spring.bean;

public class Car {
	
	private String breaks;
	private Driving driving;
	
	public void setBreaks(String breaks) {
		this.breaks = breaks;
	}
	public void setDriving(Driving driving) {
		this.driving = driving;
	}
	
	public void driveCar() {
		System.out.println("old man come across the road");
		System.out.println("apply breaks");

		if(breaks != null) {
			System.out.println("old man saved");
		}else {
			System.out.println("old man kicked the bucket");
		}
		
		if(driving.getDriver() != null) {
			System.out.println("driver is driving");
		}else {
			System.out.println("owner id driving");
		}
	}

}
