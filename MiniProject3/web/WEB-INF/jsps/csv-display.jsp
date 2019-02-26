<%-- 
    Document   : csv-display
    Created on : Feb 12, 2019, 12:03:53 AM
    Author     : Saurabh Gujare (NUID : 001424874)

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%--<jsp:useBean id="myBean" class="com.neu.edu.pojo.CSV"  scope="request" />--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display CSV</title>
    </head>
    <body>
        <c:set var="filename" value='${requestScope["filename"]}' />
        <h1><u> <c:out value="${filename}"/> CSV File</u></h1>
        <table border="1">
        <tr>
            <th> SalesOrderID</th>
            <th> RevisionNumber</th>
            <th> OrderDate</th>
            <th> DueDate</th>
            <th> ShipDate</th>
            <th> Status</th>
            <th> OnlineOrderFlag</th>
            <th> SalesOrderNumber</th>
            <th> PurchaseOrderNumber</th>
            <th> AccountNumber</th>
            <th> CustomerID</th>
            <th> TerritoryID</th>
            <th> BillToAddressID</th>
            <th> ShipToAddressID</th>
            <th> ShipMethodID</th>
            <th> CreditCardID</th>
            <th> CreditCardApprovalCode</th>
            <th> CurrencyRateID</th>
            <th> SubTotal</th>
            <th> TaxAmt</th>
            <th> Freight</th>
            <th> TotalDue</th>
            <th> Comment</th>
            <th> ModifiedDate</th>
        </tr>
        
        <c:forEach var="row" items='${requestScope["beansCollection"]}'  varStatus="rowCounter"> 
        <tr>
            <td><c:out value="${row.getSalesOrderID()}"/></td>
            <td><c:out value="${row.getRevisionNumber()}"/></td>
            <td><c:out value="${row.getOrderDate()}"/></td>
            <td><c:out value="${row.getDueDate()}"/></td>
            <td><c:out value="${row.getShipDate()}"/></td>
            <td><c:out value="${row.getStatus()}"/></td>
            <td><c:out value="${row.getOnlineOrderFlag()}"/></td>
            <td><c:out value="${row.getSalesOrderNumber()}"/></td>
            <td><c:out value="${row.getPurchaseOrderNumber()}"/></td>
            <td><c:out value="${row.getAccountNumber()}"/></td>
            <td><c:out value="${row.getCustomerID()}"/></td>
            <td><c:out value="${row.getTerritoryID()}"/></td>
            <td><c:out value="${row.getBillToAddressID()}"/></td>
            <td><c:out value="${row.getShipToAddressID()}"/></td>
            <td><c:out value="${row.getShipMethodID()}"/></td>
            <td><c:out value="${row.getCreditCardID()}"/></td>
            <td><c:out value="${row.getCreditCardApprovalCode()}"/></td>
            <td><c:out value="${row.getCurrencyRateID()}"/></td>
            <td><c:out value="${row.getSubTotal()}"/></td>
            <td><c:out value="${row.getTaxAmt()}"/></td>
            <td><c:out value="${row.getFreight()}"/></td>
            <td><c:out value="${row.getTotalDue()}"/></td>
            <td><c:out value="${row.getComment()}"/></td>
            <td><c:out value="${row.getModifiedDate()}"/></td>
        </tr>
        </c:forEach>
        </table>
    </body>
</html>
