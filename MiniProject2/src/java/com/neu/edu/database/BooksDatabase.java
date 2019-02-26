/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.edu.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Saurabh Gujare (NUID : 001424874)
 */
public class BooksDatabase {
    public static void setBook(String[] isbns,String[] titles,String[] authors,String[] price) throws SQLException,ClassNotFoundException{
        
        Connection myConn = null;
//        Statement myStmt = null;
        PreparedStatement myPrepStmt=null;
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/booksdb", "webstudent", "webstudent");
//            myStmt = myConn.createStatement();
//            for(int i=0;i<isbns.length;i++){
//            String insertBook = "INSERT INTO book VALUES('"+isbns[i]+"','"+titles[i]+"','"+authors[i]+"',"+Float.parseFloat(price[i])+")";
//            myStmt.executeUpdate(insertBook);
//            }
            String insertBook = "INSERT INTO book VALUES(?,?,?,?)";
            myPrepStmt = myConn.prepareStatement(insertBook);
            
            for(int i=0;i<isbns.length;i++){
              myPrepStmt.setString(1, isbns[i]);
              myPrepStmt.setString(2, titles[i]);
              myPrepStmt.setString(3, authors[i]);
              myPrepStmt.setFloat(4, Float.parseFloat(price[i]));
              myPrepStmt.executeUpdate();
            }
        }catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException" + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            throw ex;
        }catch(NumberFormatException nex){
            throw nex;
        }finally{
            //myStmt.close();
            myPrepStmt.close();
            myConn.close();
        }
    }
}
