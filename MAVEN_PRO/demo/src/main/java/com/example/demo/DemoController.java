package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String home() {
        return "Hello, Maven Spring Boot!";
    }

    @GetMapping("/greet")
    public String greet() {
        return "Welcome to your first Maven Controller 🚀";
    }
}