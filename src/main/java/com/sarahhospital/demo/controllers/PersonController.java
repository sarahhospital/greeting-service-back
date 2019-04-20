package com.sarahhospital.demo.controllers;

import com.sarahhospital.demo.model.Person;
import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("dev")
public class PersonController {

    @GetMapping(value = "/person", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPerson() {
        return new Person("Sara");
    }
}
