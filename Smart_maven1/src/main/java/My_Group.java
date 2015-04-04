import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet(urlPatterns = {"/My_Group"})
public class My_Group extends HttpServlet 
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            HttpSession session = request.getSession(false);
            String id="";
		if(session!=null)
                {
		id=(String)session.getAttribute("name");
		}
		else
                {
                    out.print("Please login first");
                    request.getRequestDispatcher("login.jsp").include(request, response);
                }
                String dbURI = "mongodb://Bharath:Bharath@ds033097.mongolab.com:33097/smart";
            MongoClient mongoClient = new MongoClient(new MongoClientURI(dbURI));
            DB db = mongoClient.getDB("smart");
          
            DBCollection coll = db.getCollection("register");
            DBCursor doc1 = coll.find(new BasicDBObject("email_id", id));
            
            String pro = (String) doc1.next().get("Profession");
             out.println("<html lang=\"en\">\n" +
"	<head>\n" +
"		<title>Group Files</title>\n" +
"		<meta charset=\"utf-8\">\n" +
"		<meta name = \"format-detection\" content = \"telephone=no\" />\n" +
"		<link rel=\"icon\" href=\"images/favicon.ico\">\n" +
"		<link rel=\"shortcut icon\" href=\"images/favicon.ico\" />\n" +
"		<link rel=\"stylesheet\" href=\"booking/css/booking.css\">\n" +
"		<link rel=\"stylesheet\" href=\"css/camera.css\">\n" +
"		<link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n" +
"		<link rel=\"stylesheet\" href=\"css/style.css\">\n" +
"		<script src=\"js/jquery.js\"></script>\n" +
"		<script src=\"js/jquery-migrate-1.2.1.js\"></script>\n" +
"		<script src=\"js/script.js\"></script>\n" +
"		<script src=\"js/superfish.js\"></script>\n" +
"		<script src=\"js/jquery.ui.totop.js\"></script>\n" +
"		<script src=\"js/jquery.equalheights.js\"></script>\n" +
"		<script src=\"js/jquery.mobilemenu.js\"></script>\n" +
"		<script src=\"js/jquery.easing.1.3.js\"></script>\n" +
"		<script src=\"js/owl.carousel.js\"></script>\n" +
"		<script src=\"js/camera.js\"></script>\n" +
"		<!--[if (gt IE 9)|!(IE)]><!-->\n" +
"		<script src=\"js/jquery.mobile.customized.min.js\"></script>\n" +
"		<!--<![endif]-->\n" +
"		<script src=\"booking/js/booking.js\"></script>\n" +
"		<script>\n" +
"			$(document).ready(function(){\n" +
"				jQuery('#camera_wrap').camera({\n" +
"					loader: false,\n" +
"					pagination: false ,\n" +
"					minHeight: '444',\n" +
"					thumbnails: false,\n" +
"					height: '28.28125%',\n" +
"					caption: true,\n" +
"					navigation: true,\n" +
"					fx: 'mosaic'\n" +
"				});\n" +
"				$().UItoTop({ easingType: 'easeOutQuart' });\n" +
"			});\n" +
"		</script>\n" +
"		<!--[if lt IE 8]>\n" +
"			<div style=' clear: both; text-align:center; position: relative;'>\n" +
"				<a href=\"http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode\">\n" +
"					<img src=\"http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg\" border=\"0\" height=\"42\" width=\"820\" alt=\"You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today.\" />\n" +
"				</a>\n" +
"			</div>\n" +
"			<![endif]-->\n" +
"		<!--[if lt IE 9]>\n" +
"			<script src=\"js/html5shiv.js\"></script>\n" +
"			<link rel=\"stylesheet\" media=\"screen\" href=\"css/ie.css\">\n" +
"		<![endif]-->\n" +
"	</head>\n" +
"	<body class=\"page1\" id=\"top\">\n" +
"		<div class=\"main\">\n" +
"<!--==============================header=================================-->\n" +
"			<header>\n" +
"				<div class=\"menu_block \">\n" +
"					<div class=\"container_12\">\n" +
"						<div class=\"grid_12\">\n" +
"							<nav class=\"horizontal-nav full-width horizontalNav-notprocessed\">\n" +
"								<center><ul class=\"sf-menu\">\n" +
"									<li class=\"current\"><a href=\"afterlogin.jsp\">Home</a></li>\n" +
"									<li><a href=\"Upload.jsp\">Upload</a></li>\n" +
"									<li><a href=\"download.jsp\">Download</a></li>\n" +
"									<li><a href=\"privacy.jsp\">Privacy</a></li>\n" +
									                 
            
"                                                                        <li><a href=\"logout.jsp\">Logout</a></li>\n" +
"								</ul></center>\n" +
"							</nav>\n" +
"							<div class=\"clear\"></div>\n" +
"						</div>\n" +
"						<div class=\"clear\"></div>\n" +
"					</div>\n" +
"				</div>\n" +
"                           \n" +
"\n" );
             session=request.getSession(false);
                                                                        String a="";
		if(session!=null){
		a=(String)session.getAttribute("name");
		out.print("<style>h4 {text-align: right;}</style>");
		out.print("<h4><b>You have logged in as, "+a+"</h4>");
		}
		else{
			out.print("Please login first");
			request.getRequestDispatcher("login.jsp").include(request, response);
		}
                out.print(
"				<div class=\"container_12\">\n" +
"					<div class=\"grid_12\">\n" +
"						\n" +
"							<a href=\"afterlogin.jsp\">\n" +
"							    <ul>\n" +
"								<li><img style=\"PADDING-LEFT: 150px\" src=\"images/log.png\" alt=\"\"></li>\n" +
"								<li><img  src=\"images/logo.png\" alt=\"\"></li>\n" +
"							</ul></a>\n" +
"						\n" +
"					</div>\n" +
"				</div>\n" +
"                \n" +
"                \n" +
"                \n");out.print("<style>#text1\n" +
"{\n" +
"border: 2px solid rgb(173, 204, 204);\n" +
"height: 31px;\n" +
"width: 223px;\n" +
"box-shadow: 0px 0px 27px rgb(204, 204, 204) inset;\n" +
"transition:500ms all ease;\n" +
"padding:3px 3px 3px 3px;\n" +
"}\n" +
".styled-button-8 {\n" +
"	background: #64AE64;\n" +
"	background: -moz-linear-gradient(top,#64AE64 0%,#64AE64 100%);\n" +
"	background: -webkit-gradient(linear,left top,left bottom,color-stop(0%,#64AE64),color-stop(100%,#64AE64));\n" +
"	background: -webkit-linear-gradient(top,#64AE64 0%,#64AE64 100%);\n" +
"	background: -o-linear-gradient(top,#64AE64 0%,#64AE64 100%);\n" +
"	background: -ms-linear-gradient(top,#64AE64 0%,#64AE64 100%);\n" +
"	background: linear-gradient(top,#64AE64 0%,#64AE64 100%);\n" +
"	filter: progid: DXImageTransform.Microsoft.gradient( startColorstr='#64AE64',endColorstr='#64AE64',GradientType=0);\n" +
"	padding:8px 13px;\n" +
"	color:#fff;\n" +
"	font-family:'Helvetica Neue',sans-serif;\n" +
"	font-size:17px;\n" +
"	border-radius:4px;\n" +
"	-moz-border-radius:4px;\n" +
"	-webkit-border-radius:4px;\n" +
"	border:1px solid #1A87B9\n" +
"\n" +
"\n" +
"</style>"+"<center> \n" +
"                               <form name=\"myForm\" method=\"get\" action=\"download\">\n" +
"                                   \n" +
"                                <input type=\"text\" align=\"left\" id=\"text1\" name=\"download\" size=\"50\"> \n" +
"                                \n" +
"                                <input type=\"submit\" class=\"styled-button-8\" value=\"Download\"><br /><br />\n" +
"                            </form>"+
"				<div class=\"clear\"></div>\n" +
"			</header>\n" +
"						<div class=\"container_12\">\n" +
"				<div class=\"grid_4\">\n" +
"					<div class=\"banner\">\n" +
"						<div class=\"maxheight\">\n" +
"							<div class=\"banner_title\">\n" +
"								<div class=\"extra_wrapper\">Files shared in your community&nbsp &nbsp &nbsp &nbsp\n" +
"								</div>\n" +
"							</div>\n" +
"");
            DBCursor doc = coll.find(new BasicDBObject("Profession",pro));
            while(doc.hasNext())
            {
        BasicDBObject dbObject = (BasicDBObject)doc.next();  
        BasicDBList list = (BasicDBList) dbObject.get("files");
        String bdo = dbObject.getString("User_type");
        
        for(Object obj : list)
        {
            if(bdo.equals("Circles"))
            {
            String fname = ((BasicDBObject)obj).getString("filename");
            out.println(fname+"<br /><br />");
            }
        }
       }
             out.println("</div>\n" +
"					</div>\n" +
"				</div>\n" +
"				\n" +
"				<div class=\"clear\"></div>\n" +
"			</div>\n" +
"			<div class=\"c_phone\">\n" +
"				<div class=\"container_12\">\n" +
"					<div class=\"grid_12\">\n" +
"						<div class=\"Post Queries\"></div>\n" +
"						<span>Connect with us always!!!</span>\n" +
"					</div>\n" +
"					<div class=\"clear\"></div>\n" +
"				</div>\n" +
"			</div>\n" +
"\n" +
"<!--==============================footer=================================-->\n" +
"		<footer>\n" +
"			<div class=\"container_12\">\n" +
"				<div class=\"grid_12\">\n" +
"					<div class=\"f_phone\"><span></span></div>\n" +
"					<div class=\"socials\">\n" +
"						<a href=\"https://twitter.com/Smartstorerepo\" class=\"fa fa-twitter\"></a>\n" +
"						<a href=\"https://www.facebook.com/people/Bharath-Shanmugam/100009309315852\" class=\"fa fa-facebook\"></a>\n" +
"						</div>\n" +
"					\n" +
"				</div>\n" +
"				<div class=\"clear\"></div>\n" +
"			</div>\n" +
"		</footer>\n" +
"		<script>\n" +
"			$(function (){\n" +
"				$('#bookingForm').bookingForm({\n" +
"					ownerEmail: '#'\n" +
"				});\n" +
"			})\n" +
"			$(function() {\n" +
"				$('#bookingForm input, #bookingForm textarea').placeholder();\n" +
"			});\n" +
"		</script>\n" +
"	</body>\n" +
"</html>\n" +
"");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
