package com.example.nnpiacv01.controllers;

import com.example.nnpiacv01.services.GreetingService;

public class SetterController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
