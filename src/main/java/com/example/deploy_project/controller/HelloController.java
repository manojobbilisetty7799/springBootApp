package com.example.deploy_project.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Map<String, String> sayHello() {
        return Map.of(
                "message", "Hello from Spring Boot!",
                "status", "success"
        );
    }
}