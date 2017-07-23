package com.designpattern.observer.main;

public interface Subject {
	
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();

}
