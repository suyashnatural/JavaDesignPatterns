package com.designpattern.observer.main;

public class Driver {

	public static void main(String[] args) {

		// creating customers
		Customer customer1 = new Customer();
		customer1.setCustomerName("Suyash");

		Customer customer2 = new Customer();
		customer2.setCustomerName("Niharika");

		// creating the product
		Product iPhone7Plus = new Product();
		iPhone7Plus.setProductName("Apple iPhone 7 Plus");
		iPhone7Plus.setAvailable(false); // product out of stock

		// as product is out of stock, all customers wants to register in
		// waitlist
		iPhone7Plus.registerObserver(customer1);
		iPhone7Plus.registerObserver(customer2);

		// After few days, iPhone7Plus becomes available
		iPhone7Plus.setAvailable(true);

		// niharika wants to unregister
		iPhone7Plus.removeObserver(customer2);

		iPhone7Plus.setAvailable(true);
	}

}
