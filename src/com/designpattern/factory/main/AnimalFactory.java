package com.designpattern.factory.main;

public class AnimalFactory {

	public Animal createAnimal(String animalType){
		
		if(animalType == null){
			return null;
		}
		
		if("dog".equalsIgnoreCase(animalType))
			return new Dog();
		else if("cat".equalsIgnoreCase(animalType))
			return new Cat();
		else if("fox".equalsIgnoreCase(animalType))
			return new Fox();
		
		return null;
	}
}
