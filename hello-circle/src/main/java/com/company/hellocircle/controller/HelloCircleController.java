package com.company.hellocircle.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCircleController {

    @GetMapping(value = "/hello")
    @ResponseStatus(HttpStatus.OK)
    public String helloCircle(){
        return "Hello, Circle!";
    }

    @GetMapping(value = "/answer")
    public String getAnswer(){
        return "The answer is 42!";
    }
}
