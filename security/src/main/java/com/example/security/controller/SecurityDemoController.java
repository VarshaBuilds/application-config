package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityDemoController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Home Page!";
    }

    @GetMapping("/user")
    public String userPage() {
        return "Hello User!";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "Hello Admin!";
    }
}
