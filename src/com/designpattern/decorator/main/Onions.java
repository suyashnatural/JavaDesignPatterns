package com.designpattern.decorator.main;

public class Onions extends PizzaTopings{
	
	public Onions(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String description() {
		return "Onions";
	}

	@Override
	public Double cost() {
		return pizza.cost() + 1.5;
	}

}
