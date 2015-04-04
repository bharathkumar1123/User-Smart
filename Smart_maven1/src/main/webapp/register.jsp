
<%@page import="com.mongodb.DBCollection"%>
<%@page import="com.mongodb.MongoClient"%>
<%@page import="com.mongodb.DB"%>
<%@page import="com.mongodb.BasicDBObject"%>
<%@page import="com.mongodb.DBObject"%>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Register</title>
  <link rel="stylesheet" href="css/styles.css">
  <link rel="stylesheet" href="css/superfish.css">
  
  
  
<script>
function validateForm() {
    var y = document.forms["myForm"]["password"].value;
    var z = document.forms["myForm"]["pass"].value;
    var a = document.forms["myForm"]["user"].value;
    var b = document.forms["myForm"]["name"].value;
    var c = document.forms["myForm"]["prof"].value;
    var d = document.forms["myForm"]["org"].value;
    var e = document.forms["myForm"]["mob"].value;
    var f = document.forms["myForm"]["email"].value;
     var atpos = f.indexOf("@");
    var dotpos = f.lastIndexOf(".");
    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=f.length) {
        alert("Enter Valid email id!!");
        return false;
    }
    if(y!==z)
     {
       alert("Password Not Matching");
       return false;
     }
    else if(a==="Private or Circles")
    {
       alert("Please Choose Either Private or Circles");
       return false;
    }
    else if ((a&&b&&c&&d&&e&&f&&y&&z)===null || (a&&b&&c&&d&&e&&f&&y&&z)=== "")
    {
       alert("Please Fill All the columns");
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
						<h1>
							<a href="index.jsp">
							    <ul>
								<li><img style="PADDING-LEFT: 200px" src="images/log.png" alt=""></li>
								<li><img  src="images/logo.png" alt=""></li>
							</ul></a>
							</a>
						</h1>
					</div>
				</div>
				<div class="clear"></div>
			</header>
<center>
<br><br><h2>&nbsp &nbsp &nbsp &nbsp  JOIN US</h2>
  <form name="myForm" method="post" action="Register" class="login" onsubmit="return validateForm();">
    
    <p>
      <label for="login" >Name:</label>
      <input type="text" name="name" id="name">
    </p>
 <p>
      <label for="login">Profession:</label>
      <input type="text" name="prof" id="prof">
    </p>
<p>
      <label for="login">Organization:</label>
      <input type="text" name="org" id="org" >
    </p>
    <p>
      <label for="login">User Type</label>
      <input type="text" name="user" placeholder="Private or Circles" id="user" >
    </p>
    
    
    

    <p>
      <label for="login">Mobile:</label>
      <input type="text" name="mob" id="mob">
    </p>


    <p>
      <label for="login">Email:</label>
      <input type="text" name="email" id="email" >
    </p>

    <p>
      <label for="password">Key:</label>
      <input type="password" name="password" id="password" >
    </p>
    <p>
      <label for="pass">Confirm key:</label>
      <input type="password" name="pass" id="pass" >
    </p>
    
    
    
    <p class="login-submit:after">
      <button type="submit" class="login-button">Login</button>
    </p>
  </form>
</center>
</body>
</html>
