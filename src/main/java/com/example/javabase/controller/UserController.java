package com.example.javabase.controller;


import com.example.javabase.model.User;
import com.example.javabase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> listUsers() {
        List<User> users = userService.getAllUsers();
        return users;
    }

    @GetMapping("/{id}")
    public User viewUser(@PathVariable Long id) {
        User user = userService.getUserById(id);
        return user;
    }


    @PostMapping("/add")
    public String addUser(User user) {
        userService.saveUser(user);
        return "Created";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "Deleted";
    }
}
