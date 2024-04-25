package com.example.githubactionsdemousingspring;// HelloWorldController.java

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/ankit")
    public String helloWorld() {
        return "Hello, World!!";
    }
}
