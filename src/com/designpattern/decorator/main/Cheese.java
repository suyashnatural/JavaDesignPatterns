package com.designpattern.decorator.main;

public class Cheese extends PizzaTopings{
	
	public Cheese(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String description() {
		return "Cheese";
	}

	@Override
	public Double cost() {
		return pizza.cost() + 2.5;
	}

}
