package com.neu.edu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import javax.servlet.RequestDispatcher;

public class Assignment1Part7 extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       //set content type
      response.setContentType("text/html");

      //get printWriter object
      PrintWriter out = response.getWriter();

      //Create a session object
      HttpSession session = request.getSession();

      //Build Logic
      ArrayList<String> cartItems = (ArrayList<String>)session.getAttribute("productList");
      if(request.getParameter("choice").equals("showCart")){
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Form Part 7.1</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<p><h1>Your Cart:</h1><br/><hr>");
      
      if(session ==null){
      out.println("<p><br/>Your cart is empty.");
      }else{
          
              out.println("<form action=\"asgn1_part7\" method=\"get\">");
                out.println("<ol style=\"list-style-type: none\">");
                for(String prod: cartItems){
                    out.println("<br/><input type=\"checkbox\" name=\"delProd\" value=\""+prod+"\" />"+"<li style=\"display:inline\">"+prod+"</li>");
                }
                out.println("</ol>");
                out.println("<input type=\"hidden\" name=\"choice\" value=\"delete\">");
                out.println("<input type=\"submit\" value=\"Remove Selected Items\">");
                out.println("</form>");  
      }

      
      System.out.println("**************"+request.getParameter("choiceDelete"));
      

      
      //href=\"form_part7.html\" 
      //onclick= window.history.go(-1)
      //out.println("<br/><br/> <a onclick= window.history.go(-1)><u>Return to Home Page</u></a>");
      out.println("<br/><br/> <a href=\"http://localhost:8080/Homework2/form_part7.html\"><u>Return to Home Page</u></a>");
      out.println("</body></html>");
      }else if(request.getParameter("choice").equals("delete")){
          for(int i=0;i<request.getParameterValues("delProd").length;i++){
              cartItems.remove(request.getParameterValues("delProd")[i]);
                }
          request.setAttribute("productList", cartItems);
          RequestDispatcher reqAddMoviePage = request.getRequestDispatcher("WEB-INF/jsp/shoopingcart-delete.jsp");
          reqAddMoviePage.forward(request, response);
      }
      
  }

  @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
      //set content type
      response.setContentType("text/html");

      //get printWriter object
      PrintWriter out = response.getWriter();

      //Create a session object
      HttpSession session = request.getSession();

      //Build the logic
      
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Form Part 7.1</title>");
      out.println("</head>");
      out.println("<body>");

      if(request.getParameterValues("products")!=null){
          
        String[] productArray = request.getParameterValues("products");
        ArrayList<String> productList = new ArrayList<String>(Arrays.asList(productArray));
        session.setAttribute("productList",productList);
        out.println("<p>Following Product has been successfully added:<br/>");
        out.println("<ol>");

        for(String prod: productList){
          out.println("<li>"+prod+"</li>");
        }

        out.println("</ol>");
        out.println("<hr>");
      }
      else{
        out.println("<p><h1>No products added to the cart. Please return back</h1>");
        //session.invalidate();
      }
      // href=\"form_part7.html\"
      //<a href=\"asgn1_part7\" > View Cart</a> | 
      out.println("<br/><br/><a onclick= window.history.go(-1)><u>Return to Home Page</u></a>");
      out.println("</body></html>");
    }
    
}