package com.example;

public class Student {
    private int studentID;
    private String studentName;
    private String course;

    public Student(int studentID, String studentName) {
        super();
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String toString() {
        return "[ID: " + this.studentID + ", Name: " + this.studentName + ", Course:" + this.course + "]";
    }
}
