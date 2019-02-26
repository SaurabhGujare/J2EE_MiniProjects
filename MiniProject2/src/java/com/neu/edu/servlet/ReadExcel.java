/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.edu.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
/**
 *
 * @author Saurabh Gujare (NUID : 001424874)
 */
@WebServlet(urlPatterns = {"/hw2_part6.xls"})
public class ReadExcel extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String fileName = request.getParameter("fileExcel");
        //set content type
        response.setContentType("text/html");

        //get printWriter object
        PrintWriter out = response.getWriter();
        
        //Build logic
        
        try{
            FileInputStream file = new FileInputStream(new File("/Users/saurabhgajare/Desktop/"+fileName));
            //get excel file
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            out.println("<html>");
            out.println("<head><title>Excel data</title><link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\" integrity=\"sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS\" crossorigin=\"anonymous\"></head>");
            out.println("<body>");
            out.println("<h1><u>" + fileName + " Excel File" + "</u></h1>");
            out.println("<table class=\"table table-striped\"");
            
            for(int j=0;j<workbook.getNumberOfSheets();j++){
            //get particular sheet
            HSSFSheet sheet = workbook.getSheetAt(j);
            //Iterate over the rows
            Iterator<Row> rowIterator = sheet.iterator();
//            Row rowHead = rowIterator.next();
//            out.println("<thead");
//            out.println("<tr>");
//            for(int i=0;i<rowHead.getLastCellNum();i++){
//                out.println("<th scope=\"col\">" + rowHead.getCell(i) + "</th>" );
//                }   
//            out.println("</tr>");
//            out.println("</thead>");
            
            while(rowIterator.hasNext()){
                Row row = rowIterator.next();
                out.println("<tr>");
                
                for(int i=0;i<row.getLastCellNum();i++){
                out.println("<td scope=\"row\">" + row.getCell(i) + "</td>" );
                }   
                out.println("</tr>");
            }
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        }catch(IOException e){
        }
        
    }
}
