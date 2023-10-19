package com.softech.coursesvc.exceptionhandler;

public class ValidationFailedException extends RuntimeException {
    public ValidationFailedException(String message){
        super(message);
    }
}
