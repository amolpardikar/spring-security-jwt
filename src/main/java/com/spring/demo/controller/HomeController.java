package com.spring.demo.controller;

import java.security.Principal;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping
	public String home() {
		return "Hello, there!" ;
	}
	
	@GetMapping("/secure")
	public String secure(Principal principal){
		return "You are visiting a secured endpoint Mr."+ principal.getName();
	}
	
}
