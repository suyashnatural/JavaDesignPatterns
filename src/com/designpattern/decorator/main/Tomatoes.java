package com.designpattern.decorator.main;

public class Tomatoes extends PizzaTopings{
	
	public Tomatoes(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String description() {
		return "Tomatoes";
	}

	@Override
	public Double cost() {
		return pizza.cost() + 1.0;
	}

}
