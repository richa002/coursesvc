package com.softech.coursesvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Course {
    @Id

    private long courseId;// primary key
    private String courseName;
    private boolean isActive;
    private double fees;
    private String currency;
    private int days;
    private String type;
}