<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%
	User u1=null;
	if(session!=null)
	{
		if(session.getAttribute("u")!=null)
		{
			u1=(User)session.getAttribute("u");
		}
	}
	if(u1.getUsertype().equals("buyer"))
	{
%>
<%@ include file="header.jsp" %>
<%
	}
	else
	{
%>
<%@ include file="seller-header.jsp" %>
<%
	}
%>
<!DOCTYPE html>
<html lang="en">
  <head>
     </head>
  <body>

      <div id="wrapper" class="homepage-1"> <!-- wrapper -->

          
          <div id="content"> <!-- Content -->
              <div class="page-title">
                  <div class="container">
                      <div class="page-title-inner">
                          <h3>Change Password</h3>
                          <div class="breadcumb"> <a href="">Home</a><span> / </span><span>Change Password</span></div>
                          <div class="clearfix"></div>
                      </div>
                  </div>
              </div>
              
              <div class="about-page">
                  <div class="container">
                      <div class="row">
                          
                          
                          <div class="col-md-8 ct-form">
                              <h3>Change Password</h3>
                              <b style="color: blue;">
                              <%
                              	if(request.getAttribute("msg")!=null)
                              	{
                              		out.print(request.getAttribute("msg"));
                              	}
                              %>
                              </b>
                              <form class="contact-form" action="UserController" method="post">
                                  <div class="form-group">
                                      <label for="cf_subject">Old Password*</label>
                                      <input type="password" class="form-control" name="old_password" id="cf_subject" placeholder="">
                                  </div>
                                  <div class="form-group">
                                      <label for="cf_subject">New Password*</label>
                                      <input type="password" class="form-control" name="new_password" id="cf_subject" placeholder="">
                                  </div>
                                  <div class="form-group">
                                      <label for="cf_subject">Confirm New Password*</label>
                                      <input type="password" class="form-control" name="cnew_password" id="cf_subject" placeholder="">
                                  </div>
                                  

                                  <button type="submit" name="action" value="Change Password" class="btn btn-blue">Change Password</button>
                              </form>
                          </div>
                      </div>
                      
                      <div class="map-sec">
                          <div class="map-sec-wrap">
                              <div class="add-block">
                                  <h3>Believe</h3>
                                  <p>
                                      Phone: (941) 364-7748<br/>
                                      Fax: (941) 364-2322<br/>
                                      office@yourdomain.com<br/>
                                      www.yourdomain.com
                                  </p>
                              </div>
                              <div id="map-canvas"></div>
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
    <script src="js/owl.carousel.js"></script>
    <script src="js/ui.js"></script>
    <script src="js/jquery.raty.js"></script>
    <script src="https://maps.googleapis.com/maps/api/js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/jquery.selectbox-0.2.js"></script>
    <script src="js/theme-script.js"></script>
    <script>
        function initialize() {
            var mapCanvas = document.getElementById('map-canvas');
            var mapOptions = {
                center: new google.maps.LatLng(23.0504397, 72.577511),
                zoom: 10,
                disableDefaultUI: true,
                scrollwheel: false,
                navigationControl: false,
                mapTypeControl: false,
                scaleControl: false,
                draggable: false,
                mapTypeId: google.maps.MapTypeId.ROADMAP
            }
            var map = new google.maps.Map(mapCanvas, mapOptions)
            }
        google.maps.event.addDomListener(window, 'load', initialize);
    </script>
  </body>
</html>