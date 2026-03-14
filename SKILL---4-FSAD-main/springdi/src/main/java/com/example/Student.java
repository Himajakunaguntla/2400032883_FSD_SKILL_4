package com.example;

import org.springframework.stereotype.Component;

@Component
public class Student {

    private int studentId;
    private String name;
    private String course;
    private int year;

    public Student() {
        this.studentId = 102;
        this.name = "Bhavani";
        this.course = "Spring Core";
        this.year = 2026;
    }

    public void display() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Year: " + year);
    }
}