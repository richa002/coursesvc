package com.softech.coursesvc.courseService;

import com.softech.coursesvc.courseRepo.CourseRepos;
import com.softech.coursesvc.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseSvc {
    @Autowired

    private CourseRepos courseRepository;

    public List<Course> getAllCourses(){
        return courseRepository.findAll();

    }

    public Course getCourseById(long courseId){
        return courseRepository.findById(courseId);
    }
}
