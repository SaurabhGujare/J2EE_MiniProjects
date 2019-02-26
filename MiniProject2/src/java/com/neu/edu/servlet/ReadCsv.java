/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.edu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.relique.jdbc.csv.CsvDriver;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
/**
 *
 * @author Saurabh Gujare (NUID : 001424874)
 */
//@WebServlet(name = "hw2_part5", urlPatterns = {"/hw2_part5"})
@WebServlet(urlPatterns = {"/hw2_part5.xls"})
public class ReadCsv extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        //set content type
        response.setContentType("text/html");

        //get printWriter object
        PrintWriter out = response.getWriter();

        //Build logic

        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        String fileName = request.getParameter("file");
        System.out.println("FilePath is "+fileName);

        try{
            Class.forName("org.relique.jdbc.csv.CsvDriver");
            //Restorable10.9.2/Users/saurabhgajare/Desktop⁩
            myConn = DriverManager.getConnection("jdbc:relique:csv:/Users/saurabhgajare/Desktop/");
            myStmt = myConn.createStatement();
            //get filename withput extension
            fileName = fileName.substring(0, fileName.lastIndexOf('.'));
            myRs = myStmt.executeQuery("SELECT * FROM "+fileName);
            
            out.println("<html>");
            out.println("<head><title>CSV data</title></head>");
            out.println("<body>");
            out.println("<h1><u>" + fileName + " CSV File" + "</u></h1>");
            out.println("<table border=4 width:75%>");
            out.println("<tr>");
                out.println("<th> SalesOrderID");
                out.println("</th>");
                out.println("<th> RevisionNumber");
                out.println("</th>");
                out.println("<th> OrderDate");
                out.println("</th>");
                out.println("<th> DueDate");
                out.println("</th>");
                out.println("<th> ShipDate");
                out.println("</th>");
                out.println("<th> Status");
                out.println("</th>");
                out.println("<th> OnlineOrderFlag");
                out.println("</th>");
                out.println("<th> SalesOrderNumber");
                out.println("</th>");
                out.println("<th> PurchaseOrderNumber");
                out.println("</th>");
                out.println("<th> AccountNumber");
                out.println("</th>");
                out.println("<th> CustomerID");
                out.println("</th>");
                out.println("<th> TerritoryID");
                out.println("</th>");
                out.println("<th> BillToAddressID");
                out.println("</th>");
                out.println("<th> ShipToAddressID");
                out.println("</th>");
                out.println("<th> ShipMethodID");
                out.println("</th>");
                out.println("<th> CreditCardID");
                out.println("</th>");
                out.println("<th> CreditCardApprovalCode");
                out.println("</th>");
                out.println("<th> CurrencyRateID");
                out.println("</th>");
                out.println("<th> SubTotal");
                out.println("</th>");
                out.println("<th> TaxAmt");
                out.println("</th>");
                out.println("<th> Freight");
                out.println("</th>");
                out.println("<th> TotalDue");
                out.println("</th>");
                out.println("<th> Comment");
                out.println("</th>");
                out.println("<th> ModifiedDate");
                out.println("</th>");
                out.println("</tr>");
            while(myRs.next()) {
                out.println("<tr>");
                out.println("<td>"+ myRs.getString("SalesOrderID")+"</td>");
                out.println("<td>"+ myRs.getString("RevisionNumber")+"</td>");
                out.println("<td>"+ myRs.getString("OrderDate")+"</td>");
                out.println("<td>"+ myRs.getString("DueDate")+"</td>");
                out.println("<td>"+ myRs.getString("ShipDate")+"</td>");
                out.println("<td>"+ myRs.getString("Status")+"</td>");
                out.println("<td>"+ myRs.getString("OnlineOrderFlag")+"</td>");
                out.println("<td>"+ myRs.getString("SalesOrderNumber")+"</td>");
                out.println("<td>"+ myRs.getString("PurchaseOrderNumber")+"</td>");
                out.println("<td>"+ myRs.getString("AccountNumber")+"</td>");
                out.println("<td>"+ myRs.getString("CustomerID")+"</td>");
                out.println("<td>"+ myRs.getString("TerritoryID")+"</td>");
                out.println("<td>"+ myRs.getString("BillToAddressID")+"</td>");
                out.println("<td>"+ myRs.getString("ShipToAddressID")+"</td>");
                out.println("<td>"+ myRs.getString("ShipMethodID")+"</td>");
                out.println("<td>"+ myRs.getString("CreditCardID")+"</td>");
                out.println("<td>"+ myRs.getString("CreditCardApprovalCode")+"</td>");
                out.println("<td>"+ myRs.getString("CurrencyRateID")+"</td>");
                out.println("<td>"+ myRs.getString("SubTotal")+"</td>");
                out.println("<td>"+ myRs.getString("TaxAmt")+"</td>");
                out.println("<td>"+ myRs.getString("Freight")+"</td>");
                out.println("<td>"+ myRs.getString("TotalDue")+"</td>");
                out.println("<td>"+ myRs.getString("Comment")+"</td>");
                out.println("<td>"+ myRs.getString("ModifiedDate")+"</td>");  
            }
        out.println("</tr>");
        out.println("</table></body>");
        // Clean up
        myRs.close();
        myStmt.close();
        myConn.close();
        }catch(Exception exc){
            exc.printStackTrace();
	}
        		
    }
    
}
