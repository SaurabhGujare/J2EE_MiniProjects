import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.util.*;

public class Assignment1Part5 extends HttpServlet{

	@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //set content type
        response.setContentType("text/html");

        //get printWriter object
        PrintWriter out = response.getWriter();

        //Build the logic

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Form Part5</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> Hello "+request.getParameter("Name")+", Welcome!!!!</h1>");
        out.println("<hr/>");
        out.println("<p><h3>Account Details:</h3><br/>");

        Map<String,String[]> parameterMap= request.getParameterMap();

        Set<Map.Entry<String,String[]>> parameterSet= parameterMap.entrySet();

        for (Map.Entry< String,String[]> param:parameterSet) 
       { 
	   		out.println("<p>"+param.getKey()+": ");
	   		if(param.getValue().length==1){            
           		out.println(param.getValue()[0]); 
       	   	}
           	else{
           		out.println("<ul>");
           		for(String paramValue: param.getValue()){
           			out.println("<li>"+paramValue+"</li>");
           		}
           		out.println("</ul>");
           	}
       } 
        
    }
}