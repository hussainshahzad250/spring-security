package com.shahzad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class RegisterController {

	@GetMapping(value = "/register")
	public String register() {
		log.info("This is register controller");
		return "This is register controller";
	}
}
