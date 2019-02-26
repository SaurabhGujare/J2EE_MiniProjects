<%-- 
    Document   : xml-tags
    Created on : Feb 11, 2019, 8:35:38 PM
    Author     : Saurabh Gujare (NUID : 001424874)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Using XML Tags</title>
    </head>
    <body>
        <h1>XML Tags Example</h1>
        <h2>Movies Information:</h2> 
        
        <c:set var="movies">  
        <movies>  
            <movie>  
              <name>Avengers</name>  
              <rating>9</rating>
              <actor>Robert Downey Jr</actor>
            </movie>  
            <movie>  
              <name>Black Panther</name>  
              <rating>8</rating>
              <actor>Chadwick Boseman</actor>
            </movie>  
            <movie>  
              <name>Captain America</name>  
              <rating>6</rating>
              <actor>Chris Evans</actor>
            </movie>
            <movie>  
              <name>Thor Ragnorak</name>  
              <rating>7</rating>
              <actor>Chris Hemsworth</actor>
            </movie>
        </movies>  
        </c:set> 
        
        <x:parse xml="${movies}" var="output"/>  
        <%--<x:set var="movieTitle" select="$output//movie[0]/title"/>--%> 
        <x:choose >  
           <x:when select="$output//movies/movie/name = 'Avengers'">  
              Avenger is rated as <x:out select="$output/movies/movie[1]/rating" /> 
           </x:when>  
           <x:when select="$output//movies/movie/name = 'black Panther'">   
              Movie is rated as <x:out select="$output/movies/movie[2]/rating" />  
           </x:when>
           <x:when select="$output//movies/movie/name = 'captain America'">   
              Movie is rated as <x:out select="$output/movies/movie[3]/rating" />  
           </x:when>
            <x:when select="$output//movies/movie/name = 'thor Ragnorak'">   
            Movie is rated as <x:out select="$output/movies/movie[4]/rating" />  
           </x:when>
           <x:otherwise>  
              No such movie is present!!  
           </x:otherwise>  
        </x:choose> 
        <h3>XML Tags Used:</h3>
        <ol>
            <li>x:out</li>
            <li>x:parse</li>
            <li>x:choose</li>
            <li>x:when</li>
        </ol>
         
    </body>
</html>
