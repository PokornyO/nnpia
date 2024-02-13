package com.example.nnpiacv01.controllers;

import com.example.nnpiacv01.services.GreetingServiceImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterControllerTest {
    SetterController setterController;
    @BeforeEach
    void setUp() {
        setterController = new SetterController();
        setterController.setGreetingService(new GreetingServiceImplementation());
    }

    @Test
    void sayHello() {
        System.out.println(setterController.sayHello());
    }
}