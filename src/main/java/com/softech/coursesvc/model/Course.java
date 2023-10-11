package com.softech.coursesvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Course {

@Id
private long courseId;
    private String courseName;
    private boolean isActive;
    private double fees;
    private String currency;
    private int days;
    private String type;
}