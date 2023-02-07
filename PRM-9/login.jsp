<%-- 
    Document   : login
    Created on : 17 Jan, 2023, 2:27:42 PM
    Author     : mcacnj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String user="Admin";
        String password="vcet123";
        String name=(request.getParameter("user")).trim();
        String pass=(request.getParameter("pass")).trim();
        if(name.equals(user)&&pass.equals(password))
        {
            %>
            <h1><center>WELCOME TO MAIN PAGE
            <p>U S E R S U C C E S S F U L L Y L O G G E D  I N ...</p>
            <form action="direct.jsp">
                <input type="submit" value="Get Error">
            </form>
            <p><a href="index.jsp">Home Page</a></p>
            </center></h1>
            <%
        }
        else
        {
            %>
            <h1><b><i>I N V A L I D U S E R</i></b></h1>
            <%
        }
        %>
    </body>
</html>