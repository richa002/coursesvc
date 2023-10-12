package com.softech.coursesvc;

import com.softech.coursesvc.entity.CourseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class CourseList {
    List<CourseEntity> courses;
    int noOfRecords;
}
