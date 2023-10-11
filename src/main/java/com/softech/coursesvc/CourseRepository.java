package com.softech.coursesvc;

import com.softech.coursesvc.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface CourseRepository extends JpaRepository<Course, Long>{

    Course findById(long id);
}

