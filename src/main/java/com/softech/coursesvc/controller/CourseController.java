package com.softech.coursesvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {


    @GetMapping("/")
    public String hello(){
        return "Hello!!!";
    }


}
