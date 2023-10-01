package com.example.demo.models;

import com.example.demo.models.Domains.Courses;
import com.example.demo.models.Domains.Language;
import com.example.demo.models.Domains.SubCourses;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    

    @ManyToOne
    private Courses courseType;
    
    @ManyToOne
    private SubCourses courseSubType;

    @ManyToOne
    private Language language;

    @ManyToOne
    private Teacher teacher;

    private float rate;
    private float cost;
    private String description;

    
    public long getId() {
        return id;
    }
    public Courses getCourseType() {
        return courseType;
    }
    public void setCourseType(Courses courseType) {
        this.courseType = courseType;
    }
    public SubCourses getCourseSubType() {
        return courseSubType;
    }
    public void setCourseSubType(SubCourses courseSubType) {
        this.courseSubType = courseSubType;
    }
    public Language getLanguage() {
        return language;
    }
    public void setLanguage(Language language) {
        this.language = language;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public float getRate() {
        return rate;
    }
    public void setRate(float rate) {
        this.rate = rate;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


}
