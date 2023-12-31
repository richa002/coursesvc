package com.softech.coursesvc;

import com.softech.coursesvc.entity.CourseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CourseList {
    private List<CourseEntity> courses;
    private int noOfRecords;
}
