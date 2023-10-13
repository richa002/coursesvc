package com.softech.coursesvc.repository;

import com.softech.coursesvc.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface UserRepository extends JpaRepository<Course,Long>
 {
}
