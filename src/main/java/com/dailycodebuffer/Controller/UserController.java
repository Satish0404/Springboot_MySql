package com.dailycodebuffer.Controller;

import com.dailycodebuffer.Model.User;
import com.dailycodebuffer.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    public String createUser(@RequestBody User user) {
        userRepository.save(user);
        return "User Added Successfully!!";
    }
    @GetMapping("/user")
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{Dep}")
    public Optional<User> getDetails(@PathVariable("Dep") Integer dep){
        return userRepository.findById(dep);
    }

    @GetMapping("/test")
    public String test(){
        return "connection ok";
    }

}
