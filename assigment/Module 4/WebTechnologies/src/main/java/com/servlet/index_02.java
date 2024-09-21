package com.servlet;

import java.io.IOException;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class index_02 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = request.getServletContext();

        String name = context.getInitParameter("name");
        String age = context.getInitParameter("age");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        response.getWriter().println("Name: " + name + "\nAge: " + age);
    }
}

