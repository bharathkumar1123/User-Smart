<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Sign up</title>
  <link rel="stylesheet" href="css/styles.css">
  <link rel="stylesheet" href="css/superfish.css">
  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
<script>
function validateForm() {
    var x = document.forms["myForm"]["email"].value;
    var y = document.forms["myForm"]["password"].value;
    var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

    if (!filter.test(x)) {
    alert('Enter valid Email Id!!');
    x.focus;
    return false;
 }   
    else if((x)==null || (x)== "")
    {
       alert("Enter Email id!!");
       return false;
    }
    else if((y)==null || (y)== "")
    {
       alert("Enter Password!!");
       return false;
    }
}
</script>

</head>
<body>
<header>
				<div class="menu_block ">
					<div class="container_12">
						<div class="grid_12">
							<nav class="horizontal-nav full-width horizontalNav-notprocessed">
								<center><ul class="sf-menu">
									<li><a href="index.jsp">Home</a></li>
									<li><a href="about.jsp">About</a></li>
									<li><a href="register.jsp">Register</a></li>
									<li class="current"><a href="login.jsp">Login</a></li>
									<li><a href="help.jsp">Help</a></li>
								</ul><center>
							</nav>
							<div class="clear"></div>
						</div>
						<div class="clear"></div>
					</div>
				</div>
				<div class="container_12">
					<div class="grid_12">
						<h1>
							<a href="index.jsp">
							    <ul>
								<li><img style="PADDING-LEFT: 200px" src="images/log.png" alt=""></li>
								<li><img  src="images/logo.png" alt=""></li>
							</ul></a>
						</h1>
					</div>
				</div>
				<div class="clear"></div>
			</header>
<center>
<br><br><h2>&nbsp &nbsp &nbsp &nbsp SIGN IN</h2>
  <form name="myForm" method="post" action="login" class="login" onsubmit="return validateForm();">
    <p>
      <label for="login">Email:</label>
      <input type="text" name="email" id="email" >
      
    </p>

    <p>
      <label for="password">Key:</label>
      <input type="password" name="password" id="password" >
    </p>

    <p class="login-submit">
      <button type="submit" class="login-button">Login</button>
    </p>

   
  </form>
</center>
</body>
</html>
