package com.designpattern.mediator.main;

public class Driver {

	public static void main(String[] args) {
		// Create new chat room
		ChatMediator chatMediator = new ChatMediatorImpl();

		// Create different users
		User suyash = new UserImpl(chatMediator, "Suyash");
		User anjali = new UserImpl(chatMediator, "Anjali");
		User niharika = new UserImpl(chatMediator, "Niharika");
		User abhilasha = new UserImpl(chatMediator, "Abhilasha");

		// Add the users to chat room
		chatMediator.addUser(suyash);
		chatMediator.addUser(anjali);
		chatMediator.addUser(niharika);
		chatMediator.addUser(abhilasha);

		// One user sends message to all in the chat room
		suyash.send("Hi!.. I am Suyash. Let's start the chat..");
	}

}
