package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Repositories.CourseRepository;
import com.example.demo.models.Course;

public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourseById(long id) {
        return courseRepository.findById(id);
    }
    
}
