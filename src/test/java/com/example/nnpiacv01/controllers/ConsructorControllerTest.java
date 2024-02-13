package com.example.nnpiacv01.controllers;

import com.example.nnpiacv01.services.GreetingServiceImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsructorControllerTest {

    ConsructorController consructorController;
    @BeforeEach
    void setUp() {
        consructorController = new ConsructorController(new GreetingServiceImplementation());
    }

    @Test
    void sayHello() {
        System.out.println(consructorController.sayHello());
    }
}