import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.util.*;

public class Assignment1Part4 extends HttpServlet{

	@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //set content type
        response.setContentType("text/html");

        //get printWriter object
        PrintWriter out = response.getWriter();

        //Build logic
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Form Part4</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> Hello "+request.getParameter("Name")+", Welcome!!!!</h1>");
        out.println("<hr/>");
        out.println("<p><h3>Account Details:</h3><br/>");
        
        Enumeration paramNames = request.getParameterNames();
        while(paramNames.hasMoreElements()){
            String paramName = (String) paramNames.nextElement();
            out.println("<p>"+paramName+": ");
            String[] paramValues = request.getParameterValues(paramName);

            if(paramValues.length == 1){
                String paramValue = paramValues[0];
                out.println(paramValue);
            }
            else{
                out.println("<ul>");
                for(String v: paramValues){
                    out.println("<li>"+v+"</li>");
                }
                out.println("</ul>");
            }
            
        }
        
        out.println("</body>");
        out.println("</html>");
    }
}