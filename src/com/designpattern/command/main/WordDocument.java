package com.designpattern.command.main;

public class WordDocument {
	
	public void open(){
		System.out.println("Opening a document.");
	}

	public void save(){
		System.out.println("Saving a document.");
	}
	
	public void close(){
		System.out.println("Closing a document.");
	}
}
