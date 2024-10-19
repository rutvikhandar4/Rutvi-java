package com.bean;

public class Student {
    private int id;
    private String firstName;
    private String contactNumber;
    private double marks;

    public Student(int id, String firstName, String contactNumber) {
        this.id = id;
        this.firstName = firstName;
        this.contactNumber = contactNumber;
        this.marks = 0.0; // Default marks
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + firstName + ", Contact: " + contactNumber + ", Marks: " + marks;
    }
}
