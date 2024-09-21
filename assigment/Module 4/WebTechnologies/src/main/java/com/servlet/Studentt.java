package com.servlet;



import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SubmitStudent")
public class Studentt extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Fetching data from the request
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String gender = request.getParameter("gender");
        String password = request.getParameter("password");

        // Store data in request scope
        request.setAttribute("fname", fname);
        request.setAttribute("lname", lname);
        request.setAttribute("email", email);
        request.setAttribute("mobile", mobile);
        request.setAttribute("gender", gender);
        request.setAttribute("password", password);

        // Forward to the result JSP page
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
