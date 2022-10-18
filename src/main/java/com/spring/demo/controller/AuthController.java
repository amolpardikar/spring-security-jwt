package com.spring.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.service.TokenService;

@RestController
public class AuthController {
	
	public static final Logger LOG = LoggerFactory.getLogger(AuthController.class);
	
	private final TokenService tokenService;
	
	public AuthController(TokenService tokenSerevice) {
		this.tokenService = tokenSerevice;
	}
	
	@PreAuthorize("hasAuthority('read')")
	@PostMapping("/token")
	public String token(Authentication auth) {
		LOG.info("Token requested for user: '{}' ",auth.getName());
		String token = tokenService.generateToken(auth);
		LOG.info("Token granted {} : " +token);
		return token;
	}
	

}
