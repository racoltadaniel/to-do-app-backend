package com.dani.webapp.configuration;

import com.dani.webapp.repository.ToDoUserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by dani on 17/05/2020
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService
{
    private @Autowired
    ToDoUserDetailsRepository toDoUserDetailsRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        return toDoUserDetailsRepository.findById(username)
                .orElseThrow(() -> new UsernameNotFoundException(String.format("Username %s not found", username)));
    }

}
