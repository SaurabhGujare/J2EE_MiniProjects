/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.edu.servlet;

import com.neu.edu.dao.MoviesDatabase;
import com.neu.edu.pojo.Movie;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class MovieServlet extends HttpServlet{
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
        String actionValue = request.getParameter("value");
        
        if(actionValue.equals("addMovieOption")){
            RequestDispatcher reqAddMoviePage = request.getRequestDispatcher("WEB-INF/jsps/add-new-movie.jsp");
            reqAddMoviePage.forward(request, response);
            
        }
        
        if(actionValue.equals("browseMovieOption")){
            RequestDispatcher reqBrowseMoviePage = request.getRequestDispatcher("WEB-INF/jsps/browse-movie.jsp");
            reqBrowseMoviePage.forward(request, response);
            
        }
        
        if(actionValue.equals("addMoviePage")){
            String title= request.getParameter("title");
            String actor= request.getParameter("actor");
            String actress= request.getParameter("actress");
            String genre= request.getParameter("genre");
            String year= request.getParameter("year");
            try {
                MoviesDatabase.setMovie(title,actor,actress,genre,year);
                System.out.println("Redirecting to AddMovieSucessPage......");
                RequestDispatcher reqAddMovieSuccessPage = request.getRequestDispatcher("WEB-INF/jsps/add-movie-success.jsp");
                reqAddMovieSuccessPage.forward(request, response);
            } catch (SQLException ex) {
                System.out.println("Redirecting to AddMovieExistsPage......");
                RequestDispatcher reqAddMovieSuccessPage = request.getRequestDispatcher("WEB-INF/jsps/add-movie-exists.jsp");
                reqAddMovieSuccessPage.forward(request, response);
                Logger.getLogger(MovieServlet.class.getName()).log(Level.SEVERE, null, ex);
            }     
        }
        
        if(actionValue.equals("browseMoviePage")){
            String keyword = request.getParameter("keyword");
            String movieFilterBy = request.getParameter("movieFilter");
            ArrayList<Movie> movieCollection= new ArrayList<Movie>();
            try {
                movieCollection = MoviesDatabase.getMovie(keyword, movieFilterBy);
                request.setAttribute("movieCollection", movieCollection);
                request.setAttribute("keyword", keyword);
                RequestDispatcher reqBrowseMovie = request.getRequestDispatcher("WEB-INF/jsps/browse-movie-success.jsp");
                reqBrowseMovie.forward(request, response);
            } catch (SQLException ex) {
                Logger.getLogger(MovieServlet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MovieServlet.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
    }
    
}

