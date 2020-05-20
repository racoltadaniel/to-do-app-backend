package com.dani.webapp.service;

import com.dani.webapp.data.ToDoUserDetails;
import com.dani.webapp.repository.ToDoUserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dani on 17/05/2020
 */
@Service
public class ToDoUserDetailsService
{

    private @Autowired
    PasswordEncoder passwordEncoder;
    private @Autowired
    ToDoUserDetailsRepository toDoUserDetailsRepository;

    public ToDoUserDetails createUser(ToDoUserDetails toDoUserDetails)
    {
        toDoUserDetails.setPassword(passwordEncoder.encode(toDoUserDetails.getPassword()));
        return toDoUserDetailsRepository.save(toDoUserDetails);
    }


    public List<ToDoUserDetails> getAll()
    {
        return toDoUserDetailsRepository.findAll();
    }
}
