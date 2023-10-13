package com.softech.coursesvc.service;

import com.softech.coursesvc.model.Course;
import com.softech.coursesvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;
    public List<Course> getAllUser() {
        return userRepository.findAll();

    }


    public Course createUser(Course userEntity) {
        return userRepository.save(userEntity);
    }

    public void deleteUser(long userId) {
        userRepository.deleteById(userId);
    }

    public Course saveOrUpdate(Course myEntity) {
        return userRepository.save(myEntity);
    }




}

