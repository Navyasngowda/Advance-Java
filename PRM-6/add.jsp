<%-- 
    Document   : add
    Created on : 26 Dec, 2022, 2:16:30 PM
    Author     : mcacnj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adding two values</title>
    </head>
    <body>
        <h1>Adding two values</h1>
        <%
            int f = Integer.parseInt(request.getParameter("f1"));
            int s = Integer.parseInt(request.getParameter("f2"));
            int sum = f + s;
        %>
        <jsp:forward page="/result.jsp">
            <jsp:param name="result" value="<%= sum %>" />
        </jsp:forward>
    </body>
</html>
