package com.example.demo.Services;

import java.util.List;

import com.example.demo.models.Course;


public interface CourseService {
    List <Course> getAllCourses();
    Course getCourseById(long id);
    //void AddCourse();
}
