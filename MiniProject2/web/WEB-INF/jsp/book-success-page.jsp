<%-- 
    Document   : book-success-page
    Created on : Feb 4, 2019, 11:53:11 PM
    Author     : Saurabh Gujare (NUID : 001424874)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Books Successfully Added</title>
        <style type="text/css">
            body{
                background: url("https://images.unsplash.com/photo-1524055988636-436cfa46e59e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=675&q=80");
                background-size: auto;
                background-repeat: no-repeat;
                background-position: center;
                text-align: center;
                height: 100%;
            }
        </style>
    </head>
    <body>
        <h1><%= request.getAttribute("bookCount")%> Books Added Successfully</h1>
        <a href="http://localhost:8080/Homework2/books-welcomepage.jsp">Click here to go back to the main menu</a>
    </body>
</html>
