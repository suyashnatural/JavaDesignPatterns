package com.designpattern.adapter.main;

public class AppleAdapter implements Chargeable {
	
	Charger samsungCharger;

	/**
	 * @param samsungCharger the samsungCharger to set
	 */
	public void setSamsungCharger(Charger samsungCharger) {
		this.samsungCharger = samsungCharger;
	}

	@Override
	public void setMobileName(String mobileName) {
		// TODO Auto-generated method stub
		//empty
	}

	@Override
	public void charge() {
		samsungCharger.supplyCharge();
	}

}
