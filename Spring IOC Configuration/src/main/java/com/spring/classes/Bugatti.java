package com.spring.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.interfaces.Car;
import com.spring.interfaces.Engine;

//Attribute/Field Injection

@Component("bugatti")
public class Bugatti implements Car {
	
	
	@Autowired
	@Qualifier("jetEngine")
	private Engine engine;


	@Override
	public String getCardetails() {
		// TODO Auto-generated method stub
		return "Bugatti";
	}

	@Override
	public String getEngineDetails() {
		// TODO Auto-generated method stub
		return engine.getEngineDetails();
	}
}
