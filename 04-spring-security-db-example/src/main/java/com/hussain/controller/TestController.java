package com.hussain.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class TestController {

    @GetMapping(value = "/")
    public String home() {
        return "Welcome to Spring Boot Security";
    }

    @GetMapping(value = "/test")
    public String test() {
        return "Welcome to Spring Boot Security";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Security";
    }

}
