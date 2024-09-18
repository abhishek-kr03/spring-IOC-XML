package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String indexPage(){
		return "index.html";
	}
	
	@RequestMapping("about")
	public String aboutPage() {
		return "about.html";
	}
	
	@RequestMapping("project")
	public String projectPage() {
		return "project.html";
	}
} 
