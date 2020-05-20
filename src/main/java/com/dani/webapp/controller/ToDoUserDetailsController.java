package com.dani.webapp.controller;

import com.dani.webapp.data.ToDoUserDetails;
import com.dani.webapp.service.ToDoUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by dani on 17/05/2020
 */
@RestController
@RequestMapping("/user")
public class ToDoUserDetailsController
{

    private @Autowired
    ToDoUserDetailsService toDoUserDetailsService;

    @PostMapping
    public ToDoUserDetails create(@RequestBody ToDoUserDetails toDoUserDetails)
    {
        return toDoUserDetailsService.createUser(toDoUserDetails);
    }

    @GetMapping
    public List<ToDoUserDetails> getAll()
    {
        return toDoUserDetailsService.getAll();
    }

    @PostMapping(value = "/something")
    public void printSomething()
    {
        System.out.println("something");
    }

}
