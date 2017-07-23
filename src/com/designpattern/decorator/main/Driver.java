package com.designpattern.decorator.main;

public class Driver {

	public static void main(String[] args) {
		
		//Create a pan pizza
		Pizza panPizza = new PanPizza();
		
		//Add all the topings
		panPizza = new Tomatoes(panPizza);
		panPizza = new Onions(panPizza);
		panPizza = new Cheese(panPizza);
		
		//Print the total cost of pizza after adding topings
		System.out.println("Your pan-pizza is ready with topings..");
		System.out.println("Total Cost - $"+panPizza.cost());
	}

}
