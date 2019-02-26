package com.neu.edu.servlet;

import com.neu.edu.pojo.Product;
import com.neu.edu.pojo.ProductList;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import static javafx.scene.input.KeyCode.T;
import javax.servlet.RequestDispatcher;

public class ShoppingCart extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       //set content type
      response.setContentType("text/html");

      //get printWriter object
      PrintWriter out = response.getWriter();

      //Create a session object
      HttpSession session = request.getSession();

      //Build Logic cartItems!=null
      
      ProductList cartItems = (ProductList)session.getAttribute("productList");
      if(request.getParameter("choice").equals("showCart")){
          if(cartItems!=null){
            session.setAttribute("products",cartItems);
            RequestDispatcher reqviewAddedProductPage = request.getRequestDispatcher("WEB-INF/jsps/view-shoppingCart-page.jsp");
            reqviewAddedProductPage.forward(request, response);
          }else{
            RequestDispatcher reqviewAddedProductPage = request.getRequestDispatcher("WEB-INF/jsps/zero-added-product.jsp");
            reqviewAddedProductPage.forward(request, response);   
          }  
      }else if(request.getParameter("choice").equals("delete")){
          
          ProductList deleteItemList = new ProductList();       
            String[] deleteItemArray = request.getParameterValues("products");
            if(deleteItemArray !=null){
                for(String p : deleteItemArray){
                    Product deleteProduct = new Product();
                    deleteProduct.setProductName(p);
                    deleteItemList.add(deleteProduct);
                }           
                ProductList updatedCart = (ProductList) (session.getAttribute("products"));     
                updatedCart.removeAll(deleteItemList);
                session.setAttribute("products", updatedCart);                       
                RequestDispatcher reqViewAddedProductPage = request.getRequestDispatcher("WEB-INF/jsps/view-shoppingCart-page.jsp");
                reqViewAddedProductPage.forward(request, response);
            }else{
                RequestDispatcher reqViewAddedProductPage = request.getRequestDispatcher("WEB-INF/jsps/view-shoppingCart-page.jsp");
                reqViewAddedProductPage.forward(request, response);
            }
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
      ProductList productList = new ProductList();
      if(request.getParameterValues("products")!=null){
          String[] productArray = request.getParameterValues("products");
          for(String item: productArray){
              Product product = new Product();
              product.setProductName(item);
              productList.add(product);
          }
          session.setAttribute("productList",productList);
          RequestDispatcher reqviewAddedProductPage = request.getRequestDispatcher("WEB-INF/jsps/view-added-product.jsp");
          reqviewAddedProductPage.forward(request, response);
      }else{
          RequestDispatcher reqviewAddedProductPage = request.getRequestDispatcher("WEB-INF/jsps/zero-added-product.jsp");
          reqviewAddedProductPage.forward(request, response);
      }
      
    }
    
}