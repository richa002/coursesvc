package com.softech.coursesvc.service;

import com.softech.coursesvc.entity.CourseEntity;
import com.softech.coursesvc.model.Course;
import com.softech.coursesvc.repository.CourseRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseSvc {
    @Autowired
    private CourseRepos courseRepos;

    public List<CourseEntity> getAllCourses() {
        return courseRepos.findAll();
    }


    public CourseEntity getCourseById(Long courseId) {
        return courseRepos.findById(courseId).orElse(null);
    }
}
