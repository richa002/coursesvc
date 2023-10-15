package com.softech.coursesvc.repository;

import com.softech.coursesvc.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepos extends JpaRepository<CourseEntity,Long> {
}
