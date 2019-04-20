package com.sarahhospital.demo.controllers;

import com.sarahhospital.demo.model.Greeting;
import com.sarahhospital.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping(value = "/greeter", produces = MediaType.APPLICATION_JSON_VALUE)
    public Greeting sendGreeting() {
        return greetingService.composeGreeting();
    }
}


