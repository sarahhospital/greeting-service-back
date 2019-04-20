package com.sarahhospital.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Greeting {

    private String message;

    public Greeting() {

    }
}
