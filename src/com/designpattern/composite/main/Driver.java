package com.designpattern.composite.main;

public class Driver {

	public static void main(String[] args) {

		// Creating the leaf's
		Component hardDrive = new Leaf("Hard Drive", 900);
		Component mouse = new Leaf("Mouse", 200);
		Component monitor = new Leaf("Monitor", 500);
		Component ram = new Leaf("Ram", 400);
		Component cpu = new Leaf("CPU", 100);

		// Creating the composites
		Composite peripheral = new Composite("Peripheral");
		Composite cabinet = new Composite("Cabinet");
		Composite motherBoard = new Composite("MotherBoard");
		Composite computer = new Composite("Computer");

		// Creating the components by adding leaf's to the composite
		motherBoard.addComponent(cpu);
		motherBoard.addComponent(ram);

		peripheral.addComponent(mouse);
		peripheral.addComponent(monitor);
		
		cabinet.addComponent(motherBoard);
		cabinet.addComponent(hardDrive);

		computer.addComponent(peripheral);
		computer.addComponent(cabinet);

		// Display price of whole computer as a component
		computer.showPrice();
	}

}
