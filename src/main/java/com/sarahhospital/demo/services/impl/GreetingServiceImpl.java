package com.sarahhospital.demo.services.impl;

import com.sarahhospital.demo.model.Greeting;
import com.sarahhospital.demo.services.GreetingService;
import com.sarahhospital.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    private final PersonService personService;

    @Autowired
    public GreetingServiceImpl(PersonService personService) {
        this.personService = personService;
    }

    @Override
    public Greeting composeGreeting() {
        return new Greeting("Hello, " + personService.findPerson().getName() + "! May the Force be with you.");
    }
}
