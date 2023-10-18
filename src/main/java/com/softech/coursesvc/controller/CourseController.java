package com.softech.coursesvc.controller;

import com.softech.coursesvc.CourseList;
import com.softech.coursesvc.entity.CourseEntity;
import com.softech.coursesvc.model.Course;
import com.softech.coursesvc.service.CourseSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/coursesvc")
public class CourseController {

    @Autowired
    private CourseSvc courseSvc;

    //dummy endpoint
    @GetMapping("/hello")
    public String hello() {
        return "Hello!!!";
    }

    @GetMapping("/v1/course")
    public CourseList getCourses() {
        CourseList courseList = new CourseList();
        List<CourseEntity> courses = courseSvc.getAllCourses();
        courseList.setCourses(courses);
        courseList.setNoOfRecords(courses.size());
        return courseList;

    }


@GetMapping("/v1/course/{courseId}")
public ResponseEntity<CourseEntity> getCourseById(@PathVariable Long courseId)
{
    CourseEntity course= courseSvc.getCourseById(courseId);
    if(course != null)
    {
        return new ResponseEntity<CourseEntity>(course, HttpStatus.OK);
    }else {
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);


    }
}
}
