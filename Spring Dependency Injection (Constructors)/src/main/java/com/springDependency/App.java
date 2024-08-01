package com.springDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springDependency.customers.Customers;
import com.springDependency.customersImpl.GoldCustomers;
import com.springDependency.customersImpl.PlatinumCustomers;

public class App {
  public static void main(String[] args) {
	  ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	  
	  Customers goldCustomer = (GoldCustomers)context.getBean("gc");
	  Customers platinumCustomer = (PlatinumCustomers)context.getBean("pc");
	  
	  goldCustomer.getCustomerDetails();
	  platinumCustomer.getCustomerDetails();
  }
}
