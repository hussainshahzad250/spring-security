package com.shahzad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HomeController {

	@GetMapping(value = "/")
	public String root() {
		log.info("Welcome to Spring Security");
		return "Welcome to Spring Security";
	}
}
