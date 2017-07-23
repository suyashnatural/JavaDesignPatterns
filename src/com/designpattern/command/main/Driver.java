package com.designpattern.command.main;

public class Driver {

	public static void main(String[] args) {

		// Creating a receiver
		WordDocument wordDocument = new WordDocument();

		// Creating the commands
		Command openCommand = new OpenCommand(wordDocument);
		Command saveCommand = new SaveCommand(wordDocument);
		Command closeCommand = new CloseCommand(wordDocument);

		// Creating an invoker
		MenuOptions menu = new MenuOptions(openCommand, saveCommand, closeCommand);

		// Executing the command from menu
		menu.clickOpen();
		menu.clickSave();
		menu.clickClose();

	}

}
