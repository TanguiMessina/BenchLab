package com.example.app.benchlab.rest;

import com.example.app.benchlab.entity.Status;
import com.example.app.benchlab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/users")
public class RestUserControler {
    @Autowired
    private UserService service;

/*    public boolean createUser(
            @RequestParam(value = "firstname", required = true) String firstname,
            @RequestParam(value = "lastname", required = true) String lastname,
            @RequestParam(value = "email", required = true) String email,
            @RequestParam(value = "password", required = true) String password,
            @RequestParam(value = "status", required = true) Status status){
            boolean userToCreate = service.register(firstname, lastname, email, password, status);
        return userToCreate;
    }*/
}
