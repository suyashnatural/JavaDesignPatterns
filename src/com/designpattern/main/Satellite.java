package com.designpattern.main;

public class Satellite {
	
	private static Satellite _instance;
	
	private Satellite(){
		//Private constructor
	}
	
	private static class SatelliteHelper{
		private static final Satellite _innerInstance = new Satellite();
	}
	
	public static Satellite getInstance(){
		return SatelliteHelper._innerInstance;
	}

}
