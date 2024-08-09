package com.spring.classes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.spring.interfaces.Car;
import com.spring.interfaces.Engine;

//Constructor Injection

@Component("bmw")
public class BMW implements Car{

	 
	private Engine engine;
	
	@Autowired 
	public BMW(@Qualifier("jetEngine") Engine engine) {
		super();
		this.engine = engine;
	}

	@Override
	public String getCardetails() {
		// TODO Auto-generated method stub
		return "BMW";
	}

	@Override
	public String getEngineDetails() {
		// TODO Auto-generated method stub
		return engine.getEngineDetails();
	}
	
	@PostConstruct
	void customInit() {
		System.out.println("Custom init method called: Bean Created");
	}
	
	@PreDestroy
	void customDestroy() {
		System.out.println("Custom destroy method called: Bean Destroyed");
	}
}
