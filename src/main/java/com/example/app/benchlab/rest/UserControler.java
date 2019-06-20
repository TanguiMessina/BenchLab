package com.example.app.benchlab.rest;

import com.example.app.benchlab.entity.User;
import com.example.app.benchlab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "/")
public class UserControler {
    @Autowired
    private UserService service;


    @GetMapping
    public ModelAndView home(){
        ModelAndView model = new ModelAndView("index");
        return model;
    }

    @GetMapping(value = "registration")
    public ModelAndView registraion(@ModelAttribute("user") User user){
        ModelAndView mv = new ModelAndView("registration");
        return mv;
    }

    @PostMapping(value = "user/registration")
    public String registration(
            @ModelAttribute("user") User user){
        service.register(user);
        return "test";
    }

    @GetMapping(value = "user/{id}")
    public String findUserById(@PathVariable("id") Long id, Model model) {
        User userToFind = service.findUserById(id);
        model.addAttribute("user", userToFind);
        if (userToFind != null) {
            return "user.html";
        }
        return "index.html";
    }
}
