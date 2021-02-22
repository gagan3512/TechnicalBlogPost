package com.upgrad.technicalblogpost.controller;

import com.upgrad.technicalblogpost.model.user;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @RequestMapping("users/login")
    public String login(){
        return "users/login";
    }

    @RequestMapping("users/registration")
    public String registration()
    {
       return "users/registration";

    }

    @RequestMapping(value = "users/login", method= RequestMethod.POST)
    public String loginUser(user user)
    {
        return "redirect:/posts";
    }



}
