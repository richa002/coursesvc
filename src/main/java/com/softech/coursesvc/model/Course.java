package com.softech.coursesvc.model;


import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Course {
    @NotNull(message = "Course id is required")
    @Id
    private long courseId;// primary key
    @NotBlank(message = "Course Name is mandatory")
    private String courseName;
    @NotBlank(message = "Course status is mandatory")
    private boolean isActive;
    @NotNull(message = "Fees cannot be null")
    private double fees;
    @NotNull(message = "Currency cannot be null")
    private String currency;
    @NotNull(message = "Days are mandatory")
    private int days;
    @NotBlank (message ="Type is mandatory")
    private String type;
}