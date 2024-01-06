package com.shahzad.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HomeController {

	@GetMapping(value = "/")
	public String home() {
		log.info("Welcome to Spring Security");
		return "Welcome to Spring Security";
	}
}
