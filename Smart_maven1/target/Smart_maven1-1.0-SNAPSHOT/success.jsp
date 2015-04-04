<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Help</title>
		<meta charset="utf-8">
		<meta name = "format-detection" content = "telephone=no" />
		<link rel="icon" href="images/favicon.ico">
		<link rel="shortcut icon" href="images/favicon.ico" />
		<link rel="stylesheet" href="css/form.css">
		<link rel="stylesheet" href="css/style.css">
		<script src="js/jquery.js"></script>
		<script src="js/jquery-migrate-1.2.1.js"></script>
		<script src="js/script.js"></script>
		<script src="js/superfish.js"></script>
		<script src="js/jquery.ui.totop.js"></script>
		<script src="js/jquery.equalheights.js"></script>
		<script src="js/jquery.mobilemenu.js"></script>
		<script src="js/jquery.easing.1.3.js"></script>
		<script src="js/TMForm.js"></script>
		<script>
			$(document).ready(function(){
				$().UItoTop({ easingType: 'easeOutQuart' });
			});
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
		<![endif]-->
	</head>
	<body class="" id="top">
		<div class="main">
<!--==============================header=================================-->
			<header>
				<div class="menu_block ">
					<div class="container_12">
						<div class="grid_12">
							<nav class="horizontal-nav full-width horizontalNav-notprocessed">
								<center><ul class="sf-menu">
									<li><a href="index.jsp">Home</a></li>
									<li><a href="about.jsp">About</a></li>
									<li class="current"><a href="register.jsp">Register</a></li>
									<li><a href="login.jsp">Login</a></li>
									<li><a href="help.jsp">Help</a></li>
								</ul></center>
							</nav>
							<div class="clear"></div>
						</div>
						<div class="clear"></div>
					</div>
				</div>
                            
				<div class="container_12">
					<div class="grid_12">
						
							<a href="index.jsp">
							    <ul>
								<li><img style="PADDING-LEFT: 150px" src="images/log.png" alt=""></li>
								<li><img  src="images/logo.png" alt=""></li>
							</ul></a>
						
					</div>
				</div>
				<div class="clear"></div>
			</header> <style> .displayed {
    display: block;
    margin-left: auto;
    margin-right: auto }p.padding {
    float: right;
    margin-right: 300px;
    margin-top: 115px;
    font-size: 25px;} </style>
                       
                                            <p class="padding">Registered Successfully!!!<br><br>
						
                                                      <a href="login.jsp">click here to join us!!</p>
													
					 <center>  <img  class="displayed" src="images/success.png" alt=""></center>
					
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
