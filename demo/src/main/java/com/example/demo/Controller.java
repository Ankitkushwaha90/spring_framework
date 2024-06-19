package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController 
public class Controller {
    
    @GetMapping("/get")
    public String doGet() {
        return "Hey, this is my new application in java spring framework";
    }
    
}
