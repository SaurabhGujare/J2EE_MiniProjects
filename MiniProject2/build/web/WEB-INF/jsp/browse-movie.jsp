<%-- 
    Document   : browse-movie
    Created on : Feb 4, 2019, 12:06:18 AM
    Author     : Saurabh Gujare (NUID : 001424874)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Searching Movies</h1>
        <form action="hw2_part7" method="post">
        <label>Keyword:</label> <input type="text" name="keyword"><br/><br/>
        <input type="radio" name="movieFilter" value="title">Search By Title<br/>
        <input type="radio" name="movieFilter" value="actor">Search By Actor<br/>
        <input type="radio" name="movieFilter" value="actress">Search By Actress<br/><br/>
        <input type="hidden" name="value" value="browseMoviePage"/>
        <input type="submit" name="Submit"/>
        </form>
    </body>
</html>
