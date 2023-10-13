package com.softech.coursesvc.controller;

import com.softech.coursesvc.model.Course;
import com.softech.coursesvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


import java.util.List;


@RestController
public class CourseController {



    //dummy endpoint
    @GetMapping("/hello")
    public String hello() {
        return "Hello!!!";
    }

    @Autowired
    public  UserService userService;  // dependency injection controller to commnicate with service

    @GetMapping("/users")
    public List<Course> getAllUser() {
        return userService.getAllUser();

    }

    @PostMapping("/courseName")
    public Course createUser(@RequestBody Course userEntity) {
        return userService.createUser(userEntity);
    }

    @DeleteMapping("{userId}")
    public void deleteUser(@PathVariable Integer userId) {
        userService.deleteUser(userId);
    }

    @PutMapping("/{userId}")
    public Course update (@PathVariable("id")int id,@RequestBody Course userEntity) {
        return userService.saveOrUpdate(userEntity);
    }}

