package com.designpattern.observer.main;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {

	private List<Observer> listOfObservers = new ArrayList<Observer>();
	private String productName;
	private boolean isAvailable;

	/**
	 * @return the isAvailable
	 */
	public boolean isAvailable() {
		return isAvailable;
	}

	/**
	 * @param isAvailable
	 *            the isAvailable to set
	 */
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
		if (isAvailable == true) {
			notifyObservers();
		}
	}

	/**
	 * @return the listOfObservers
	 */
	public List<Observer> getListOfObservers() {
		return listOfObservers;
	}

	/**
	 * @param listOfObservers
	 *            the listOfObservers to set
	 */
	public void setListOfObservers(List<Observer> listOfObservers) {
		this.listOfObservers = listOfObservers;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName
	 *            the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public void registerObserver(Observer observer) {
		listOfObservers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		listOfObservers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		System.out.println("Notifying all registered observers, when product becomes available.");
		for (Observer observer : listOfObservers) {
			observer.update(productName);
		}

	}

}
