<%-- 
    Document   : view-added-product
    Created on : Feb 13, 2019, 9:33:14 PM
    Author     : Saurabh Gujare (NUID : 001424874)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Added Product Page</title>
    </head>
    <body>
        <h1>Following Products added to the cart successfully</h1><hr/>
               
                <ul>
                    <c:forEach var="prod" items="${sessionScope.productList.productList}" varStatus="rowCounter">
                        <li><c:out value="${prod.productName}" /></li>
                    </c:forEach>
                </ul>
            <button onclick="window.history.back()">Go Back</button>
    </body>
</html>
