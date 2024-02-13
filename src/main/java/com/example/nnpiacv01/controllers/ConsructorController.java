package com.example.nnpiacv01.controllers;

import com.example.nnpiacv01.services.GreetingService;

public class ConsructorController {
    GreetingService  greetingService;
    public ConsructorController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
