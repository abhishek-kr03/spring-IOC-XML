package com.dependency.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PrimeMinister {

	String name ;
	
	@Autowired
	public void setName(@Value("Narendra Modi") String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
