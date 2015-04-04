
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet(urlPatterns = {"/login"})
public class login extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         int id=0,jd=0,kd=0,ld,md,pd=2,jd1=0,pd1=1,lend,lend1,lend2,remd,remd1,remd2,quotd,quotd1,quotd2,jd2,pd2countd,jjd,ppd,ltd,jjd1=0,ppd1=3,jjd2,ppd2,jjd3,ppd3;
		String str1="",cd1="",add="",cd2="",cd3="",cd4="",d1="",d2="",d3="",d4="",e1,e2,e3,e4,dd="";
		String code[]=new String[1000];
		String binsep[]=new String[1000];
		String bindna[]=new String[1000];
		String original[]=new String[1000];
		String key="",a,b;
                String obj;
                int cac=1;
                
            String pass="",value="",email_id="";
            DBObject doc = null;
        try (PrintWriter out = response.getWriter()) {
            a=request.getParameter("email");
            b=request.getParameter("password");
            String dbURI = "mongodb://Bharath:Bharath@ds033097.mongolab.com:33097/smart";
            MongoClient mongoClient = new MongoClient(new MongoClientURI(dbURI));
            DB db = mongoClient.getDB("smart");
            DBCollection coll = db.getCollection("register");
            
            doc = coll.findOne(new BasicDBObject("email_id", a));
            if(doc==null)
            {
                
                out.println("<html lang=\"en\">\n" +
"	<head>\n" +
"		<title>Help</title>\n" +
"		<meta charset=\"utf-8\">\n" +
"		<meta name = \"format-detection\" content = \"telephone=no\" />\n" +
"		<link rel=\"icon\" href=\"images/favicon.ico\">\n" +
"		<link rel=\"shortcut icon\" href=\"images/favicon.ico\" />\n" +
"		<link rel=\"stylesheet\" href=\"css/form.css\">\n" +
"		<link rel=\"stylesheet\" href=\"css/style.css\">\n" +
"		<script src=\"js/jquery.js\"></script>\n" +
"		<script src=\"js/jquery-migrate-1.2.1.js\"></script>\n" +
"		<script src=\"js/script.js\"></script>\n" +
"		<script src=\"js/superfish.js\"></script>\n" +
"		<script src=\"js/jquery.ui.totop.js\"></script>\n" +
"		<script src=\"js/jquery.equalheights.js\"></script>\n" +
"		<script src=\"js/jquery.mobilemenu.js\"></script>\n" +
"		<script src=\"js/jquery.easing.1.3.js\"></script>\n" +
"		<script src=\"js/TMForm.js\"></script>\n" +
"		<script>\n" +
"			$(document).ready(function(){\n" +
"				$().UItoTop({ easingType: 'easeOutQuart' });\n" +
"			});\n" +
"		</script>\n" +
"		<!--[if lt IE 8]>\n" +
"			<div style=' clear: both; text-align:center; position: relative;'>\n" +
"				<a href=\"http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode\">\n" +
"					<img src=\"http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg\" border=\"0\" height=\"42\" width=\"820\" alt=\"You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today.\" />\n" +
"				</a>\n" +
"			</div>\n" +
"		<![endif]-->\n" +
"		<!--[if lt IE 9]>\n" +
"			<script src=\"js/html5shiv.js\"></script>\n" +
"			<link rel=\"stylesheet\" media=\"screen\" href=\"css/ie.css\">\n" +
"		<![endif]-->\n" +
"	</head>\n" +
"	<body class=\"\" id=\"top\">\n" +
"		<div class=\"main\">\n" +
"<!--==============================header=================================-->\n" +
"			<header>\n" +
"				<div class=\"menu_block \">\n" +
"					<div class=\"container_12\">\n" +
"						<div class=\"grid_12\">\n" +
"							<nav class=\"horizontal-nav full-width horizontalNav-notprocessed\">\n" +
"								<center><ul class=\"sf-menu\">\n" +
"									<li><a href=\"index.jsp\">Home</a></li>\n" +
"									<li><a href=\"about.jsp\">About</a></li>\n" +
"									<li><a href=\"register.jsp\">Register</a></li>\n" +
"									<li><a href=\"login.jsp\">Login</a></li>\n" +
"									<li class=\"current\"><a href=\"help.jsp\">Help</a></li>\n" +
"								</ul></center>\n" +
"							</nav>\n" +
"							<div class=\"clear\"></div>\n" +
"						</div>\n" +
"						<div class=\"clear\"></div>\n" +
"					</div>\n" +
"				</div>\n" +
"                            \n" +
"				<div class=\"container_12\">\n" +
"					<div class=\"grid_12\">\n" +
"						\n" +
"							<a href=\"index.jsp\">\n" +
"							    <ul>\n" +
"								<li><img style=\"PADDING-LEFT: 150px\" src=\"images/log.png\" alt=\"\"></li>\n" +
"								<li><img  src=\"images/logo.png\" alt=\"\"></li>\n" +
"							</ul></a>\n" +
"						\n" +
"					</div>\n" +
"				</div>\n" +
"				<div class=\"clear\"></div>\n" +
"			</header>\n<center>You are not in Smart Store!! Please register to join us..!"+
"<br><a href=\"register.jsp\">Click here to continue</a><footer></center>\n" +
"			<div class=\"container_12\">\n" +
"				<div class=\"grid_12\">\n" +
"					<div class=\"f_phone\"><span>Call Us :</span>&nbsp+91-9791973429<br /><br />&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp+91-9597747448</div>\n" +
"					<div class=\"socials\">\n" +
"						<a href=\"#\" class=\"fa fa-twitter\"></a>\n" +
"						<a href=\"#\" class=\"fa fa-facebook\"></a>\n" +
"						<a href=\"#\" class=\"fa fa-google-plus\"></a>\n" +
"					</div>\n" +
"					<div class=\"copy\">\n" +
"						<div class=\"st1\">\n" +
"						<div class=\"brand\">Smart <span class=\"color1\">S</span>tore </div>\n" +
"					</div>\n" +
"				</div>\n" +
"				<div class=\"clear\"></div>\n" +
"			</div>\n" +
"		</footer>\n" +
"	</body>\n" +
"</html>\n" +
"");
            }
            
            
            
            email_id=doc.get("email_id").toString();
            pass = doc.get("Password").toString();
            
            key=doc.get("Key").toString();
            
             
             
             
          
            if(null != (doc.toString()))
            {
              login d=new login();
     
                
                lend=pass.length();
                quotd=lend/2;
                remd=lend%2;
                if(remd==0)
                {
                    for(id=0;id<quotd;id++)
                    {
                        if(kd!=-1)
                        {
                            code[id]=pass.substring(jd,pd);
                        }
                        jd=jd+2;
                        pd=pd+2;
                    }
                }
                else
                {
                    for(int id1=0;id1<quotd;id1++)
                    {
                        if(kd!=-1)
                        {
                            code[id1]=pass.substring(jd,pd);
                        }
                        jd=jd+2;
                        pd=pd+2;
                    }
                    for(int id2=0;id2<remd;id2++)
                    {
                        ld=lend-1;
                        add=pass.substring(ld);
                        if(remd>1)
                        {
                            ld=ld-1;
                        }
                    }
                    
                }
                
                cd1=d.codedna(code);               
                cd1=cd1+add;
                String dbin[]=cd1.split("");
                for(int id3=1;id3<=cd1.length();id3++)
                {
                }
                cd2=d.bindna(dbin);
                quotd1=cd2.length()/4;
                remd1=cd2.length()%4;
                jd1=0;
                pd1=quotd1;
                for(int id3=0;id3<4;id3++)
                {
                    binsep[id3]=cd2.substring(jd1,pd1);
                    jd1=pd1;
                    pd1=pd1+quotd1;
                }
                e1=binsep[0];
                e2=binsep[1];
                e3=binsep[2];
                e4=binsep[3];
                String decry1[]=e1.split("");
                String decry2[]=e2.split("");
                String decry3[]=e3.split("");
                String decry4[]=e4.split("");
                String decry5[]=key.split("");
                
                for(int ab=0;ab<=key.length()-1;ab++)
                {                     
                    if("0".equals(decry1[ab]))
                    {
                        decry1[ab]="1";
                    }
                    else
                    {
                        decry1[ab]="0";
                    }
                }
                for(int ab1=0;ab1<=key.length()-1;ab1++)
                {
                    if(decry2[ab1].equals("0"))
                    {
                        decry2[ab1]="1";
                    }
                    else
                    {
                        decry2[ab1]="0";
                    }
                }
                for(int ab2=0;ab2<=key.length()-1;ab2++)
                {
                    if(decry3[ab2].equals("0"))
                    {
                        decry3[ab2]="1";
                    }
                    else
                    {
                        decry3[ab2]="0";
                    }
                }
                for(int ab3=0;ab3<=key.length()-1;ab3++)
                {
                    if(decry4[ab3].equals("0"))
                    {
                        decry4[ab3]="1";
                    }
                    else
                    {
                        decry4[ab3]="0";
                    }
                }
                for(int id4=0;id4<=key.length()-1;id4++)
                {
                    if((decry1[id4]).equals((decry5[id4])))
                    {
                        decry1[id4]="0";
                    }
                    else
                    {
                        decry1[id4]="1";
                    }
                }
                for(int id5=0;id5<=key.length()-1;id5++)
                {
                    if((decry2[id5]).equals((decry5[id5])))
                    {
                        decry2[id5]="0";
                    }
                    else
                    {
                        decry2[id5]="1";
                    }
                }
                for(int id6=0;id6<=key.length()-1;id6++)
                {
                    if((decry3[id6]).equals((decry5[id6])))
                    {
                        decry3[id6]="0";
                    }
                    else
                    {
                        decry3[id6]="1";
                    }
                }
                for(int id7=0;id7<=key.length()-1;id7++)
                {
                    if((decry4[id7]).equals((decry5[id7])))
                    {
                        decry4[id7]="0";
                    }
                    else
                    {
                        decry4[id7]="1";
                    }
                }
                for(int id8=0;id8<=key.length()-1;id8++)
                {
                    d1=d1+decry1[id8];
                    
                }
                for(int id9=0;id9<=key.length()-1;id9++)
                {
                    d2=d2+decry2[id9];
                    
                }
                for(int i10=0;i10<=key.length()-1;i10++)
                {
                    d3=d3+decry3[i10];
                    
                }
                for(int i11=0;i11<=key.length()-1;i11++)
                {
                    d4=d4+decry4[i11];
                    
                }
                dd=d1+d2+d3+d4;
                lend1=dd.length();
                jjd=0;
                ppd=2;
                for(int i12=0;i12<lend1/2;i12++)
                {
                    bindna[i12]=dd.substring(jjd,ppd);
                    jjd=ppd;
                    ppd=ppd+2;
                }
                cd3=d.bin(bindna);
                lend2=cd3.length();
                quotd2=lend2/3;
                remd2=lend2%3;
                cd3=cd3.replace('T','U');
                if(remd2==0)
                {
                    for(int i13=0;i13<quotd;i13++)
                    {
                        original[i13]=cd3.substring(jjd1,ppd1);
                        jjd1=ppd1;
                        ppd1=ppd1+3;
                        
                    }
                }
                else
                {
                    for(int i14=0;i14<lend2/3;i14++)
                    {
                        original[i14]=cd3.substring(jjd1,ppd1);
                        jjd1=ppd1;
                        ppd1=ppd1+3;
                        
                    }
                }
                cd4=d.dnawrd(original);
                
                for (int c=0; c<cd4.length(); c++)
                {
                    char ch = cd4.charAt(c);
                    if (Character.isUpperCase(ch))
                    {
                        cd4=cd4.toLowerCase();
                    }
                } 
               
                if(cd4.equals(b))
                {
                    
                    HttpSession session=request.getSession();
		    session.setAttribute("name",a);
		    request.setAttribute("name",a);
                    getServletContext().getRequestDispatcher("/afterlogin.jsp").forward(request, response);  
                    
                    cac=0;
                }
                else 
                {
                               out.println("<html lang=\"en\">\n" +
"	<head>\n" +
"		<title>Help</title>\n" +
"		<meta charset=\"utf-8\">\n" +
"		<meta name = \"format-detection\" content = \"telephone=no\" />\n" +
"		<link rel=\"icon\" href=\"images/favicon.ico\">\n" +
"		<link rel=\"shortcut icon\" href=\"images/favicon.ico\" />\n" +
"		<link rel=\"stylesheet\" href=\"css/form.css\">\n" +
"		<link rel=\"stylesheet\" href=\"css/style.css\">\n" +
"		<script src=\"js/jquery.js\"></script>\n" +
"		<script src=\"js/jquery-migrate-1.2.1.js\"></script>\n" +
"		<script src=\"js/script.js\"></script>\n" +
"		<script src=\"js/superfish.js\"></script>\n" +
"		<script src=\"js/jquery.ui.totop.js\"></script>\n" +
"		<script src=\"js/jquery.equalheights.js\"></script>\n" +
"		<script src=\"js/jquery.mobilemenu.js\"></script>\n" +
"		<script src=\"js/jquery.easing.1.3.js\"></script>\n" +
"		<script src=\"js/TMForm.js\"></script>\n" +
"		<script>\n" +
"			$(document).ready(function(){\n" +
"				$().UItoTop({ easingType: 'easeOutQuart' });\n" +
"			});\n" +
"		</script>\n" +
"		<!--[if lt IE 8]>\n" +
"			<div style=' clear: both; text-align:center; position: relative;'>\n" +
"				<a href=\"http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode\">\n" +
"					<img src=\"http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg\" border=\"0\" height=\"42\" width=\"820\" alt=\"You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today.\" />\n" +
"				</a>\n" +
"			</div>\n" +
"		<![endif]-->\n" +
"		<!--[if lt IE 9]>\n" +
"			<script src=\"js/html5shiv.js\"></script>\n" +
"			<link rel=\"stylesheet\" media=\"screen\" href=\"css/ie.css\">\n" +
"		<![endif]-->\n" +
"	</head>\n" +
"	<body class=\"\" id=\"top\">\n" +
"		<div class=\"main\">\n" +
"<!--==============================header=================================-->\n" +
"			<header>\n" +
"				<div class=\"menu_block \">\n" +
"					<div class=\"container_12\">\n" +
"						<div class=\"grid_12\">\n" +
"							<nav class=\"horizontal-nav full-width horizontalNav-notprocessed\">\n" +
"								<center><ul class=\"sf-menu\">\n" +
"									<li><a href=\"index.jsp\">Home</a></li>\n" +
"									<li><a href=\"about.jsp\">About</a></li>\n" +
"									<li><a href=\"register.jsp\">Register</a></li>\n" +
"									<li><a href=\"login.jsp\">Login</a></li>\n" +
"									<li class=\"current\"><a href=\"help.jsp\">Help</a></li>\n" +
"								</ul></center>\n" +
"							</nav>\n" +
"							<div class=\"clear\"></div>\n" +
"						</div>\n" +
"						<div class=\"clear\"></div>\n" +
"					</div>\n" +
"				</div>\n" +
"                            \n" +
"				<div class=\"container_12\">\n" +
"					<div class=\"grid_12\">\n" +
"						\n" +
"							<a href=\"index.jsp\">\n" +
"							    <ul>\n" +
"								<li><img style=\"PADDING-LEFT: 150px\" src=\"images/log.png\" alt=\"\"></li>\n" +
"								<li><img  src=\"images/logo.png\" alt=\"\"></li>\n" +
"							</ul></a>\n" +
"						\n" +
"					</div>\n" +
"				</div>\n" +
"				<div class=\"clear\"></div>\n" +
"			</header>\n<center> Password doesn't match"+
"<br><a href=\"login.jsp\">Click here to continue</a><footer>\n</center>" +
"			<div class=\"container_12\">\n" +
"				<div class=\"grid_12\">\n" +
"					<div class=\"f_phone\"><span>Call Us :</span>&nbsp+91-9791973429<br /><br />&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp+91-9597747448</div>\n" +
"					<div class=\"socials\">\n" +
"						<a href=\"#\" class=\"fa fa-twitter\"></a>\n" +
"						<a href=\"#\" class=\"fa fa-facebook\"></a>\n" +
"						<a href=\"#\" class=\"fa fa-google-plus\"></a>\n" +
"					</div>\n" +
"					<div class=\"copy\">\n" +
"						<div class=\"st1\">\n" +
"						<div class=\"brand\">Smart <span class=\"color1\">S</span>tore </div>\n" +
"					</div>\n" +
"				</div>\n" +
"				<div class=\"clear\"></div>\n" +
"			</div>\n" +
"		</footer>\n" +
"	</body>\n" +
"</html>\n" +
"");
                }
                
           
               cac=0;
        }
            if(cac==1)
            {
                out.println("User not in db");
            }
            
             
      }
        /*catch(Exception ex)
        {
           PrintWriter out =response.getWriter();
           out.println(ex);
           out.println("User Not in Database");
        }*/
        
        
    }
     public  String dnawrd(String[] text) 
	 {
		int i1,j1=0,p1=1,k=0;
		String dup="";
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("UUU", "A");
	      	hm.put("UUC", "B");
     		hm.put("UUA", "C");
	      	hm.put("UUG", "D");
	    	hm.put("CUU", "E");
		hm.put("CUC", "F");
		hm.put("CUA", "G");
	      	hm.put("CUG", "H");
     		hm.put("AUU", "I");
	      	hm.put("AUC", "J");
	    	hm.put("AUA", "K");
		hm.put("AUG", "L");
		hm.put("GUU", "M");
	      	hm.put("GUC", "N");
     		hm.put("GUA", "O");
	      	hm.put("GUG", "P");
	    	hm.put("UCU", "Q");
		hm.put("UCC", "R");
		hm.put("UCA", "S");
      		hm.put("UCG", "T");
		hm.put("CCU", "U");
		hm.put("CCC", "V");
	    	hm.put("CCA", "W");
		hm.put("CCG", "X");
		hm.put("ACU", "Y");
		hm.put("ACC", "Z");
		hm.put("ACA", "1");
      		hm.put("ACG", "2");
	      	hm.put("GCU", "3");
	       	hm.put("GCC", "4");
      		hm.put("GCA", "5");
	      	hm.put("GCG", "6");
     		hm.put("UAU", "7");
	      	hm.put("UAC", "8");
	 	hm.put("UAA", "9");
		hm.put("UAG", "0");
		hm.put("AGC", "/");
	      	hm.put("AAG", "*");
	     	hm.put("GGG", "-");
	      	hm.put("UUT", "+");
	  	hm.put("CAU", "!");
		hm.put("CAC", "@");
		hm.put("CAA", "#");
	      	hm.put("CAG", "$");
     		hm.put("AAU", "%");
	      	hm.put("AAC", "^");
	 	hm.put("AAA", "&");
		hm.put("GAU", "(");
		hm.put("GAC", ")");
		hm.put("GGA", "_");
		hm.put("CCT", "=");
		hm.put("CGA", ":");
		hm.put("CGG", ";");
		hm.put("CGC", "'");
		hm.put("GGU", "<");
		hm.put("AGA", ">");
		hm.put("AGU", "?");
		hm.put("AGG", ".");
		hm.put("GGC", ",");
		hm.put("UGU", "[");
		hm.put("UGC", "]");
		hm.put("GAA", "{");
		hm.put("GAG", "}");
		hm.put("GGA", "_");
		hm.put("UGG", "|");
	 	  String words[] = text;
	    	 for( String word : words)
		{
	    	 	String sent = hm.get(word);
	    		 if( sent != null) 
	    	 	{
				
	    		  	dup=dup+sent;
	    	 	}
	     
		}
	return dup;
	}

//BINARY CODE GENERATION FUNCTION

 public  String bindna(String[] text) 
	 {
		String dup1="";
		HashMap<String,String> bm = new HashMap<>();
		bm.put("A", "00");
		bm.put("G", "01");
		bm.put("U", "10");
		bm.put("C", "11");
		String words1[] = text;
		for( String word : words1)
		{
	    		 String sent = bm.get(word);
	    		 if( sent != null) 
	    	 	{
	    		 	 dup1=dup1+sent;
				
	    	 	}
	     	}
		return dup1;
}
// binary to DNA code word
public String bin(String[] text)
{
	String dup2="";
	HashMap<String, String> dm = new HashMap<String, String>();
	dm.put("00", "A");
	dm.put("01", "G");
	dm.put("10", "T");
	dm.put("11", "C");
	String words2[] = text;
	for( String word : words2)
	{
		 String sent = dm.get(word);
	    	if( sent != null) 
	    	{
	    	 	 dup2=dup2+sent;
			
	    	}
	}
	return dup2;
}
 public  String codedna(String[] text) 
	 {
		int i1,j1=0,p1=1,k=0;
		String dup="";
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("F1", "UUU");
	      	hm.put("F2", "UUC");
     		hm.put("L1", "UUA");
	      	hm.put("L2", "UUG");
	    	hm.put("L3", "CUU");
		hm.put("L4", "CUC");
		hm.put("L5", "CUA");
	      	hm.put("L6", "CUG");
     		hm.put("I1", "AUU");
	      	hm.put("I2", "AUC");
	    	hm.put("I3", "AUA");
		hm.put("M1", "AUG");
		hm.put("V1", "GUU");
	      	hm.put("V2", "GUC");
     		hm.put("V3", "GUA");
	      	hm.put("V4", "GUG");
	    	hm.put("S1", "UCU");
		hm.put("S2", "UCC");
		hm.put("S3", "UCA");
      		hm.put("S4", "UCG");
		hm.put("P1", "CCU");
		hm.put("P2", "CCC");
	    	hm.put("P3", "CCA");
		hm.put("P4", "CCG");
		hm.put("T1", "ACU");
		hm.put("T2", "ACC");
		hm.put("T3", "ACA");
      		hm.put("T4", "ACG");
	      	hm.put("A1", "GCU");
	       	hm.put("A2", "GCC");
      		hm.put("A3", "GCA");
	      	hm.put("A4", "GCG");
     		hm.put("Y1", "UAU");
	      	hm.put("Y2", "UAC");
	 	hm.put("B1", "UAA");
		hm.put("B2", "UAG");
		hm.put("S6", "AGC");
	      	hm.put("K2", "AAG");
	     	hm.put("G4", "GGG");
	      	hm.put("X1", "UUT");
	  	hm.put("H1", "CAU");
		hm.put("H2", "CAC");
		hm.put("Q1", "CAA");
	      	hm.put("Q2", "CAG");
     		hm.put("N1", "AAU");
	      	hm.put("N2", "AAC");
	 	hm.put("K1", "AAA");
		hm.put("D1", "GAU");
		hm.put("D2", "GAC");
		hm.put("G3", "GGA");
		hm.put("X2", "CCT");
		hm.put("R3", "CGA");
		hm.put("R4", "CGG");
		hm.put("R2", "CGC");
		hm.put( "R1 ", "CGU");
		hm.put("G2", "GGC");
		hm.put("G1", "GGU");
		hm.put("R5", "AGA");
		hm.put("S5", "AGU");
		hm.put("R6", "AGG");
		hm.put("C1", "UGU");
		hm.put("C2", "UGC");
		hm.put("E1", "GAA");
		hm.put("E2", "GAG");
		hm.put("W2", "UGA");
		hm.put("G3", "GGA");
		hm.put("W1", "UGG");
	 	  String words[] = text;
	    	 for( String word : words)
		{
	    	 	String sent = hm.get(word);
	    		 if( sent != null) 
	    	 	{
				
	    		  	dup=dup+sent;
			
				
	    	 	}
	     
		}
	return dup;
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
