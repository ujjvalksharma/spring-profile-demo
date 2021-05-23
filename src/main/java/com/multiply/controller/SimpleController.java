package com.multiply.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Profile("dev") // this work for dev env 
public class SimpleController {
	
	@Value( "${app.description}" )
	private String description;
	
	@GetMapping("greeting")
	public String getGreeting() {
	//	System.out.println(description);
		return description;
		
	}

}
