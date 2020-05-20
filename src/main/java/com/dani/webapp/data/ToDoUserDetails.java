package com.dani.webapp.data;

import com.google.common.collect.Lists;
import org.springframework.data.annotation.Id;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

/**
 * Created by dani on 17/05/2020
 */
public class ToDoUserDetails implements UserDetails
{
    private List<GrantedAuthority> authorityList;

    private String password;

    @Id
    private String username;

    public ToDoUserDetails(String password, String username)
    {
        this.password = password;
        this.username = username;
        this.authorityList = Lists.newArrayList(new SimpleGrantedAuthority("USER"));
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities()
    {
        return authorityList;
    }

    @Override
    public String getPassword()
    {
        return this.password;
    }

    @Override
    public String getUsername()
    {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired()
    {
        return true;
    }

    @Override
    public boolean isAccountNonLocked()
    {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired()
    {
        return true;
    }

    @Override
    public boolean isEnabled()
    {
        return true;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setAuthorityList(List<GrantedAuthority> authorityList)
    {
        this.authorityList = authorityList;
    }
}
