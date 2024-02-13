package com.example.nnpiacv01.controllers;

import com.example.nnpiacv01.services.GreetingService;

public class PropertyController {
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
