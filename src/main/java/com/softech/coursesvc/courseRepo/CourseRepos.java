package com.softech.coursesvc.courseRepo;

import com.softech.coursesvc.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CourseRepos extends JpaRepository<Course, Long>{

    Course findById(long id);
}

