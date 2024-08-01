package com.springDependency.customersImpl;

import com.springDependency.classes.Address;
import com.springDependency.customers.Customers;

public class GoldCustomers implements Customers {
	
	Address address;
	String type;
	
	public GoldCustomers(Address address, String type) {
		super();
		this.address = address;
		this.type = type;
	}
	
	@Override
	public void getCustomerDetails() {
		System.out.println(type +" : "+ address.city +","+ address.state);

	}
}
