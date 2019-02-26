/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.edu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.commons.dbutils.DbUtils;

/**
 *
 * @author Saurabh Gujare (NUID : 001424874)
 */
public class CsvDao {
    
    static final String CSV_DRIVER = "org.relique.jdbc.csv.CsvDriver";
    static final String CSV_PATH = "jdbc:relique:csv:/Users/saurabhgajare/Desktop/";
    private Connection myConn;

    public Connection getConnection() throws Exception {
        try {
            Connection connection = null;
            Class.forName(CSV_DRIVER);
            this.myConn = DriverManager.getConnection(CSV_PATH);
        } catch (SQLException ex) {
//            endConnection();
            System.out.println("SQL Exception");
            ex.printStackTrace();
            throw new Exception();
        }
//            endConnection();
        return this.myConn;
    }
    
}
