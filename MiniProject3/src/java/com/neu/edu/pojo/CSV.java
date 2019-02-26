/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.edu.pojo;

import java.util.ArrayList;

/**
 *
 * @author Saurabh Gujare (NUID : 001424874)
 */
public class CSV {
    private String SalesOrderID;
    private String RevisionNumber;
    private String OrderDate;
    private String DueDate;
    private String ShipDate;
    private String Status;
    private String OnlineOrderFlag;
    private String SalesOrderNumber;
    private String PurchaseOrderNumber;
    private String AccountNumber;
    private String CustomerID;
    private String TerritoryID;
    private String BillToAddressID;
    private String ShipToAddressID;
    private String ShipMethodID;
    private String CreditCardID;
    private String CreditCardApprovalCode;
    private String CurrencyRateID;
    private String SubTotal;
    private String TaxAmt;
    private String Freight;
    private String TotalDue;
    private String Comment;
    private String ModifiedDate;
    private ArrayList<CSV> list;

    public ArrayList<CSV> getList() {
        return list;
    }

    public void setList(ArrayList<CSV> list) {
        this.list = list;
    }

    public CSV(String SalesOrderID, String RevisionNumber, String OrderDate, String DueDate, String ShipDate, String Status, String OnlineOrderFlag, String SalesOrderNumber, String PurchaseOrderNumber, String AccountNumber, String CustomerID, String TerritoryID, String BillToAddressID, String ShipToAddressID, String ShipMethodID, String CreditCardID, String CreditCardApprovalCode, String CurrencyRateID, String SubTotal, String TaxAmt, String Freight, String TotalDue, String Comment, String ModifiedDate) {
        this.SalesOrderID = SalesOrderID;
        this.RevisionNumber = RevisionNumber;
        this.OrderDate = OrderDate;
        this.DueDate = DueDate;
        this.ShipDate = ShipDate;
        this.Status = Status;
        this.OnlineOrderFlag = OnlineOrderFlag;
        this.SalesOrderNumber = SalesOrderNumber;
        this.PurchaseOrderNumber = PurchaseOrderNumber;
        this.AccountNumber = AccountNumber;
        this.CustomerID = CustomerID;
        this.TerritoryID = TerritoryID;
        this.BillToAddressID = BillToAddressID;
        this.ShipToAddressID = ShipToAddressID;
        this.ShipMethodID = ShipMethodID;
        this.CreditCardID = CreditCardID;
        this.CreditCardApprovalCode = CreditCardApprovalCode;
        this.CurrencyRateID = CurrencyRateID;
        this.SubTotal = SubTotal;
        this.TaxAmt = TaxAmt;
        this.Freight = Freight;
        this.TotalDue = TotalDue;
        this.Comment = Comment;
        this.ModifiedDate = ModifiedDate;
    }

    public CSV() {
    }

    public String getSalesOrderID() {
        return SalesOrderID;
    }

    public void setSalesOrderID(String SalesOrderID) {
        this.SalesOrderID = SalesOrderID;
    }

    public String getRevisionNumber() {
        return RevisionNumber;
    }

    public void setRevisionNumber(String RevisionNumber) {
        this.RevisionNumber = RevisionNumber;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    public String getDueDate() {
        return DueDate;
    }

    public void setDueDate(String DueDate) {
        this.DueDate = DueDate;
    }

    public String getShipDate() {
        return ShipDate;
    }

    public void setShipDate(String ShipDate) {
        this.ShipDate = ShipDate;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getOnlineOrderFlag() {
        return OnlineOrderFlag;
    }

    public void setOnlineOrderFlag(String OnlineOrderFlag) {
        this.OnlineOrderFlag = OnlineOrderFlag;
    }

    public String getSalesOrderNumber() {
        return SalesOrderNumber;
    }

    public void setSalesOrderNumber(String SalesOrderNumber) {
        this.SalesOrderNumber = SalesOrderNumber;
    }

    public String getPurchaseOrderNumber() {
        return PurchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(String PurchaseOrderNumber) {
        this.PurchaseOrderNumber = PurchaseOrderNumber;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getTerritoryID() {
        return TerritoryID;
    }

    public void setTerritoryID(String TerritoryID) {
        this.TerritoryID = TerritoryID;
    }

    public String getBillToAddressID() {
        return BillToAddressID;
    }

    public void setBillToAddressID(String BillToAddressID) {
        this.BillToAddressID = BillToAddressID;
    }

    public String getShipToAddressID() {
        return ShipToAddressID;
    }

    public void setShipToAddressID(String ShipToAddressID) {
        this.ShipToAddressID = ShipToAddressID;
    }

    public String getShipMethodID() {
        return ShipMethodID;
    }

    public void setShipMethodID(String ShipMethodID) {
        this.ShipMethodID = ShipMethodID;
    }

    public String getCreditCardID() {
        return CreditCardID;
    }

    public void setCreditCardID(String CreditCardID) {
        this.CreditCardID = CreditCardID;
    }

    public String getCreditCardApprovalCode() {
        return CreditCardApprovalCode;
    }

    public void setCreditCardApprovalCode(String CreditCardApprovalCode) {
        this.CreditCardApprovalCode = CreditCardApprovalCode;
    }

    public String getCurrencyRateID() {
        return CurrencyRateID;
    }

    public void setCurrencyRateID(String CurrencyRateID) {
        this.CurrencyRateID = CurrencyRateID;
    }

    public String getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(String SubTotal) {
        this.SubTotal = SubTotal;
    }

    public String getTaxAmt() {
        return TaxAmt;
    }

    public void setTaxAmt(String TaxAmt) {
        this.TaxAmt = TaxAmt;
    }

    public String getFreight() {
        return Freight;
    }

    public void setFreight(String Freight) {
        this.Freight = Freight;
    }

    public String getTotalDue() {
        return TotalDue;
    }

    public void setTotalDue(String TotalDue) {
        this.TotalDue = TotalDue;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public String getModifiedDate() {
        return ModifiedDate;
    }

    public void setModifiedDate(String ModifiedDate) {
        this.ModifiedDate = ModifiedDate;
    }
    
    
    
}
