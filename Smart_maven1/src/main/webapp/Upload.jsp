<!DOCTYPE html>
<%@ page import="javax.servlet.http.HttpSession" %>
 <html lang="en">
	<head>
                <title>Upload</title>
		<meta charset="utf-8">
		<meta name = "format-detection" content = "telephone=no" />
		<link rel="icon" href="images/favicon.ico">
		<link rel="shortcut icon" href="images/favicon.ico" />
		<link rel="stylesheet" href="booking/css/booking.css">
		<link rel="stylesheet" href="css/camera.css">
		<link rel="stylesheet" href="css/owl.carousel.css">
		<link rel="stylesheet" href="css/style.css">
		<script src="js/jquery.js"></script>
		<script src="js/jquery-migrate-1.2.1.js"></script>
		<script src="js/script.js"></script>
		<script src="js/superfish.js"></script>
		<script src="js/jquery.ui.totop.js"></script>
		<script src="js/jquery.equalheights.js"></script>
		<script src="js/jquery.mobilemenu.js"></script>
		<script src="js/jquery.easing.1.3.js"></script>
		<script src="js/owl.carousel.js"></script>
		<script src="js/camera.js"></script>
		<!--[if (gt IE 9)|!(IE)]><!-->
		<script src="js/jquery.mobile.customized.min.js"></script>
		<!--<![endif]-->
		<script src="booking/js/booking.js"></script>
		<script>
			$(document).ready(function(){
				jQuery('#camera_wrap').camera({
					loader: false,
					pagination: false ,
					minHeight: '444',
					thumbnails: false,
					height: '28.28125%',
					caption: true,
					navigation: true,
					fx: 'mosaic'
				});
				$().UItoTop({ easingType: 'easeOutQuart' });
			});
                        function validateForm() {
    var y = document.forms["myForm"]["opt"].value;
    
     if(y=="Private or Circles or Public")
    {
       alert("Please Choose Either Private or Circles or Public");
       return false;
    }
		</script>
               
		<!--[if lt IE 8]>
			<div style=' clear: both; text-align:center; position: relative;'>
				<a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
					<img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
				</a>
			</div>
			<![endif]-->
		<!--[if lt IE 9]>
			<script src="js/html5shiv.js"></script>
			<link rel="stylesheet" media="screen" href="css/ie.css">
		<![endif]--><style type="text/css">
.styled-button-8 {
	background: #64AE64;
	background: -moz-linear-gradient(top,#64AE64 0%,#64AE64 100%);
	background: -webkit-gradient(linear,left top,left bottom,color-stop(0%,#64AE64),color-stop(100%,#64AE64));
	background: -webkit-linear-gradient(top,#64AE64 0%,#64AE64 100%);
	background: -o-linear-gradient(top,#64AE64 0%,#64AE64 100%);
	background: -ms-linear-gradient(top,#64AE64 0%,#64AE64 100%);
	background: linear-gradient(top,#64AE64 0%,#64AE64 100%);
	filter: progid DXImageTransform.Microsoft.gradient( startColorstr='#64AE64',endColorstr='#64AE64',GradientType=0);
	padding:8px 13px;
	color:#fff;
	font-family:'Helvetica Neue',sans-serif;
	font-size:17px;
	border-radius:4px;
	-moz-border-radius:4px;
	-webkit-border-radius:4px;
	border:1px solid #1A87B9
}                
</style>
	</head>
	<body class="page1" id="top">
               

		<div class="main">
<!--==============================header=================================-->
			<header>
				<div class="menu_block ">
					<div class="container_12">
						<div class="grid_12">
							<nav class="horizontal-nav full-width horizontalNav-notprocessed">
								<center><ul class="sf-menu">
									<li><a href="afterlogin.jsp">Home</a></li>
									<li class="current"><a href="Upload.jsp">Upload</a></li>
									<li><a href="download.jsp">Download</a></li>
									<li><a href="privacy.jsp">Privacy</a></li>
                                                                             
                                                                        
                                                                       
                                                                        
                                                                       <li><a href="logout.jsp">Logout</a></li>
								</ul></center>
							</nav>
							<div class="clear"></div>
						</div>
						<div class="clear"></div>
					</div>
				</div> <% session=request.getSession(false);
                                                                        String a="";
		if(session!=null){
		a=(String)session.getAttribute("name");
		out.print("<style>h4 {text-align: right;}</style>");
		out.print("<h4><b>You have logged in as, "+a+"</h4>");
		}
		else{
			out.print("Please login first");
			request.getRequestDispatcher("login.jsp").include(request, response);
		}%>
                
				<div class="container_12">
					<div class="grid_12">
						
							<a href="afterlogin.jsp">
							    <ul>
								<li><img style="PADDING-LEFT: 150px" src="images/log.png" alt=""></li>
								<li><img  src="images/logo.png" alt=""></li>
							</ul></a>
						
					</div>
				</div>
                
				<div class="clear"></div>
			</header>						 
						<div class="container_12">
				<div class="grid_4">
					<div class="banner">
						<div class="maxheight">
							<div class="banner_title">
								<div class="extra_wrapper">Upload Data&nbsp &nbsp &nbsp &nbsp
								</div>
							</div>
                                                    <form method="post" action="file_upload.jsp" name="myForm"  enctype="multipart/form-data">
  					<input type="file"  name="myfile"><br /><br />
                                        
                                       <!-- Access Rights&nbsp<input type="text" name="opt"  value="Private or Circles or Public"><br /><br />-->
                                       
                                         
                                         <input type="submit" name="submit" class="styled-button-8" value="Submit">
                                       
				</form>
                                                    
						</div>
					</div>
				</div>
				
				<div class="clear"></div>
			</div>
			<div class="c_phone">
				<div class="container_12">
					<div class="grid_12">
						<div class="Post Queries"></div>
						<span>Connect with us always!!!</span>
					</div>
					<div class="clear"></div>
				</div>
			</div>

<!--==============================footer=================================-->
		<footer>
			<div class="container_12">
				<div class="grid_12">
					<div class="f_phone"><span></span></div>
					<div class="socials">
						<a href="https://twitter.com/Smartstorerepo" class="fa fa-twitter"></a>
						<a href="https://www.facebook.com/people/Bharath-Shanmugam/100009309315852" class="fa fa-facebook"></a>
						
					</div>
					
				</div>
				<div class="clear"></div>
			</div>
		</footer>
		<script>
			$(function (){
				$('#bookingForm').bookingForm({
					ownerEmail: '#'
				});
			})
			$(function() {
				$('#bookingForm input, #bookingForm textarea').placeholder();
			});
		</script>
	</body>
</html>
