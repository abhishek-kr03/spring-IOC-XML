package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Interfaces.Car;
import com.spring.classes.BMW;
import com.spring.classes.Bugatti;
import com.spring.classes.Mercedes;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Car bmw = (BMW)context.getBean("bmw");
		System.out.println(bmw.getCardetails());
		System.out.println(bmw.getEngineDetails());
		
		Mercedes mercedes = context.getBean("mercedes" , Mercedes.class);
		System.out.println(mercedes.getCardetails());
		System.out.println(mercedes.getEngineDetails());
		System.out.println(mercedes.getColour());
		System.out.println(mercedes.getPrice());
		
		Car bugatti = (Bugatti)context.getBean("bugatti");
		System.out.println(bugatti.getCardetails());
		System.out.println(bugatti.getEngineDetails());
			
		context.close();	
	}
}
