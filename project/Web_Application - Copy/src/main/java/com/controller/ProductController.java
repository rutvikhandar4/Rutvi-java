package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;

import com.bean.Product;
import com.bean.User;
import com.dao.ProductDao;
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 512, maxFileSize = 1024 * 1024 * 512, maxRequestSize = 1024 * 1024* 512) // 512MB
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String extractfilename(Part file) {
		String cd = file.getHeader("content-disposition");
		System.out.println(cd);
		String[] items = cd.split(";");
		for (String string : items) {
			if (string.trim().startsWith("filename")) {
				return string.substring(string.indexOf("=") + 2, string.length() - 1);
			}
		}
		return "";
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		System.out.println(action);
		HttpSession session=request.getSession();
		User u=(User)session.getAttribute("u");
		
		if(action.equalsIgnoreCase("add product"))
		{
			Product p=new Product();
			p.setProduct_category(request.getParameter("product_category"));
			p.setProduct_name(request.getParameter("product_name"));
			p.setProduct_price(Integer.parseInt(request.getParameter("product_price")));
			p.setProduct_desc(request.getParameter("product_desc"));
			p.setUid(u.getUid());
			
			String savePath = "C:\\Users\\hp\\advance-java-work\\Web_Application\\src\\main\\webapp\\product_images";
			File fileSaveDir = new File(savePath);
			if (!fileSaveDir.exists()) {
				fileSaveDir.mkdir();
			}
			Part file1 = request.getPart("product_image");
			String fileName = extractfilename(file1);
			file1.write(savePath + File.separator + fileName);
			String savePath2 = "C:\\Users\\hp\\advance-java-work\\Web_Application\\src\\main\\webapp\\product_image";
			File imgSaveDir = new File(savePath2);
			if (!imgSaveDir.exists()) {
				imgSaveDir.mkdir();
			}
			p.setProduct_image(fileName);
			ProductDao.addProduct(p);
			request.setAttribute("msg", "Product Added Successfully");
			request.getRequestDispatcher("seller-add-product.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("update product"))
		{
			Product p=new Product();
			p.setPid(Integer.parseInt(request.getParameter("pid")));
			p.setProduct_category(request.getParameter("product_category"));
			p.setProduct_name(request.getParameter("product_name"));
			p.setProduct_price(Integer.parseInt(request.getParameter("product_price")));
			p.setProduct_desc(request.getParameter("product_desc"));
			ProductDao.updateProduct(p);
			request.setAttribute("msg", "Product Updated Successfully");
			request.getRequestDispatcher("seller-view-product.jsp").forward(request, response);
		}
	}

}
