<%@page import="com.dao.CartDao"%>
<%@page import="com.bean.Cart"%>
<%@page import="com.dao.WishlistDao"%>
<%@page import="com.bean.Wishlist"%>
<%@page import="com.dao.ProductDao"%>
<%@page import="com.bean.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
                                      <b style="color: blue;">
                                          <%
                                          if(request.getAttribute("msg") != null) {
                                              out.print(request.getAttribute("msg"));
                                          }
                                          %>
                                      </b>
                                      <div class="row clearfix">
                                          <%
                                          int net_price=0;
                                          List<Cart> list = CartDao.getCartByUser(u.getUid());
                                          if(list.size() > 0) {
                                              for(Cart c : list) {
                                            	  net_price=net_price+c.getTotal_price();
                                                  Product p = ProductDao.getProduct(c.getPid());
                                          %>
                                              <div class="col-md-3 prdct-grid">
                                                  <div class="product-fade">
                                                      <div class="product-fade-wrap">
                                                          <div class="item">
                                                              <img src="product_images/<%= p.getProduct_image() %>" alt="" class="img-responsive"style="width: 300px;hight: 200px;">
                                                          </div>
                                                          <div class="product-fade-ct">
                                                              <div class="product-fade-control">
                                                                  <div class="clearfix"></div>
                                                                  <a href="product-details.jsp?pid=<%= p.getPid() %>" class="btn btn-to-cart">
                                                                      <span class="bag"></span><span>Details</span>
                                                                      <div class="clearfix"></div>
                                                                  </a>
                                                              </div>
                                                          </div>
                                                      </div>
                                                  </div>
                                                  <div class="product-name">
                                                      <a href="product-details.jsp?pid=<%= p.getPid() %>"><%= p.getProduct_name() %></a>
                                                  </div>
                                                  <div class="star-1"></div>
                                                  <div class="product-price">
                                                      <%= p.getProduct_price() %> 
                                                  </div>

                                                  
                                                  <form name="change_qty" method="post" action="change_qty.jsp">
                                                      <input type="hidden" name="cid" value="<%= c.getCid() %>">
                                                      Quantity: 
                                                      <input type="number" name="product_qty" value="<%= c.getProduct_qty() %>" min="1" max="10" onchange="this.form.submit();">
                                                  </form>
                                              </div>

                                              <div class="product-price">
                                                  Total Price: <%= p.getProduct_price() * c.getProduct_qty() %>
                                              </div>
                                          <% } 
                                          } else { 
                                          %>
                                              <h2>No Products In Cart</h2>
                                          <% 
                                          }
                                          %>
                                      </div>
                                  </div>
                              </div>
                          </div>
                      </div>
                  </div>
              </div>
          </div> 
<style type="text/css">
	.bttnStyle
	{
		background-color: lightblue;
		border-radius: 0.50rem;
		border:1px solid transperent;
	}
</style>
<script type="text/javascript">
	var xhttp=new XMLHttpRequest();
	var RazorpayOrderId;
	function CreateOrderID()
	{
		alert("1");
		var number=document.getElementById("amount").value;
		xhttp.open("GET","http://localhost:8080/Project830batch/OrderCreation?amount="+number,false);
		alert("2");
		xhttp.send();
		RazorpayOrderId=xhttp.responseText;
		  
		/* alert(number);  
		OpenCheckOut(number); */
		OpenCheckOut();
	}
</script>
<script src="https://checkout.razorpay.com/v1/checkout.js"></script>
<script type="text/javascript">
	function OpenCheckOut()
	{
		alert("3");
		var number=document.getElementById("amount").value;
		alert(number);
		var options={
				"key":"rzp_test_KGwT3XcJybhKgu",
				"amount":number,
				"currency":"INR",
				"name":"Tops",
				"description":"Test",
				"order_id":RazorpayOrderId,
				"callback_url":"http://localhost:8080/Project830batch/OrderCreation",
				"prefill":{
					"name":"rahul sanghavi",
					"email":"rahulsanghavi.tops@gmail.com",
					"contact":"9016545414"
				},
				"notes":{
					"address":"s.nagar"
				},
				"theme":{
					"color":"#3399cc"
				}
				
				
		};
		var rzp1=new Razorpay(options);
		rzp1.on('payment.failed',function (response){
			alert(response.error.code);
	        alert(response.error.description);
	        alert(response.error.source);
	        alert(response.error.step);
	        alert(response.error.reason);
	        alert(response.error.metadata.order_id);
	        alert(response.error.metadata.payment_id);
		});
		rzp1.open();
	    /* e.preventDefault(); */
	}
</script>
</head>
<body>
<div id="order_id">
	
</div>
<center>
	<%
		String price=request.getParameter("totalprice");
	%>
	<input type="hidden" id="amount" value="<%=price%>">
	<button id="payButton" onclick="CreateOrderID()" class="bttnStyle">Pay Now</button>
</center>

      
          <!-- Footer Section -->
          <div id="footer">
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
                          <!-- Other Footer Content -->
                          <div class="col-md-2">
                              <div class="quick-links">
                                  <div class="wid-title">Quick Links</div>
                                  <ul>
                                      <li><a href="index.jsp">Home</a></li>
                                      <li><a href="#">About US</a></li>
                                      <li><a href="contact.jsp">Contact US</a></li>
                                      <li><a href="#">Deals</a></li>
                                      <li><a href="blog.jsp">Blog</a></li>
                                      <li><a href="#">Help</a></li>
                                  </ul>
                              </div>
                          </div>
                          <div class="col-md-2">
                              <div class="term">
                                  <div class="wid-title">&nbsp;</div>
                                  <p>
                                      <a href="#">Terms & Conditions</a><br/>
                                      <a href="#">FAQs</a><br/>
                                      <a href="#">Privacy Policy</a><br/>
                                      <a href="#">Legal Disclaimer</a><br/>
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
                                      <li><a href="#">Track Order</a></li>
                                  </ul>
                              </div>
                          </div>
                          <div class="col-md-3">
                              <div class="subscribe">
                                  <div class="wid-title">Subscribe for OFFERS & UPDATES</div>
                                  <p>
                                      Enter your email and we'll send you a coupon
                                      with 10% off your next order. Add any text here.
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

    <!-- jQuery and JS Libraries -->
    <script src="js/library.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/jquery.raty.js"></script>
    <script src="js/ui.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/jquery.selectbox-0.2.js"></script>
    <script src="js/theme-script.js"></script>
<script src="https://checkout.razorpay.com/v1/checkout.js"></script><style type="text/css">
	.bttnStyle
	{
		background-color: lightblue;
		border-radius: 0.50rem;
		border:1px solid transperent;
	}
</style>
<script type="text/javascript">
	var xhttp=new XMLHttpRequest();
	var RazorpayOrderId;
	function CreateOrderID()
	{
		alert("1");
		var number=document.getElementById("amount").value;
		xhttp.open("GET","http://localhost:8080/Web_Application/OrderCreation?amount="+number,false);
		alert("2");
		xhttp.send();
		RazorpayOrderId=xhttp.responseText;
		  
		OpenCheckOut();
	}
</script>
<script src="https://checkout.razorpay.com/v1/checkout.js"></script>
<script type="text/javascript">
	function OpenCheckOut()
	{
		alert("3");
		var number=document.getElementById("amount").value;
		alert(number);
		var options={
				"key":"rzp_test_KGwT3XcJybhKgu",
				"amount":number,
				"currency":"INR",
				"name":"Tops",
				"description":"Test",
				"order_id":RazorpayOrderId,
				"callback_url":"http://localhost:8080/Web_Application/OrderCreation",
				"prefill":{
					"name":"Dolly Joshi",
					"email":"joshidolly36@gmail.com",
					"contact":"8530181728"
				},
				"notes":{
					"address":"vastrapur"
				},
				"theme":{
					"color":"#3399cc"
				}
				
				
		};
		var rzp1=new Razorpay(options);
		rzp1.on('payment.failed',function (response){
			alert(response.error.code);
	        alert(response.error.description);
	        alert(response.error.source);
	        alert(response.error.step);
	        alert(response.error.reason);
	        alert(response.error.metadata.order_id);
	        alert(response.error.metadata.payment_id);
		});
		rzp1.open();
	   
	}
</script>
</head>
<body>
<div id="order_id">
	
</div>
<center>
  <input type="hidden" id="amount" value="<%=price%>">
  <button id="payButton" onclick="CreateOrderID()" class="bttnStyle">Pay Now</button>
</center>
  </body>
</html>
