<%-- 
    Document   : formatting-tags
    Created on : Feb 11, 2019, 10:08:53 PM
    Author     : Saurabh Gujare (NUID : 001424874)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ing formatting tags</title>
    </head>
    <body>
        <h1>Formatting Tags Examples:</h1>
        
        <h3>1) The fmt:parseNumber tag Example is:</h3> 
        <c:set var="stringNumber" value="25.73" />  
  
        <fmt:parseNumber var="floatNumber" type="number" value="${stringNumber}" />  
        <p>String number converted to Float:  <c:out value="${floatNumber}" /></p>  

        <fmt:parseNumber var="intNumber" integerOnly="true" type="number" value="${stringNumber}" />  
        <p>String number Converted to Integer: <c:out value="${intNumber}" /></p> 
        
        <h3>2) Parsed Date example is:</h3>  
        <c:set var="date" value="02-11-2019" />  
  
        <fmt:parseDate value="${date}" var="parsedDate"  pattern="MM-dd-yyyy" />    
        <p><c:out value="${parsedDate}" /></p> 
        
        <h3>3) formatDate Examples are</h3>  
        <c:set var="Date" value="<%=new java.util.Date()%>" />  
        <p>  
        Formatted Time :  
        <fmt:formatDate type="time" value="${Date}" />  
        </p>  
        <p>  
        Formatted Date :  
        <fmt:formatDate type="date" value="${Date}" />  
        </p>  
        <p>  
        Formatted Date and Time :  
        <fmt:formatDate type="both" value="${Date}" />  
        </p>  
        <p>  
        Formatted Date and Time in short style :  
        <fmt:formatDate type="both" dateStyle="short" timeStyle="short"  
        value="${Date}" />  
        </p>  
        <p>  
        Formatted Date and Time in medium style :  
        <fmt:formatDate type="both" dateStyle="medium" timeStyle="medium"  
        value="${Date}" />  
        </p>  
        <p>  
        Formatted Date and Time in long style :  
        <fmt:formatDate type="both" dateStyle="long" timeStyle="long"  
        value="${Date}" />  
        </p>  
    </body>
</html>
