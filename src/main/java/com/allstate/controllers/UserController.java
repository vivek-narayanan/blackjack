package com.allstate.controllers;

import com.allstate.entities.User;
import com.allstate.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "users")
public class UserController {

    private UserService service;

    @Autowired
    public void setService(UserService service) {
        this.service = service;
    }

    @RequestMapping(value = "" , method = RequestMethod.POST)
    public User createUser(@RequestBody User user){
        return this.service.create(user);
    }

    @RequestMapping(value = "" , method = RequestMethod.GET)
    public Iterable<User> findUser(){
        return this.service.findUsers();
    }

    @RequestMapping(value = "{id}" , method = RequestMethod.GET)
    public User findById(@PathVariable int id){
        return this.service.findById(id);
    }

}