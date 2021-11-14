package com.hofmann.SpringBoot.tutorial.controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/")
    public String helloWorld(){
        return "Hallo jungs";
    }

}
