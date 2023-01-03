<%-- 
    Document   : page
    Created on : 26 Dec, 2022, 2:31:31 PM
    Author     : mcacnj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP include Page</title>
    </head>
    <body>
        <h2>JSP Included</h2>
        Firstname:&ensp;<%= request.getParameter("fname") %><br><br>
        Lastname:&ensp;<%= request.getParameter("lname") %><br><br>
        Address:&ensp;&ensp;<%= request.getParameter("address") %>
                
    </body>
</html>
