package com.kkjavatutorials.SpringBootRestApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping(path = "/gradle")
	public String welcome() {
		return "Feeling Great And Enjoying The Devops Training ";
	}

}
