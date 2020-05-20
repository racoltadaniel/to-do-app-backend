package com.dani.webapp.service;

import com.dani.webapp.data.ToDo;
import com.dani.webapp.exception.EntityNotFoundException;
import com.dani.webapp.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by dani on 28/04/2020
 */
@Service
public class ToDoService
{

    private @Autowired ToDoRepository toDoRepository;

    private String getUsername()
    {
        final Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            return ((UserDetails)principal).getUsername();
        } else {
            return principal.toString();
        }
    }

    public List<ToDo> findAll(){
        final String username = getUsername();
        return  toDoRepository.findAll().stream().filter(t -> username.equals(t.getUsername())).collect(Collectors.toList());
    }

    public ToDo findById(String id){
        return toDoRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public ToDo save(ToDo toDo){
        toDo.setUsername(getUsername());
        return toDoRepository.save(toDo);
    }

    public void deleteById(String id){
        toDoRepository.deleteById(id);
    }
}
