package com.capgemini.pfe.controller;

import com.capgemini.pfe.dto.UserDto;
import com.capgemini.pfe.service.UserService;
import com.capgemini.pfe.webClientApi.UserApiFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserApiFinder userApiFinder;
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String getAllUsers() {
        userApiFinder.sertLoadingUsers();
        System.out.println("Start consuming apis and loading users from : https://jsonplaceholder.typicode.com/users");
        return "Start loading users ................";

    }

    @GetMapping("web/user")
    public List<UserDto> getMyListOfUser() {
        return userService.findAllUsers();
    }
}
