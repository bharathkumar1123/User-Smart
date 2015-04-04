<%@page import="com.mongodb.MongoClientURI"%>
<%@page import="com.mongodb.MongoClient"%>
<%@page import="com.mongodb.DBObject"%>
<%@page import="com.mongodb.BasicDBObject"%>
<%@ page import="org.apache.commons.fileupload.*,
org.apache.commons.fileupload.servlet.*,
org.apache.commons.fileupload.disk.*, org.apache.commons.io.*, java.util.*,
java.io.File, java.lang.Exception" %>

<%@ page import="java.io.File" %>
<%@ page import="java.io.IOException" %>
<%@ page import="java.net.UnknownHostException" %>
<%@ page import="com.mongodb.DB" %>
<%@ page import="com.mongodb.DBCollection" %>
<%@ page import="com.mongodb.DBCursor" %>
<%@ page import="com.mongodb.Mongo" %>
<%@ page import="com.mongodb.MongoException" %>
<%@ page import="com.mongodb.gridfs.GridFS" %>
<%@ page import="com.mongodb.gridfs.GridFSDBFile" %>
<%@ page import="com.mongodb.gridfs.GridFSInputFile" %>
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
		<![endif]-->
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
			</header>	<div class="clear"></div>
                        </header><style> h1 {text-align: center;font-size: 25px} .displayed {
    display: block;
       float: right;
    margin-right: 300px;
    margin-top: 85px; }
     </style> 
                          
                <centre> 
		<img class="displayed" src="images/uploaded.png" alt="">
								
                    </centre>						 
						<div class="container_12">
				<div class="grid_4">
					<div class="banner">
						<div class="maxheight">
							<div class="banner_title">
								<div class="extra_wrapper">Data Uploaded&nbsp &nbsp &nbsp &nbsp
								</div>
							</div>
            

<%
if (ServletFileUpload.isMultipartContent(request)){
   ServletFileUpload servletFileUpload = new ServletFileUpload(new
DiskFileItemFactory());
   List fileItemsList = servletFileUpload.parseRequest(request);

   String optionalFileName = "";
   FileItem fileItem = null;

   Iterator it = fileItemsList.iterator();
   while (it.hasNext()){
     FileItem fileItemTemp = (FileItem)it.next();
     if (fileItemTemp.isFormField()){

       if (fileItemTemp.getFieldName().equals("filename"))
         optionalFileName = fileItemTemp.getString();
     }
     else
       fileItem = fileItemTemp;
   }

   if (fileItem!=null){
     String fileName = fileItem.getName();
%>

<b>Uploaded File Info:</b><br/>
Content type: <%= fileItem.getContentType() %><br/>
File name: <%= fileName %><br/>
File size: <%= fileItem.getSize() %><br/><br/>

<%
     /* Save the uploaded file if its size is greater than 0. */
     if (fileItem.getSize() > 0){
       if (optionalFileName.trim().equals(""))
         fileName = FilenameUtils.getName(fileName);
       else
         fileName = optionalFileName;

       try {
session=request.getSession(false);
String id="";
		if(session!=null){
		id=(String)session.getAttribute("name");
		
		out.print("Hello, "+id);
		}
		else{
			out.print("Please login first");
			request.getRequestDispatcher("login.jsp").include(request, response);
                }
/*Mongo mongo = new Mongo("localhost", 27017);
DB db = mongo.getDB("smart");*/
                String dbURI = "mongodb://Bharath:Bharath@ds033097.mongolab.com:33097/smart";
            MongoClient mongoClient = new MongoClient(new MongoClientURI(dbURI));
            DB db = mongoClient.getDB("smart");
          
DBCollection coll = db.getCollection("register");


long temp = fileItem.getSize();
DBObject doc = coll.findOne(new BasicDBObject("email_id", id));
DBObject add = new BasicDBObject("$inc", new BasicDBObject("Size_used",temp));
coll.update(doc,add);
String newFileName = fileName;

File imageFile = new File("c:\\DemoImage.png");

// create a "photo" namespace
GridFS gfsPhoto = new GridFS(db, "files");

// get image file from local drive
GridFSInputFile gfsFile = gfsPhoto.createFile(imageFile);

// set a new filename for identify purpose
gfsFile.setFilename(newFileName);

// save the image file into mongoDB
gfsFile.save();

        GridFSDBFile imageForOutput = gfsPhoto.findOne(newFileName);
        System.out.println(imageForOutput);
        
       doc = coll.findOne(new BasicDBObject("email_id", id));
       DBObject push = new BasicDBObject("$push", new BasicDBObject("files",imageForOutput));
       coll.update(doc,push);
    } 
       catch (UnknownHostException e) 
{
e.printStackTrace();
} catch (MongoException e) {
e.printStackTrace();
} catch (IOException e) {
e.printStackTrace();
}
       
       
%>

<b>The uploaded file has been saved successfully.</b>


<%
     
     }
   }
}
%>

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
