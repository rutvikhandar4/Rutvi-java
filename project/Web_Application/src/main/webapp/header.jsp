<%@page import="com.bean.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%
	User u=null;
	if(session!=null)
	{
		if(session.getAttribute("u")!=null)
		{
			u=(User)session.getAttribute("u");
		}
	}
%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Believe</title>

    <!-- fonts -->
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,300,500,600,700' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Roboto+Slab:400,700,300' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Playfair+Display:400,700' rel='stylesheet' type='text/css'>
    <link href='font-awesome/css/font-awesome.css' rel='stylesheet' type='text/css'>
      
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    
    <!-- main css -->
    <link href="style.css" rel="stylesheet">
    <link href="responsive.css" rel="stylesheet">
    
    <!-- Slider -->
    <link href="css/owl.carousel.css" rel="stylesheet">
    <link href="css/owl.theme.css" rel="stylesheet">
    <link href="css/owl.transitions.css" rel="stylesheet"> 
      
    <!-- lightbox -->
    <link href="css/prettyPhoto.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>

      <div id="wrapper" class="homepage-1">
          <div id="header"> <!-- header -->
              <div class="top"> <!-- top -->
                  <div class="container">
                      <ul class="top-support"> 
                          <li><i class="fa fa-phone-square"></i><span>+910000000000</span></li>
                          <li><a href=""><i class="fa fa-envelope-square"></i><span>test@test.com</span></a></li>
                      </ul>
                      
                      <div class="top-control">
                          <a href="">Track Order</a><span></span>
                          <%
                          	if(u!=null)
                          	{
                          %>
                          		<a href="profile.jsp">Profile</a>
                          		<a href="change-password.jsp">Change Password</a>
                          		<a href="logout.jsp">Logout(<%=u.getFname()%>)</a>
                          <%		
                          	}
                          	else
                          	{
                          %>
                          		<a href="register.jsp">Register</a><span></span>
                          		<a href="login.jsp">Login</a>
                          <%	
                          	}
                          %>
                          
                      </div>
                      <div class="clearfix"></div>
                      <div class="top-offers show-mobile">
                          <div class="alert alert-warning alert-dismissible fade in offers" role="alert">
                              <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true"><i class="fa fa-times-circle"></i></span></button>
                              Free Shipping <a href="">on All Orders Over</a> $75!
                          </div>
                      </div>
                  </div>
              </div> <!-- top -->
              
              <div id="believe-nav"> <!-- Nav -->
                  <div class="container">
                      <div class="min-marg">
                          <nav class="navbar navbar-default">
                              <!-- <div class="container-fluid"> -->
                                  <!-- Brand and toggle get grouped for better mobile display -->
                                  <div class="navbar-header">
                                      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                                          <span class="sr-only">Toggle navigation</span>
                                          <span class="icon-bar"></span>
                                          <span class="icon-bar"></span>
                                          <span class="icon-bar"></span>
                                      </button>
                                      <a class="navbar-brand" href="index.jsp"><img src="images/logo.png" alt=""></a>
                                  </div>

                                  <!-- Collect the nav links, forms, and other content for toggling -->
                                  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                                      <ul class="nav navbar-nav">
                                          <li class="active"><a href="index.jsp">Home <span class="sr-only">(current)</span></a></li>
                                          <li><a href="blog.jsp">Blog</a></li>
                                          <li><a href="blog-detail.jsp">Blog Post</a></li>
                                          <li><a href="contact.jsp">Contact</a></li>
                                      </ul>
                                     
                                      <ul class="nav navbar-nav navbar-right">
                                          <li class="menu-search-form">
                                              <a href="#" id="open-srch-form"><img src="images/srch.png" alt="srch"></a>
                                          </li>
                                          <li><a href="wishlist.jsp"><img src="images/pav.png" alt="pav"><span><%=session.getAttribute("wishlist_count") %></span></a></li>
                                          <li><a href="cart.jsp"><img src="images/bag.png" alt="bag"><span><%=session.getAttribute("cart_count") %></span></a></li>
                                          <li id="open-srch-form-mod">
                                              <div>
                                                  <form class="side-search">
                                                      <div class="input-group">
                                                          <input type="text" class="form-control search-wid" placeholder="Search Here" aria-describedby="basic-addon1">
                                                          <a href="" class="input-group-addon btn-side-serach" id="basic-addon1"><i class="fa fa-search"></i></a>
                                                      </div>
                                                  </form>
                                              </div>
                                          </li>
                                      </ul>
                                     
                                  </div><!-- /.navbar-collapse -->
                              <!--</div> -->
                              
                          </nav>
                      </div>
                      <div class="srch-form">
                          <form class="side-search">
                              <div class="input-group">
                                  <input type="text" class="form-control search-wid" placeholder="Search Here" aria-describedby="basic-addon2">
                                  <a href="" class="input-group-addon btn-side-serach" id="basic-addon2"><i class="fa fa-search"></i></a>
                              </div>
                          </form>
                      </div>
                  </div>
              </div> <!-- Nav -->
              
              <!--<div id="cat-nav">
                  <div class="container">
                      <div class="wrap-cat">
                          <a href="#" id="to-open-cat" class="btn btn-default btn-sm">show categories</a>
                          <ul class="this-cat clearfix">
                              <li class="active"><a href="">ELECTRONICS <i class="fa fa-angle-down"></i></a></li>
                              <li><a href="">MEN <i class="fa fa-angle-down"></i></a></li>
                              <li><a href="">WOMEN <i class="fa fa-angle-down"></i></a></li>
                              <li><a href="">BABY & KIDS <i class="fa fa-angle-down"></i></a></li>
                              <li><a href="">BOOKS & MEDIA <i class="fa fa-angle-down"></i></a></li>
                              <li><a href="">HOME & KITCHEN <i class="fa fa-angle-down"></i></a></li>
                              <li><a href="">MORE STORES <i class="fa fa-angle-down"></i></a></li>
                              <li><a href="">OFFERS ZONE <i class="fa fa-angle-down"></i></a></li>
                              <li class="cat-img-off"><img src="images/offers.png" alt="off"></li>
                          </ul>
                      </div>
                  </div>
              </div>-->
              
              <div id="cat-nav">
              <div class="container">
                  <nav class="navbar navbar-default">
                      <!-- <div class="container-fluid"> -->
                      <!-- Brand and toggle get grouped for better mobile display -->
                      <div class="navbar-header">
                          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#cat-nav-mega">
                              <span class="sr-only">Toggle navigation</span>
                              <span class="icon-bar"></span>
                              <span class="icon-bar"></span>
                              <span class="icon-bar"></span>
                          </button>
                      </div>

                      <!-- Collect the nav links, forms, and other content for toggling -->
                      <div class="collapse navbar-collapse" id="cat-nav-mega">
                          <ul class="nav navbar-nav">
                              <li class="active"><a href="index.jsp">ELECTRONICS</a></li>
                              <li class="dropdown menu-large">
                                  <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">MEN <i class="fa fa-angle-down"></i></a>
                                  <ul class="dropdown-menu megamenu" role="menu">
                                      <li>
                                          <div class="">
                                              <div class="mega-sub">
                                                  <div class="mega-sub-title">All Clothing</div>
                                                  <ul>
                                                      <li><a href="">T-Shirts</a></li>
                                                      <li><a href="">Casual & Party Wear Shirts</a></li>
                                                      <li><a href="">Jeans</a></li>
                                                      <li><a href="">Formal Shirts</a></li>
                                                      <li><a href="">Cargos, Shorts & 3/4ths</a></li>
                                                      <li><a href="">Sports Wear</a></li>
                                                      <li><a href="">Trousers</a></li>
                                                      <li><a href="">Suits and Blazers</a></li>
                                                      <li><a href="">Ethnic Wear</a></li>
                                                      <li><a href="">Inner & Sleep Wear</a></li>
                                                      <li><a href="">Accessories</a></li>
                                                  </ul>
                                              </div>
                                              <div class="mega-sub">
                                                  <div class="mega-sub-title">All Footwear</div>
                                                  <ul>
                                                      <li><a href="">Flats</a></li>
                                                      <li><a href="">Heels</a></li>
                                                      <li><a href="">Bellies</a></li>
                                                      <li><a href="">Wedges</a></li>
                                                      <li><a href="">Slippers & Flip- Flop's</a></li>
                                                      <li><a href="">Sports Shoes</a></li>
                                                      <li><a href="">Sports Sandals</a></li>
                                                      <li><a href="">Casual Shoes</a></li>
                                                      <li><a href="">Formal Shoes</a></li>
                                                      <li><a href="">Ethnic</a></li>
                                                      <li><a href="">Boots</a></li>
                                                  </ul>
                                              </div>
                                              <div class="mega-product">
                                                  <div class="mega-sub-title">Featured products</div>
                                                  <div class="row">
                                                      <div class="col-md-6 prdct-grid">
                                                          <div class="product-fade">
                                                              <div class="product-fade-wrap">
                                                                  <div id="product-image10" class="owl-carousel owl-theme">
                                                                      <div class="item"><img src="images/p-9.jpg" alt="" class="img-responsive"></div>
                                                                      <div class="item"><img src="images/p-3.jpg" alt="" class="img-responsive"></div>
                                                                      <div class="item"><img src="images/p-4.jpg" alt="" class="img-responsive"></div>
                                                                      <div class="item"><img src="images/p-5.jpg" alt="" class="img-responsive"></div>
                                                                      <div class="item"><img src="images/p-2.jpg" alt="" class="img-responsive"></div>
                                                                  </div>
                                                                  <div class="product-fade-ct">
                                                                      <div class="product-fade-control">
                                                                          <div class="to-left">
                                                                              <a href=""><i class="fa fa-heart"></i></a>
                                                                              <a href=""><i class="fa fa-retweet"></i></a>
                                                                              <a href=""><i class="fa fa-search"></i></a>
                                                                          </div>
                                                                          <div class="to-right">
                                                                              <div id="product-control10" class="owl-carousel owl-theme">
                                                                                  <div class="item"><div class="bullets"></div></div>
                                                                                  <div class="item"><div class="bullets"></div></div>
                                                                                  <div class="item"><div class="bullets"></div></div>
                                                                                  <div class="item"><div class="bullets"></div></div>
                                                                              </div>
                                                                          </div>
                                                                          <div class="clearfix"></div>
                                                                          <a href="" class="btn btn-to-cart"><span class="bag"></span><span>Add To cart</span><div class="clearfix"></div></a>
                                                                      </div>
                                                                  </div>
                                                              </div>
                                                          </div>
                                                          <div class="product-name">
                                                              Striped Men's Round Neck T-Shirt
                                                          </div>
                                                          <div class="star-1"></div>
                                                          <div class="product-price">
                                                              <span>$19.00</span> $15.00
                                                          </div>
                                                      </div>
                                                      <div class="col-md-6 prdct-grid">
                                                          <div class="product-fade">
                                                              <div class="product-fade-wrap">
                                                                  <div id="product-image11" class="owl-carousel owl-theme">
                                                                      <div class="item"><img src="images/p-1.jpg" alt="" class="img-responsive"></div>
                                                                      <div class="item"><img src="images/p-3.jpg" alt="" class="img-responsive"></div>
                                                                      <div class="item"><img src="images/p-4.jpg" alt="" class="img-responsive"></div>
                                                                      <div class="item"><img src="images/p-5.jpg" alt="" class="img-responsive"></div>
                                                                      <div class="item"><img src="images/p-1.jpg" alt="" class="img-responsive"></div>
                                                                  </div>
                                                                  <div class="product-fade-ct">
                                                                      <div class="product-fade-control">
                                                                          <div class="to-left">
                                                                              <a href=""><i class="fa fa-heart"></i></a>
                                                                              <a href=""><i class="fa fa-retweet"></i></a>
                                                                              <a href=""><i class="fa fa-search"></i></a>
                                                                          </div>
                                                                          <div class="to-right">
                                                                              <div id="product-control11" class="owl-carousel owl-theme">
                                                                                  <div class="item"><div class="bullets"></div></div>
                                                                                  <div class="item"><div class="bullets"></div></div>
                                                                                  <div class="item"><div class="bullets"></div></div>
                                                                                  <div class="item"><div class="bullets"></div></div>
                                                                              </div>
                                                                          </div>
                                                                          <div class="clearfix"></div>
                                                                          <a href="" class="btn btn-to-cart"><span class="bag"></span><span>Add To cart</span><div class="clearfix"></div></a>
                                                                      </div>
                                                                  </div>
                                                              </div>
                                                          </div>
                                                          <div class="product-name">
                                                              Striped Men's Round Neck T-Shirt
                                                          </div>
                                                          <div class="star-1"></div>
                                                          <div class="product-price">
                                                              <span>$19.00</span> $15.00
                                                          </div>
                                                      </div>
                                                  </div>
                                              </div>
                                              <div class="mega-offers">
                                                  <a href=""><img src="images/mega-offers.jpg" class="img-responsive" alt=""></a>
                                              </div>
                                              <div class="clearfix"></div>
                                          </div>
                                      </li>
                                  </ul>
                              </li>
                              <li><a href="blog.jsp">WOMEN </a></li>
                              <li><a href="contact.jsp">BABY & KIDS </a></li>
                              <li><a href="contact.jsp">BOOKS & MEDIA </a></li>
                              <li><a href="contact.jsp">HOME & KITCHEN </a></li>
                              <li><a href="contact.jsp">MORE STORES </a></li>
                              <li><a href="contact.jsp">OFFERS ZONE </a></li>
                              <li class="cat-img-off"><img src="images/offers.png" alt="off"></li>
                          </ul>
                           
                      </div><!-- /.navbar-collapse -->
                      <!--</div> -->
                  </nav>
              </div>
              </div>      
          </div> <!-- header -->
          
          
          
      </div> <!-- wrapper -->

  </body>
</html>