package com.example.controller;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

import com.servlet.Studentt;

public class Dao {
	    private void getConnection() {
	        // Implement database connection logic
	    }

	    public void addStudent(Statement student) {
	        // SQL INSERT operation
	    }

	    public void updateStudent(Studentt student) {
	        // SQL UPDATE operation
	    }

	    public void deleteStudent(int id) {
	        // Move record to deleted_students
	    }

	    public List<Statement> getAllStudents() {
			return null;
	        // SQL SELECT operation to fetch all students
	    }
	}



