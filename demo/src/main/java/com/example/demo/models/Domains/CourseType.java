package com.example.demo.models.Domains;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CourseType {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    
    private String name;

    @Column (columnDefinition = "boolean default true")
    private boolean isAcive;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAcive() {
        return isAcive;
    }

    public void setAcive(boolean isAcive) {
        this.isAcive = isAcive;
    }
    
}
