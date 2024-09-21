package com.example.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/students")
public class StudentServlet<Student> extends HttpServlet {
    private Connection connect() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/yourdb";
        String user = "username";
        String password = "password";
        return DriverManager.getConnection(url, user, password);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Validation Logic here
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String gender = request.getParameter("gender");
        String password = request.getParameter("password");

        // Insert student logic
        try (Connection conn = connect()) {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO students (fname, lname, email, mobile, gender, password) VALUES (?, ?, ?, ?, ?, ?)");
            stmt.setString(1, fname);
            stmt.setString(2, lname);
            stmt.setString(3, email);
            stmt.setString(4, mobile);
            stmt.setString(5, gender);
            stmt.setString(6, password);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect("show.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Logic to show students
        List<Student> students = new ArrayList<>();
        try (Connection conn = connect()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                Student student = new Student();
                student.setid(rs.getInt("id"));
                student.setfname(rs.getString("fname"));
                student.setlname(rs.getString("lname"));
                student.setemail(rs.getString("email"));
                student.setmobile(rs.getString("mobile"));
                student.setgender(rs.getString("gender"));
                student.setpassword(rs.getString("password"));
                students.add(student);
            }
            request.setAttribute("students", students);
            request.getRequestDispatcher("show.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Logic to delete student
        int id = Integer.parseInt(request.getParameter("id"));
        try (Connection conn = connect()) {
            conn.setAutoCommit(false);

            // Move record to deleted_data
            PreparedStatement deleteStmt = conn.prepareStatement("INSERT INTO deleted_data (fname, lname, email, mobile, gender, password) SELECT fname, lname, email, mobile, gender, password FROM students WHERE id = ?");
            deleteStmt.setInt(1, id);
            deleteStmt.executeUpdate();

            // Delete from students
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM students WHERE id = ?");
            stmt.setInt(1, id);
            stmt.executeUpdate();

            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect("show.jsp");
    }
}
