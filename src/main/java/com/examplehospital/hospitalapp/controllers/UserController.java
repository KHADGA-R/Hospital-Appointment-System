package com.examplehospital.hospitalapp.controllers;

import com.examplehospital.hospitalapp.models.User;
import com.examplehospital.hospitalapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(){ }

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/")
    @ResponseBody
    public void createUser(@RequestBody User user){
        System.out.println("UserController: user =" + user);
        userService.createUser(user);
    }

    @GetMapping("/")
    @ResponseBody
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/user_id")
    @ResponseBody
    public User getUserById(@PathVariable("user_id") int id){
        return userService.getUserById(id);
    }

    @PutMapping("/")
    @ResponseBody
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }

    @DeleteMapping("/user_id")
    @ResponseBody
    public void deleteUser(@PathVariable("user_id") int id){
        userService.deleteUser(userService.getUserById(id));
    }








}
