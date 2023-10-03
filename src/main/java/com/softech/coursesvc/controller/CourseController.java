package com.softech.coursesvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {


    //dummy endpoint
    @GetMapping("/hello")
    public String hello() {
        return "Hello!!!";
    }


}
