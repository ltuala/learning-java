package com.learningjava.oops.level2;

public class CustomerRunner {
	public static void main(String[] args) {
		Address homeAddress = new Address("line 1", "Manila", "1740");
		Customer customer = new Customer("Leo", homeAddress);
		System.out.println(customer);

		Address workAddress = new Address("line 1 for work", "Manila", "1740");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);
	}
}
