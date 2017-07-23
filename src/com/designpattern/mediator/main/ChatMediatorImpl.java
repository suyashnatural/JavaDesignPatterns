package com.designpattern.mediator.main;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
	
	private List<User> users;
	
	public ChatMediatorImpl() {
		this.users = new ArrayList<User>();
	}

	@Override
	public void sendMessage(String message, User user) {
		for (User u : users) {
			//message should not be received by the user who is sending it
			if(u!=user){
				u.receive(message);
			}
		}
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

}
