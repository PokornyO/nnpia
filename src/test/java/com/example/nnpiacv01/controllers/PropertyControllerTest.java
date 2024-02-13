package com.example.nnpiacv01.controllers;

import com.example.nnpiacv01.services.GreetingServiceImplementation;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PropertyControllerTest {
    @Autowired
    PropertyController propertyController;
//    @BeforeEach
//    void setUp() {
//        propertyController = new PropertyController();
//        propertyController.greetingService = new GreetingServiceImplementation();
//    }

    @Test
    void sayHello() {
        System.out.println(propertyController.sayHello());
    }
}