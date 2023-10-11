package com.softech.coursesvc.controller;

import com.softech.coursesvc.CourseRepository;
import com.softech.coursesvc.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;


    //dummy endpoint
    @GetMapping("/hello")
    public String hello() {
        return "Hello!!!";
    }

    @GetMapping("/v1/course/")
       public List<Course> getAllCourses()
    {
        return courseRepository.findAll();


    }
    @GetMapping("/v1/course/{courseId}")
    public Course getCourseById(@PathVariable long id)
    {
        return courseRepository.findById(id);
    }



}
