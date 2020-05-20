package com.dani.webapp.controller;

import com.dani.webapp.data.ToDo;
import com.dani.webapp.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by dani on 28/04/2020
 */
@RestController
@RequestMapping("/api/todo")
public class ToDoController
{

    @Autowired
    private ToDoService toDoService;

    @GetMapping
    public List<ToDo> findAll(){
        return toDoService.findAll();
    }

    @GetMapping("/{id}")
    public ToDo findById(@PathVariable String id){
        return toDoService.findById(id);
    }

    @PostMapping
    public ToDo create(@RequestBody ToDo toDo){
        return toDoService.save(toDo);
    }

    @PutMapping("/{id}")
    public ToDo update(@RequestBody ToDo toDo){
        return toDoService.save(toDo);
    }

    @PutMapping("/complete/{id}")
    public ToDo complete(@PathVariable String id){
        final ToDo todo = toDoService.findById(id);
        todo.setCompleted(true);
        return toDoService.save(todo);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
        toDoService.deleteById(id);
    }
}
