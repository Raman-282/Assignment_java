package com.demomyapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {
	@GetMapping("/")
	
	String hello() {
		return  "how are you";
	}

}
