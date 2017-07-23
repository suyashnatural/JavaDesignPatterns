package com.designpattern.observer.main;

public class Customer implements Observer {

	private String customerName;
	private Subject subject;

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName
	 *            the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the subject
	 */
	public Subject getSubject() {
		return subject;
	}

	/**
	 * @param subject
	 *            the subject to set
	 */
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void update(String productName) {
		System.out.println("Hello " + customerName + ", " + productName + " is now available on Amazon.");
	}

}
