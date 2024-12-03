

<%@page import="java.util.List"%>
<%@page import="com.dao.CartDao"%>
<%@page import="com.bean.Cart"%>
<%@page import="com.dao.ProductDao"%>
<%@page import="com.bean.Product"%>
<%
 int pid=Integer.parseInt(request.getParameter("pid"));
int uid=Integer.parseInt(request.getParameter("uid"));
Product p=ProductDao.getProduct(pid);
Cart c= new Cart();
c.setPid(pid);
c.setUid(uid);
c.setProduct_price(p.getProduct_price());
c.setProduct_qty(1);
c.setTotal_price(p.getProduct_price());
CartDao.addToCart(c);
List<Cart> list=CartDao.getCartByUser(uid);
session.setAttribute("cart_count", list.size());
response.sendRedirect("cart.jsp");
%>