package com.sarahhospital.demo.services.impl;

import com.sarahhospital.demo.model.Person;
import com.sarahhospital.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;

import java.net.URI;
import java.net.URISyntaxException;

@Service
public class PersonServiceImpl implements PersonService {

    private final RestOperations restOperations;
    private final URI personServiceUri;

    @Autowired
    public PersonServiceImpl(RestOperations restOperations, @Value("${person.service.uri}") String personServiceUri) throws URISyntaxException {
        this.restOperations = restOperations;
        this.personServiceUri = new URI(personServiceUri);
    }

    @Override
    public Person findPerson() {
        return restOperations
                .getForEntity(personServiceUri, Person.class)
                .getBody();
    }
}
