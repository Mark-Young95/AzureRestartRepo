package com.revature.AzureRestartDemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring boot";
    }

    @GetMapping("/hi")
    public String hi() {
        return "Hi from Spring Boot!";
    }
}
