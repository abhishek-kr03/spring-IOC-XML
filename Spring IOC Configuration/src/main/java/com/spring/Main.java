package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext; // Import for Spring's context support

import com.spring.classes.BMW; // Import BMW class
import com.spring.classes.Bugatti; // Import Bugatti class
import com.spring.classes.Mercedes; // Import Mercedes class
import com.spring.configuration.CarConfig; // Import configuration class
import com.spring.interfaces.Car; // Import Car interface

public class Main {

    public static void main(String[] args) {
        
        // Create a Spring application context using the CarConfig configuration class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);

        // Retrieve a BMW bean from the context and cast it to the Car interface
        Car bmw = (BMW) context.getBean("bmw");
        // Print the details and engine information of the BMW car
        System.out.println(bmw.getCardetails());
        System.out.println(bmw.getEngineDetails());
        
        // Retrieve a Mercedes bean from the context and cast it to the Mercedes class
        Mercedes mercedes = context.getBean("mercedes", Mercedes.class);
        // Print details, engine information, color, and price of the Mercedes car
        System.out.println(mercedes.getCardetails());
        System.out.println(mercedes.getEngineDetails());
        System.out.println(mercedes.getColour());
        System.out.println(mercedes.getPrice());
        
        // Retrieve a Bugatti bean from the context and cast it to the Car interface
        Car bugatti = (Bugatti) context.getBean("bugatti");
        // Print the details and engine information of the Bugatti car
        System.out.println(bugatti.getCardetails());
        System.out.println(bugatti.getEngineDetails());
            
        // Close the application context to release resources
        context.close();  
    }
}
