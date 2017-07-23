package com.designpattern.composite.main;

public class Leaf implements Component {
	
	String name;
	int price;
	
	/**
	 * @param name
	 * @param price
	 */
	public Leaf(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}


	@Override
	public void showPrice() {
		System.out.println(name +" : "+ price);
	}

}
