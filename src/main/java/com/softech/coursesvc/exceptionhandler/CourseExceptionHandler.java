package com.softech.coursesvc.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CourseExceptionHandler {
    @ExceptionHandler(CourseNotFoundException.class)
    public ResponseEntity<ErrorMessageCustom> exceptionHandler(CourseNotFoundException e) {
        {
            ErrorMessageCustom errorMessage = new ErrorMessageCustom();
            errorMessage.setErrorMsg("Course not found");
            errorMessage.setCode(1001);
            return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);

        }
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorMessageCustom> exceptionHandler2(CourseNotFoundException e) {
        {
            ErrorMessageCustom errorMessage = new ErrorMessageCustom();
            errorMessage.setErrorMsg("Internal server error");
            errorMessage.setCode(1003);
            return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }
    @ExceptionHandler(ValidationFailedException.class)
    public ResponseEntity<ErrorMessageCustom> exceptionHandler3(CourseNotFoundException e) {
        {
            ErrorMessageCustom errorMessage = new ErrorMessageCustom();
            errorMessage.setErrorMsg("Validation failed");
            errorMessage.setCode(1002);
            return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);

        }
    }

}

