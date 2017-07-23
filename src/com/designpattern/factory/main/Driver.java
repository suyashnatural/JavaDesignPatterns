package com.designpattern.factory.main;

public class Driver {

	public static void main(String[] args) {
	
		//Passing the argument from command line
		String animalType = args[0];
		
		//Creating object of Animal Factory
		AnimalFactory animalFactory = new AnimalFactory();
		
		//Creating animal of type passed in command line
		Animal animal = animalFactory.createAnimal(animalType);
		animal.eat();
	}
}
