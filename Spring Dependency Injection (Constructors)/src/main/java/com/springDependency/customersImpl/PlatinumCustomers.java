package com.springDependency.customersImpl;

import com.springDependency.classes.Address;
import com.springDependency.customers.Customers;

public class PlatinumCustomers implements Customers {

	Address address;
	String type;
	
	public PlatinumCustomers(Address address, String type) {
		super();
		this.address = address;
		this.type = type;
	}

	@Override
	public void getCustomerDetails() {
		System.out.println(type +" : "+ address.city +","+ address.state);

	}
}
