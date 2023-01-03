<%-- 
    Document   : result
    Created on : 26 Dec, 2022, 2:26:38 PM
    Author     : mcacnj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result</title>
    </head>
    <body>
        <h1>Result = <%= request.getParameter("result") %></h1>
        <b>Use of include tags</b>
        <jsp:include page="page.jsp">
            <jsp:param name="fname" value="MCA"/>
            <jsp:param name="lname" value="VCET"/>
            <jsp:param name="address" value="Puttur"/>
        </jsp:include>
    </body>
</html>
