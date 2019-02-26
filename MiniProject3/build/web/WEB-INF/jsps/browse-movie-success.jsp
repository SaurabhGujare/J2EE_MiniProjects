<%-- 
    Document   : browse-movie-success
    Created on : Feb 4, 2019, 5:41:01 PM
    Author     : Saurabh Gujare (NUID : 001424874)
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.neu.edu.pojo.Movie"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Result</title>
    </head>
    <body>
        <c:set var="keywordSearch" value='${requestScope["keyword"]}' />
        <h3>You searched for <u><c:out value="${keywordSearch}"/></u></h3>
        <h1><u>Here are the search results:</u></h1>
        <c:choose>  
        <c:when test="${fn:length(requestScope.movieCollection) lt 1}"> 
            <p>Sorry!! No Results Found.</p>
        </c:when>
        <c:otherwise>
            <c:forEach var="movie" items='${requestScope["movieCollection"]}'  varStatus="rowCounter"> 
                <strong>Movie Title: </strong><c:out value="${movie.getTitle()}"/><br/>
                <strong>Lead Actor: </strong><c:out value="${movie.getActor()}"/><br/>
                <strong>Lead Actress: </strong><c:out value="${movie.getActress()}"/><br/>
                <strong>Movie Genre: </strong><c:out value="${movie.getGenre()}"/><br/>
                <strong>Year Released: </strong><c:out value="${movie.getYear()}"/><br/>
                <hr/><br/>
            </c:forEach>
        </c:otherwise>
        </c:choose>     
    <a href="http://localhost:8080/Homework3/moviestore-welcomepage.jsp">Click here to go back to the main menu</a>
    </body>
</html>
