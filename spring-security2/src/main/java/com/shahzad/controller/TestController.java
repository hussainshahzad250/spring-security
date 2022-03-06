package com.shahzad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TestController {

	@GetMapping(value = "/")
	public String root() {
		log.info("Welcome to Spring Boot");
		return "Welcome to Spring Boot";
	}

	@GetMapping(value = "/test")
	public String test() {
		log.info("Welcome to Spring Boot Security");
		return "Welcome to Spring Boot Security";
	}

}
