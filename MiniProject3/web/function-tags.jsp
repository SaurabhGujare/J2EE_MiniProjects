<%-- 
    Document   : function-tags
    Created on : Feb 11, 2019, 10:32:09 PM
    Author     : Saurabh Gujare (NUID : 001424874)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Using Function tags</title>
    </head>
    <body>
    <h1>Functions Tags Examples:</h1><br/>
    <c:set var="string" value="Northeastern University"/>
    <strong><c:out value="Original String: Northeastern University"/></strong>
    
    <br/><h3>1) JSTL fn:indexOf() Function </h3>   
    <p>At what position "Northeastern" is in Original String?? ${fn:indexOf(string,"Northeastern")}</p>
    
    <br/><h3>2) JSTL fn:length() Function </h3>
    <p>The length of String "Northeastern University" is?? ${fn:length(string)}</p>
    
    <br/><h3>3) JSTL fn:substring() Function </h3>
    ${fn:substring(string, 0, 12)}
    </body>
</html>
