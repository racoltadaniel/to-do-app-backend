package com.dani.webapp.repository;

import com.dani.webapp.data.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by dani on 28/04/2020
 */
public interface ToDoRepository extends MongoRepository<ToDo,String>
{
}
