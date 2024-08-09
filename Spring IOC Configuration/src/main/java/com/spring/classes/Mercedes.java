package com.spring.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.spring.interfaces.Car;
import com.spring.interfaces.Engine;

//Setters/Method Injection

@Component("mercedes")
public class Mercedes implements Car {
	
	
	private Engine engine;
	String colour;
	float price;
	
	@Autowired
	public void setEngine(@Qualifier("rocketEngine") Engine engine) {
		this.engine = engine;
	}
	public Engine getEngine() {
		return engine;
	} 
	
	@Value("${colour}")
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getColour() {
		return colour;
	}
	
	@Value("${price}")
	public void setPrice(float price) {
		this.price = price;
	}
	public float getPrice() {
		return price;
	}

	@Override
	public String getCardetails() {
		
		return "Mercedes";
	}
	
	@Override
	public String getEngineDetails() {
		
		return engine.getEngineDetails();
	}
}
