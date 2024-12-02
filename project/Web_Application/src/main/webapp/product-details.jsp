<%@page import="org.eclipse.jdt.internal.compiler.ast.WhileStatement"%>
<%@page import="com.dao.CartDao"%>
<%@page import="com.dao.WishlistDao"%>
<%@page import="com.dao.ProductDao"%>
<%@page import="com.bean.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html lang="en">
  <head>
      </head>
  <body>
      <div id="wrapper" class="homepage-1"> <!-- wrapper -->
          <div id="content"> <!-- Content -->
              <div class="newest">
                  <div class="container">
                      <div class="newest-content">
                          <div class="newest-tab">
                              <div id="myTabContent" class="tab-content">
                                  <div role="tabpanel" class="tab-pane fade in active" id="1" aria-labelledby="cat-1">
                                      <div class="row clearfix">
                                          <%
                                          	Product p=ProductDao.getProduct(Integer.parseInt(request.getParameter("pid")));
                                          %>
                                          <div class="col-md-3 prdct-grid">
                                              <div class="product-fade">
													<div class="product-fade-wrap">
                                                        
                                                            <div class="item"><img src="product_images/<%=p.getProduct_image() %>" alt="" class="img-responsive"></div>
                                                        
														<div class="product-fade-ct">
                                                            <div class="product-fade-control">
                                                                <div class="clearfix"></div>
                                                                <%
                                                                	if(u!=null)
                                                                	{
                                                                %>
 <%
                                                                	boolean flag1=CartDao.checkCart(u.getUid(), p.getPid());
                                                                	if(flag1==false)
                                                                	{
                                                                %>
                                                                		<a href="add-to-cart.jsp?pid=<%=p.getPid() %>&uid=<%=u.getUid() %>" class="btn btn-to-cart"><span>Add To Cart</span></a>
                                                                <%
                                                                	}
                                                                	else
                                                                	{
                                                                %>
                                                                		<a href="remove-to-cart.jsp?pid=<%=p.getPid() %>&uid=<%=u.getUid() %>" class="btn btn-to-cart"><span>Remove to Cart</span></a>
                                                                <%
                                                                	}
                                                                %> 
                                                                                                                      
                                                                <%
                                                            	boolean flag=WishlistDao.checkWishlist(u.getUid(),p.getPid());
                                                                	if(flag==false)
                                                                	{
                                                                %>
                                                                		<a href="add-to-wishlist.jsp?pid=<%=p.getPid() %>&uid=<%=u.getUid() %>" class="btn btn-to-cart"><span>Add To Wishlist</span></a>
                                                                <%
                                                                	}
                                                                	else
                                                                	{
                                                                %>
                                                                		<a href="remove-from-wishlist.jsp?pid=<%=p.getPid() %>&uid=<%=u.getUid() %>" class="btn btn-to-cart"><span>Remove From Wishlist</span></a>
                                                                <%
                                                                	}
                                                                %>
                                                               <%
                                                                	}
                                                                	else
                                                                	{
                                                               %>
                                                               	<a href="login.jsp" class="btn btn-to-cart"><span>Login</span></a>
                                                               <%
                                                                	}
                                                               %>
                                                            </div>
														</div>
													</div>
                                              </div>
                                              <div class="product-name">
                                                  <a href=""><%=p.getProduct_name() %></a>
                                              </div>
                                              <div class="star-1"></div>
                                              <div class="product-price">
                                                  <%=p.getProduct_price() %>
                                              </div>
                                              <div class="product-price">
                                                  <%=p.getProduct_desc() %>
                                              </div>
                                          </div>
                                          
                                      </div>
                                  </div>
                              </div>
                              
                          </div>
                      </div>
                  </div>
              </div>
            
          </div> <!-- Content -->
          
          <div id="footer"><!-- Footer -->
              <div class="footer-widget">
                  <div class="container">
                      <div class="row">
                          <div class="col-md-3">
                              <div class="text-widget">
                                  <div class="wid-title">Welcome to</div>
                                  <img src="images/logo-white.png" alt="ft-logo">
                                  <p>
                                      Believe isCommerce WordPress theme. It has<br/>everything you need to start selling today! <a href="">Get this theme on ThemeForest!</a>
                                  </p>
                                  <ul class="ft-soc clearfix">
                                      <li><a href=""><i class="fa fa-facebook-square"></i></a></li>
                                      <li><a href=""><i class="fa fa-twitter"></i></a></li>
                                      <li><a href=""><i class="fa fa-google-plus-square"></i></a></li>
                                      <li><a href=""><i class="fa fa-instagram"></i></a></li>
                                      <li><a href=""><i class="fa fa-pinterest"></i></a></li>
                                  </ul>
                                  <div class="clearfix"></div>
                              </div>
                          </div>
                          <div class="col-md-2">
                              <div class="quick-links">
                                  <div class="wid-title">Quick Links</div>
                                  <ul>
                                      <li><a href="index.jsp">Home</a></li>
                                      <li><a href="#">About US</a></li>
                                      <li><a href="contact.jsp">contact US</a></li>
                                      <li><a href="#">deals</a></li>
                                      <li><a href="blog.jsp">blog</a></li>
                                      <li><a href="#">help</a></li>
                                  </ul>
                              </div>
                          </div>
                          <div class="col-md-2">
                              <div class="term">
                                  <div class="wid-title">&nbsp;</div>
                                  <p>
                                      <a href="#">Tearms & condition</a><br/>
                                      <a href="#">FAQs</a><br/>
                                      <a href="#">Privacy Policy</a><br/>
                                      <a href="#">Legal Desclaimer</a><br/>
                                  </p>
                              </div>
                          </div>
                          <div class="col-md-2">
                              <div class="quick-links">
                                  <div class="wid-title">My Account</div>
                                  
                                  <ul>
                                      <li><a href="#">My Account</a></li>
                                      <li><a href="#">Personal Information</a></li>
                                      <li><a href="#">Addresses</a></li>
                                      <li><a href="#">Orders</a></li>
                                      <li><a href="#">Wishlist</a></li>
                                      <li><a href="#">track order</a></li>
                                  </ul>
                              </div>
                          </div>
                          <div class="col-md-3">
                              <div class="subscribe">
                                  <div class="wid-title">Subscribe for OFFERS & UPDATES</div>
                                  <p>
                                      Enter your email and we'll send you a coupon
                                      with 10% off your next order. Add any text here
                                  </p>
                                  <form>
                                      <div class="form-group">
                                          <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter email">
                                      </div>
                                      <button type="submit" class="btn btn-default">Subscribe Now</button>
                                  </form>
                              </div>
                          </div>
                      </div>
                  </div>
              </div>
              <div class="footer-text">
                  <div class="container">
                      <p>Copyright 2018. Designed and Developed by <a href="https://bootstrapmart.com/">BootstrapMart </a> &amp; Distributed by <a href="https://themewagon.com/">ThemeWagon</a></p>
                  </div>
              </div>
          </div><!-- Footer -->
      </div> <!-- wrapper -->

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/library.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/jquery.raty.js"></script>
    <script src="js/ui.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/jquery.selectbox-0.2.js"></script>
    <script src="js/theme-script.js"></script>
  </body>
</html>