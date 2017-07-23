package com.designpattern.adapter.main;

public class Driver {

	public static void main(String[] args) {
		//Create apple charger
		Chargeable appleCharger = new AppleCharger();
		//Set the mobile name
		appleCharger.setMobileName("iPhone 7+");
		//Charge the phone
		ChargerUtils.doCharge(appleCharger); 
		
		//Create samsung charger
		Charger samsungCharger = new SamsungCharger();
		samsungCharger.setMobileName("Galaxy S8");
		
		//Create instance of Adapter
		AppleAdapter appleAdapter = new AppleAdapter();
		appleAdapter.setSamsungCharger(samsungCharger);
		//Charge the phone
		ChargerUtils.doCharge(appleAdapter);
	}

}
