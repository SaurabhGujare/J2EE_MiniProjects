/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.edu.servlet;

import com.neu.edu.dao.CsvDao;
import com.neu.edu.pojo.CSV;
import java.io.IOException;
import java.io.PrintWriter;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;

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
@WebServlet(urlPatterns = {"/hw3_part6.xls"})
public class ReadCsv extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        //set content type
        response.setContentType("text/html");

        //Build logic

        Statement myStmt = null;
        ResultSet myRs = null;

        String fileName = request.getParameter("file");
        System.out.println("FilePath is "+fileName);

        try{
            CsvDao myConn = new CsvDao();
            myStmt = myConn.getConnection().createStatement();
            //get filename withput extension
            fileName = fileName.substring(0, fileName.lastIndexOf('.'));
            myRs = myStmt.executeQuery("SELECT * FROM "+fileName);
            
            request.setAttribute("filename", fileName);
            
            ArrayList<CSV> beanCollection = new ArrayList<CSV>();
            
            while(myRs.next()) {
                CSV bean=new CSV();
                bean.setSalesOrderID(myRs.getString("SalesOrderID"));
                
                bean.setRevisionNumber(myRs.getString("RevisionNumber"));
                
                bean.setOrderDate(myRs.getString("OrderDate"));
                
                bean.setDueDate(myRs.getString("DueDate"));
                
                bean.setShipDate(myRs.getString("ShipDate"));
                
                bean.setStatus(myRs.getString("Status"));
                
                bean.setOnlineOrderFlag(myRs.getString("OnlineOrderFlag"));
                
                bean.setSalesOrderNumber(myRs.getString("SalesOrderNumber"));
                
                bean.setPurchaseOrderNumber(myRs.getString("PurchaseOrderNumber"));
                
                bean.setAccountNumber(myRs.getString("AccountNumber"));
                
                bean.setCustomerID(myRs.getString("CustomerID"));
                
                bean.setTerritoryID(myRs.getString("TerritoryID"));
                
                bean.setBillToAddressID(myRs.getString("BillToAddressID"));
                
                bean.setShipToAddressID(myRs.getString("ShipToAddressID"));
                
                bean.setShipMethodID(myRs.getString("ShipMethodID"));
                
                bean.setCreditCardID(myRs.getString("CreditCardID"));
                
                bean.setCreditCardApprovalCode(myRs.getString("CreditCardApprovalCode"));
                
                bean.setCurrencyRateID(myRs.getString("CurrencyRateID"));
                
                bean.setSubTotal(myRs.getString("SubTotal"));
                
                bean.setTaxAmt(myRs.getString("TaxAmt"));
                
                bean.setFreight(myRs.getString("Freight"));
                
                bean.setTotalDue(myRs.getString("TotalDue"));
                
                bean.setComment(myRs.getString("Comment"));
                
                bean.setModifiedDate(myRs.getString("ModifiedDate"));
               
                beanCollection.add(bean);
                
                
            }
            request.setAttribute("beansCollection", beanCollection);
            RequestDispatcher csvDisplayPage = request.getRequestDispatcher("WEB-INF/jsps/csv-display.jsp");
            csvDisplayPage.forward(request, response);
       
        // Clean up
        myRs.close();
        myStmt.close();
        }catch(Exception exc){
            exc.printStackTrace();
	}
        		
    }
    
}
