package com.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.bean.User;
import com.dao.UserDao;


public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String action = request.getParameter("action");
	        
	        if ("register".equals(action)) {
	            // Registration logic
	            User user = new User();
	            user.setFirstName(request.getParameter("firstName"));
	            user.setLastName(request.getParameter("lastName"));
	            user.setEmail(request.getParameter("email"));
	            user.setMobile(request.getParameter("mobile"));
	            user.setAddress(request.getParameter("address"));
	            user.setGender(request.getParameter("gender"));
	            user.setPassword(request.getParameter("password"));

	            boolean result = UserDao.registerUser(user);
	            if (result) {
	                request.setAttribute("message", "Registration Successful!");
	            } else {
	                request.setAttribute("message", "Registration Failed. Email may already be in use.");
	            }
	            RequestDispatcher dispatcher = request.getRequestDispatcher("signup.jsp");
	            dispatcher.forward(request, response);
	        } else if ("login".equals(action)) {
	            // Login logic
	            String email = request.getParameter("email");
	            String password = request.getParameter("password");
	            User user = UserDao.loginUser(email, password);
	            if (user != null) {
	                HttpSession session = request.getSession();
	                session.setAttribute("user", user);
	                response.sendRedirect("main.jsp");
	            } else {
	                request.setAttribute("error", "Invalid credentials!");
	                RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
	                dispatcher.forward(request, response);
	            }
	        }
	    }
	}



