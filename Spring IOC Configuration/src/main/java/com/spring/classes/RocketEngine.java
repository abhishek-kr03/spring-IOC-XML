package com.spring.classes;

import org.springframework.stereotype.Component;

import com.spring.interfaces.Engine;

@Component("rocketEngine")
public class RocketEngine implements Engine {

	@Override
	public String getEngineDetails() {
		return "Rocket engine gives great performance";
	}

}
