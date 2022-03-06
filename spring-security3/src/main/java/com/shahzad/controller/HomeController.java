package com.shahzad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HomeController {

	@GetMapping(value = "/home")
	public String home() {
		log.info("This is home controller");
		return "This is home controller";
	}
}
