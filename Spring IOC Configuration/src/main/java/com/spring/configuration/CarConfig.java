package com.spring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.spring.classes")
@PropertySource("classpath:car.properties")
public class CarConfig {

	
	
}
