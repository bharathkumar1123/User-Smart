<!DOCTYPE html>
<%@ page import="javax.servlet.http.HttpSession" %>

	<head>
		<title>Download</title>
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
		</script>
<script>
function myFunction() {
    var person = prompt("Enter Secret Code", "");
    
    if (person != null) {
        alert("Data Deleted!!!");    }
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
  <![endif]--><style>#text1
{
border: 2px solid rgb(173, 204, 204);
height: 31px;
width: 223px;
box-shadow: 0px 0px 27px rgb(204, 204, 204) inset;
transition:500ms all ease;
padding:3px 3px 3px 3px;
}
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


</style>
	</head>
	<body class="page1" id="top">
		<div class="main">
<!--==============================header=================================-->
			<header>
				<div class="menu_block">
					<div class="container_12">
						<div class="grid_12">
							<nav class="horizontal-nav full-width horizontalNav-notprocessed">
								<center><ul class="sf-menu">
									<li><a href="afterlogin.jsp">Home</a></li>
									<li><a href="Upload.jsp">Upload</a></li>
									<li class="current"><a href="download.jsp">Download</a></li>
									<li><a href="privacy.jsp">Privacy</a></li>
									
                                                                       <li><a href="logout.jsp">Logout</a></li>
								</ul></center>
							</nav>
							<div class="clear"></div>
						</div>
						<div class="clear"></div>
					</div>
				</div>
			

				<div class="clear"></div>
			</header>						 <% session=request.getSession(false);
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
                               
                                
                            <center> 
                               <form name="myForm" method="get" action="download">
                                   
                                <input type="text" align="left" id="text1" name="download" size="50"> 
                                
                                <input type="submit" class="styled-button-8" value="Download"><br /><br />
                            </form><br><br>
                            <form name="myform" method="get" action="delete">
                                <input type="text" align="left" id="text1" name="delete" size="50"> 
                                <input type="submit" class="styled-button-8" value="Delete"><br />
                           </form>
                                
                            </center>
                                 
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
		

