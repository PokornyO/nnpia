package com.example.nnpiacv01.controllers;

import com.example.nnpiacv01.services.GreetingServiceImplementation;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyControllerTest {

    PropertyController propertyController;

    @BeforeEach
    void setUp() {
        propertyController = new PropertyController();
        propertyController.greetingService = new GreetingServiceImplementation();
    }

    @Test
    void sayHello() {
        System.out.println(propertyController.sayHello());
    }
}