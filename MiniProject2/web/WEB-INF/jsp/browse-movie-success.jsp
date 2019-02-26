<%-- 
    Document   : browse-movie-success
    Created on : Feb 4, 2019, 5:41:01 PM
    Author     : Saurabh Gujare (NUID : 001424874)
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.neu.edu.pojo.Movie"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Result</title>
    </head>
    <body>
        <h3>You searched for <u><%=request.getParameter("keyword")%></u></h3>
    <h1><u>Here are the search results:</u></h1>
        <% ArrayList<Movie> movies = (ArrayList<Movie>) request.getAttribute("movieCollection");
        if(movies.size()!=0){
           for(Movie movie: movies){ %>
                <strong>Movie Title: </strong><%= movie.getTitle()%><br/>
                <strong>Lead Actor: </strong><%=movie.getActor()%><br/>
                <strong>Lead Actress: </strong><%=movie.getActress()%><br/>
                <strong>Movie Genre: </strong><%=movie.getGenre()%><br/>
                <strong>Year Released: </strong><%=movie.getYear()%><br/>
                <hr/><br/>
         <% }%>
         <a href="http://localhost:8080/Homework2/moviestore-welcomepage.jsp">Click here to go back to the main menu</a>
        <%}else{%>
         <p>Sorry!! No Results Found.</p>
         <a href="http://localhost:8080/Homework2/moviestore-welcomepage.jsp">Click here to go back to the main menu</a>
        <%} %>   
    </body>
</html>
