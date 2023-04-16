package com.capgemini.pfe.controller;

import com.capgemini.pfe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String getIndexPage(Model model){
        model.addAttribute("users", userService.findAllUsers());
        return "index";
    }

}
