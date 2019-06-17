package com.example.app.benchlab.rest;

import com.example.app.benchlab.entity.Status;
import com.example.app.benchlab.entity.User;
import com.example.app.benchlab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RestUserControler {
    @Autowired
    private UserService service;


}
