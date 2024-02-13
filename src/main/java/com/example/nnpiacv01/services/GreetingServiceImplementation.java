package com.example.nnpiacv01.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImplementation implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Greetings from service";
    }
}
