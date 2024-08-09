package com.spring.classes;

import org.springframework.stereotype.Component;

import com.spring.interfaces.Engine;

@Component("jetEngine")
public class JetEngine implements Engine {

	@Override
	public String getEngineDetails() {
		return "Jet engine gives excelent performance";
	}

}
