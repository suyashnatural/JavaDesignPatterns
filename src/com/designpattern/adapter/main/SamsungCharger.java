package com.designpattern.adapter.main;

public class SamsungCharger implements Charger {

	private String mobileName;
	
	@Override
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	@Override
	public void supplyCharge() {
		System.out.println("charging "+this.mobileName+" ...");
	}
}
