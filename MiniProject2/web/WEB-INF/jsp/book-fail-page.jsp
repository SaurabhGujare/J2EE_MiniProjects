<%-- 
    Document   : book-fail-page
    Created on : Feb 5, 2019, 12:39:29 AM
    Author     : Saurabh Gujare (NUID : 001424874)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>***Error***</title>
    </head>
    <body onload="myFunction()">
        <script>
    function myFunction() {
      alert("You entered a wrong value!!!");
      history.back(1);
    }
    </script>
    </body>
</html>
