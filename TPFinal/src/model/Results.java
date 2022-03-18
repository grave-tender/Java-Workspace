package model;

import model.Student;
import model.Course;

public class Results {
    Student student;
    Course course;
    double marks1;
    double marks2;

    public Results(Student student, Course course, double marks1, double marks2) {
        this.student = student;
        this.course = course;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public double getMarks1() {
        return marks1;
    }

    public void setMarks1(double marks1) {
        this.marks1 = marks1;
    }

    public double getMarks2() {
        return marks2;
    }

    public void setMarks2(double marks2) {
        this.marks2 = marks2;
    }
}
