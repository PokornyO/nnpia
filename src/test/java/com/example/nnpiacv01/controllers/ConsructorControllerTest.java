package com.example.nnpiacv01.controllers;

import com.example.nnpiacv01.services.GreetingServiceImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsructorControllerTest {
    @Autowired
    ConstructorController constructorController;
//    @BeforeEach
//    void setUp() {
//        constructorController = new ConstructorController(new GreetingServiceImplementation());
//    }

    @Test
    void sayHello() {
        System.out.println(constructorController.sayHello());
    }
}