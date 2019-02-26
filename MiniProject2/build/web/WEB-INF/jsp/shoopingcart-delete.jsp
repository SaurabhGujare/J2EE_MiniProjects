<%-- 
    Document   : shoopingcart-delete
    Created on : Feb 6, 2019, 2:46:28 PM
    Author     : Saurabh Gujare (NUID : 001424874)
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p><h1>Your Cart:</h1><br/><hr>
        <ul>
        <% ArrayList<String> items = (ArrayList<String>)request.getAttribute("productList");
        for(String item: items){ %>
        <li> <%= item%></li>
        <%}
        %>
        </ul>
        <br/><br/> <a href="http://localhost:8080/Homework2/form_part7.html"><u>Return to Home Page</u></a>
    </body>
</html>

