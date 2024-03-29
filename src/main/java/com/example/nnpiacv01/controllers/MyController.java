package com.example.nnpiacv01.controllers;

import com.example.nnpiacv01.services.GreetingService;
import com.example.nnpiacv01.services.GreetingServiceImplementation;

public class MyController {
    private final GreetingService greetingService;
    public MyController() {
        this.greetingService = new GreetingServiceImplementation();
    }
    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
