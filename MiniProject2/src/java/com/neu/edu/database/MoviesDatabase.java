/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.edu.database;


import com.neu.edu.pojo.Movie;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Saurabh Gujare (NUID : 001424874)
 */
public class MoviesDatabase {
    
    public static ArrayList<Movie> getMovie(String keyword, String columnName) throws SQLException, ClassNotFoundException{
        ArrayList<Movie> movieList = new ArrayList<Movie>();
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;
        String title,actor,actress,genre,year;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies", "webstudent", "webstudent");
            myStmt = myConn.createStatement();
            String selectMovie = "SELECT * FROM movie WHERE "+columnName+" LIKE \""+keyword+"%\";";
            myRs = myStmt.executeQuery(selectMovie);
            
            while(myRs.next()){
                title = myRs.getString("title");
                actor = myRs.getString("actor");
                actress = myRs.getString("actress");
                genre = myRs.getString("genre");
                year = myRs.getString("yearReleased");
                Movie movie = new Movie(title, actor, actress, genre, year);
                movieList.add(movie);   
            }
        }catch(SQLException ex){
            throw ex;  
        }finally{
            myStmt.close();
            myConn.close();            
        }
        return movieList;
    }
    
    public static void setMovie(String title,String actor,String actress,String genre,String year) throws SQLException{
        Connection myConn = null;
        Statement myStmt = null;
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movies", "webstudent", "webstudent");
            myStmt = myConn.createStatement();
            
            String insertMovie = "INSERT INTO movie VALUES("+"'"+title+ "'"+",'"+actor+"','"+actress+"','"+genre+"',"+year+");";
            int affectedRows = myStmt.executeUpdate(insertMovie);
                    
            System.out.println("Affected rows is/are"+ affectedRows);
            
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException" + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            throw ex;
        }finally{
            myStmt.close();
            myConn.close();
        }
            
    }
    
}
