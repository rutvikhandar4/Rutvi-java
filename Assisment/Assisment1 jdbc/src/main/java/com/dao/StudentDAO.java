package com.dao;

import com.bean.Student;
import java.util.ArrayList;

public class StudentDAO {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }

    public ArrayList<Student> viewAllStudents() {
        return students;
    }

    public Student viewSpecificStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}
