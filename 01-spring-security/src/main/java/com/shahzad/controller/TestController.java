package com.shahzad.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

	@GetMapping(value = "/test")
	public String test() {
		log.info("Welcome to Spring Boot Security");
		return "Welcome to Spring Boot Security";
	}
}
