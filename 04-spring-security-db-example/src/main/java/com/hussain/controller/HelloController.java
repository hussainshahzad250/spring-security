package com.hussain.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/test")
    public String securedWithAnyRole() {
        return "Secured without Role";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/all")
    public String securedWithRole() {
        return "Secured with ADMIN Role";
    }


}
