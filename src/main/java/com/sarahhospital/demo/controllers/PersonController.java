package com.sarahhospital.demo.controllers;

import com.sarahhospital.demo.model.Person;
import com.sarahhospital.demo.services.impl.PersonServiceImpl;
import org.springframework.context.annotation.Profile;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private PersonServiceImpl personService;

    public PersonController(PersonServiceImpl personService) {
        this.personService = personService;
    }

    @GetMapping(value = "/person", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPerson() {
        return personService.findPerson();
    }
}
