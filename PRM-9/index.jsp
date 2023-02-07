<%-- 
    Document   : home.jsp
    Created on : 17 Jan, 2023, 2:12:01 PM
    Author     : mcacnj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" autoFlush="true" language="java" import="java.util.Date" info="Student Information" session="true" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="login.jsp">
            <table>
                <tr>
                    <td>Enter Name:</td>
                    <td><input type="text" name="user"</td>
                </tr>
                <tr>
                    <td>Enter your Password:</td>
                    <td><input type="password" name="pass"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="submit" value="Login"></td>
                </tr>
            </table>
        </form>
    </body>
</html>