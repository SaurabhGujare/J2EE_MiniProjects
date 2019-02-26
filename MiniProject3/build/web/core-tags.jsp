<%-- 
    Document   : core
    Created on : Feb 11, 2019, 8:02:14 PM
    Author     : Saurabh Gujare (NUID : 001424874)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Using Core Tags</title>
    </head>
    <body></body>
        <br/>
        <strong><c:out value="Displaying Odd numbers from 0 to 25" /></strong>
        <c:forEach var="number" begin="0" end="25">  
            <c:if test="${number%2!=0}">
                <p> Number <c:out value="${number}"/>
            </c:if>
        </c:forEach> 
        <br/><br/>
        <strong>Core Tags Used</strong>
        <ol>
            <li>c:out</li>
            <li>c:if</li>
            <li>c:forEach</li>
        </ol>
        
    </body>
</html>
