<%-- 
    Document   : sub
    Created on : 26 Dec, 2022, 2:25:36 PM
    Author     : mcacnj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Difference of two values</title>
    </head>
    <body>
        <h1>Difference of two values</h1>
        <%
            int f = Integer.parseInt(request.getParameter("f1"));
            int s = Integer.parseInt(request.getParameter("f2"));
            int diff = f - s;
        %>
        <jsp:forward page="/result.jsp">
            <jsp:param name="result" value="<%= diff %>" />
        </jsp:forward>
    </body>
</html>
