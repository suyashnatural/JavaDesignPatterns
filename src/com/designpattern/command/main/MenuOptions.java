package com.designpattern.command.main;

public class MenuOptions {
	
	Command openCommand;
	Command saveCommand;
	Command closeCommand;
	
	/**
	 * @param openCommand
	 * @param saveCommand
	 * @param closeCommand
	 */
	public MenuOptions(Command openCommand, Command saveCommand, Command closeCommand) {
		super();
		this.openCommand = openCommand;
		this.saveCommand = saveCommand;
		this.closeCommand = closeCommand;
	}
	
	public void clickOpen(){
		openCommand.execute();
	}
	
	public void clickSave(){
		saveCommand.execute();
	}
	
	public void clickClose(){
		closeCommand.execute();
	}

}
