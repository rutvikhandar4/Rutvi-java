package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import com.bean.Cart;
import com.bean.User;
import com.bean.Wishlist;
import com.dao.CartDao;
import com.dao.UserDao;
import com.dao.WishlistDao;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		
		if(action.equalsIgnoreCase("register"))
		{
			boolean flag=UserDao.checkEmail(request.getParameter("email"));
			
			if(flag==false)
			{
				if(request.getParameter("password").equals(request.getParameter("cpassword")))
				{
					User u=new User();
					u.setUsertype(request.getParameter("usertype"));;
					u.setFname(request.getParameter("fname"));
					u.setLname(request.getParameter("lname"));
					u.setEmail(request.getParameter("email"));
					u.setMobile(Long.parseLong(request.getParameter("mobile")));
					u.setAddress(request.getParameter("address"));
					u.setPassword(request.getParameter("password"));
					UserDao.registerUser(u);
					request.setAttribute("msg", "User Registered Successfully");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
				else
				{
					request.setAttribute("msg", "Password & Confirm Password Does Not Matched");
					request.getRequestDispatcher("register.jsp").forward(request, response);
				}
			}
			else
			{
				request.setAttribute("msg", "Email Already Registered");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("login"))
		{
			User u=UserDao.loginUser(request.getParameter("email"));
			if(u!=null)
			{
				if(u.getPassword().equals(request.getParameter("password")))
				{
					List<Wishlist> list=WishlistDao.getWishlistByUser(u.getUid());
					List<Cart> list1=CartDao.getCartByUser(u.getUid());
					HttpSession session=request.getSession();
					session.setAttribute("u", u);
					session.setAttribute("wishlist_count", list.size());
					session.setAttribute("cart_count", list1.size());
					if(u.getUsertype().equals("buyer"))
					{
						request.getRequestDispatcher("index.jsp").forward(request, response);
					}
					else
					{
						request.getRequestDispatcher("seller-index.jsp").forward(request, response);
					}
				}
				else
				{
					request.setAttribute("msg", "Incorrect Password");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			}
			else
			{
				request.setAttribute("msg", "Email Not Registered");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("change password"))
		{
			HttpSession session=request.getSession();
			User u=(User)session.getAttribute("u");
			if(u.getPassword().equals(request.getParameter("old_password")))
			{
				if(request.getParameter("new_password").equals(request.getParameter("cnew_password")))
				{
					if(!u.getPassword().equals(request.getParameter("new_password")))
					{
						UserDao.changePassword(u.getEmail(), request.getParameter("new_password"));
						response.sendRedirect("logout.jsp");
					}
					else
					{
						request.setAttribute("msg", "Old Password & New Password Can Not Be Same");
						request.getRequestDispatcher("change-password.jsp").forward(request, response);
					}
				}
				else
				{
					request.setAttribute("msg", "New Password & Confirm New Password Does Not Matched");
					request.getRequestDispatcher("change-password.jsp").forward(request, response);
				}
			}
			else
			{
				request.setAttribute("msg", "Old Password Does Not Matched");
				request.getRequestDispatcher("change-password.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("send otp"))
		{
			boolean flag=UserDao.checkMobile(Long.parseLong(request.getParameter("mobile")));
			String mobile=request.getParameter("mobile");
			if(flag==true)
			{
				Random t = new Random();
		    	int minRange = 1000, maxRange= 9999;
	        	int otp = t.nextInt(maxRange - minRange) + minRange;
				try {
					HttpResponse response1 = Unirest.get("https://www.fast2sms.com/dev/bulkV2?authorization=DwF5Auzh16qo3fXC2JMSTcOiyBEZmWH0eR8GIg4NbQrpUnKsjvhz0YwyOCGvHJEFuXRrTc7feDVaM1NA&variables_values="+otp+"&route=otp&numbers="+mobile)
							  .header("cache-control", "no-cache")
							  .asString();
					System.out.println(response1);
					request.setAttribute("mobile", mobile);
					request.setAttribute("otp", otp);
					request.getRequestDispatcher("otp-mobile.jsp").forward(request, response);
				} catch (UnirestException e) {
					e.printStackTrace();
				}
				
			}
			else
			{
				request.setAttribute("msg", "Mobile Not Registered");
				request.getRequestDispatcher("forgot-password.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("update profile"))
		{
			HttpSession session=request.getSession();
			User u=(User)session.getAttribute("u");
			u.setFname(request.getParameter("fname"));
			u.setLname(request.getParameter("lname"));
			u.setEmail(request.getParameter("email"));
			u.setMobile(Long.parseLong(request.getParameter("mobile")));
			u.setAddress(request.getParameter("address"));
			UserDao.updateProfile(u);
			System.out.println(u.getUsertype());
			session.setAttribute("u", u);
			response.sendRedirect("index.jsp");
		}
	}

}
