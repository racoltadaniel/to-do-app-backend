package com.dani.webapp.repository;

import com.dani.webapp.data.ToDoUserDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by dani on 17/05/2020
 */
public interface ToDoUserDetailsRepository extends MongoRepository<ToDoUserDetails, String>
{
}
