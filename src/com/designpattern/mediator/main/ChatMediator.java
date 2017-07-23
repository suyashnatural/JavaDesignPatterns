package com.designpattern.mediator.main;

public interface ChatMediator {
	public void sendMessage(String message, User user);
	public void addUser(User user);
}
