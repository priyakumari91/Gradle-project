package com.kkjavatutorials.SpringBootRestApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping(path = "/assignmen2")
	public String welcome() {
		return "Coming together is a beginning, staying together is progress, and working together is success.";
	}

}
