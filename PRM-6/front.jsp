<%-- 
    Document   : front
    Created on : 26 Dec, 2022, 2:06:40 PM
    Author     : mcacnj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page for Form Value</title>
    </head>
    <body>
        <h1>Vivekananda College of Engineering and Technology</h1>
        <% String s1 = request.getParameter("f1");
           String s2 = request.getParameter("f2");
           Integer.parseInt(s1);
           Integer.parseInt(s2);
           String submit = request.getParameter("submit");
           if(submit.equals("ADD")) {
               %>
               <jsp:forward page="/add.jsp"/>
               <%
           }
           else if(submit.equals("DIFFERENCE")){
               %>
               <jsp:forward page="/sub.jsp"/>
               <%
           }
           else {
               %>
               <jsp:forward page="/index.html"/>
               <%
            }
            %>
    </body>
</html>
