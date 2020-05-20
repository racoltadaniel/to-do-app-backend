package com.dani.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dani on 28/04/2020
 */
@RestController
public class HelloWorldController
{

    @GetMapping("/sayhello")
    public String sayHelloWorld()
    {
        return "HEllo world!";
    }

}
