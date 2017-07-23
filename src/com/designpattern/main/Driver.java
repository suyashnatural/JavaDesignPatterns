package com.designpattern.main;

import com.designpattern.main.Satellite;

public class Driver {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(Satellite.getInstance().hashCode());
		}
	}
}
