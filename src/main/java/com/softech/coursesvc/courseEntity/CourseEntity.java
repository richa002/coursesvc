package com.softech.coursesvc.courseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CourseEntity {

    @Id
    private long courseId;// primary key
    private String courseName;
    private boolean isActive;
    private double fees;
    private String currency;
    private int days;
    private String type;


}
