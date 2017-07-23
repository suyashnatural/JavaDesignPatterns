package com.designpattern.adapter.main;

public class AppleCharger implements Chargeable {

	private String mobileName;
	
	@Override
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	@Override
	public void charge() {
		System.out.println("charging "+this.mobileName+" ...");
	}

}
