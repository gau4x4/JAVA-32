package main.com.jse.lect08;

import java.lang.*;
public class Student implements Comparable<Student>{
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public int compareTo(Student student) {
        return this.lastName.compareTo(student.lastName);
    }
}