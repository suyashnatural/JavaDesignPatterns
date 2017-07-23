package com.designpattern.adapter.main;

//Client
public class ChargerUtils {
	public static void doCharge(Chargeable chargeable){
		chargeable.charge();
	}
}
