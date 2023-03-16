package com.procesos.concesionario.controllers;

import com.procesos.concesionario.models.ConsessionaryUser;
import com.procesos.concesionario.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
    @Autowired
    private UserService userService;

    @GetMapping(value = "/user/{id}")
    public ConsessionaryUser getById(@PathVariable(name = "id") Long id)
    {
        return userService.getUserById(id).get();
    }
}
