package com.dani.webapp.data;

import org.springframework.data.annotation.Id;

/**
 * Created by dani on 28/04/2020
 */
public class ToDo
{
    @Id
    private String id;

    private String title;

    private Boolean completed;

    private String username;

    public ToDo(String title, Boolean completed)
    {
        this.title = title;
        this.completed = completed;
    }

    public String getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public Boolean getCompleted()
    {
        return completed;
    }

    public void setCompleted(Boolean completed)
    {
        this.completed = completed;
    }
}
