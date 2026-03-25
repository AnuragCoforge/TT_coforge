package com.coforge.controllers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.coforge.entities.User;
import com.coforge.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> findAll() {
    	logger.info("Fetching All Users Info");
        return userService.findAll();
    }

    @PostMapping("/")
    public User save(@RequestBody User user) {
    	logger.info("Saving User info {}", user);
        return userService.save(user);
    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable long id) {
    	logger.info("Fetching user by user id {}", id);
        return userService.findById(id);
    }
}