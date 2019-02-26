<%-- 
    Document   : view-shoppingCart-page
    Created on : Feb 13, 2019, 9:54:35 PM
    Author     : Saurabh Gujare (NUID : 001424874)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>view-shoppingCart-page</title>
    </head>
    <body>
        <h1>Shopping Cart</h1><hr>
        <h2>Items:</h2>    
        <ul>
            <form action="shoppingCart" method="get">
                <c:forEach var="prod" items="${sessionScope.products.productList}" varStatus="rowCounter">
                    <input type="checkbox" value='${prod.productName}' name="products" /> <c:out value="${prod.productName}"/><br/>
                </c:forEach>
                <input type="hidden" name="choice" value="delete" /><br>
                <input type="submit" value="Delete" />
            </form>
        </ul>
        <a href="http://localhost:8080/Homework3/ShoppingCartIndex.html"><input type="button" value="Go Back"/></a>
        <input type="button" value="Check Out" disabled/>
    </body>
</html>
