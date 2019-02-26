/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.edu.servlet;

import com.neu.edu.database.BooksDatabase;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Saurabh Gujare (NUID : 001424874)
 */
public class BookServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    
        //set content type
        response.setContentType("text/html");

        //get printWriter object
        PrintWriter out = response.getWriter();
        
        //Build Logic
        String value = request.getParameter("value");
        
        if(value.equals("bookWelcomePage")){
            try{
           int bookCount = Integer.parseInt(request.getParameter("bookCount"));
           request.setAttribute("bookCount", bookCount);
           RequestDispatcher reqBookFormPage = request.getRequestDispatcher("WEB-INF/jsp/book-form-page.jsp");
           reqBookFormPage.forward(request, response);
            }catch(NumberFormatException nex){
                RequestDispatcher reqAlert = request.getRequestDispatcher("WEB-INF/jsp/book-fail-page.jsp");
                reqAlert.forward(request, response);  
            }
        }
        
        if(value.equals("bookFormPage")){
            String[] isbns = request.getParameterValues("ISBN");
            String[] titles = request.getParameterValues("Book Title");
            String[] authors = request.getParameterValues("Authors");
            String[] price = request.getParameterValues("Price");
            
            try {
                BooksDatabase.setBook(isbns,titles,authors,price);
                request.setAttribute("bookCount", isbns.length);
                RequestDispatcher reqBookSuccessPage = request.getRequestDispatcher("WEB-INF/jsp/book-success-page.jsp");
                reqBookSuccessPage.forward(request, response);
            } catch (SQLException ex) {
                System.out.println("Inside");
                RequestDispatcher reqAlert = request.getRequestDispatcher("WEB-INF/jsp/book-fail-page.jsp");
                reqAlert.forward(request, response);
                Logger.getLogger(BookServlet.class.getName()).log(Level.SEVERE, null, ex);
                
            }catch(NumberFormatException nex){
                RequestDispatcher reqAlert = request.getRequestDispatcher("WEB-INF/jsp/book-fail-page.jsp");
                reqAlert.forward(request, response);  
            }catch (ClassNotFoundException ex) {
                Logger.getLogger(BookServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
