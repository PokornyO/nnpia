package com.example.nnpiacv01.controllers;

import com.example.nnpiacv01.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterController {

    private GreetingService greetingService;
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
