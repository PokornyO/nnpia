package com.example.nnpiacv01.controllers;

import com.example.nnpiacv01.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorController {
    GreetingService  greetingService;
    public ConstructorController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
