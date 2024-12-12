package com.example.FitnesSystem.Controller;

import com.example.FitnesSystem.Entity.User;
import com.example.FitnesSystem.Service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }
    @PostMapping("/register")
    public User registerUser(@RequestParam String name){
        return userService.registerUser(name);
    }
}
