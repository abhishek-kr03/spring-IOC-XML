package com.dependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dependency.classes.PrimeMinister;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		PrimeMinister pm = (PrimeMinister)context.getBean("primeMinister");
		
		System.out.println(pm);
		
		context.close();

	}

}
