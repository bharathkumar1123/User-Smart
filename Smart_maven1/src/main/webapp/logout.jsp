<%-- 
    Document   : logout
    Created on : 31 Mar, 2015, 9:03:08 PM
    Author     : bharath
--%>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <script type="text/javascript">
            window.history.forward();
            
            functon noBack()
            {
                window.history.forward();
            }
        </script>
    </head>
    <body onload="noBack()" onpageshow="if(event.persisted) noBack();"onunload="">
        <h1>hiiii</h1>
        <% session=request.getSession(false);
           response.setHeader("Cache-Control","no-cache,no-store-must-revalidate");
           response.setHeader("Pragma","no-cache");
                   String a="";
		if(session!=null){
		session.invalidate();}
                response.sendRedirect("login.jsp");
		%>
        
    </body>
</html>
