import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.util.*;

public class Assignment1Part6 extends HttpServlet{

	@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       //set content type
      response.setContentType("text/html");

      //get printWriter object
      PrintWriter out = response.getWriter();

      //Build the logic
      int childrenCount = Integer.parseInt(request.getParameter("childrenCount"));
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Form Part 6.1</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<form action=\"asgn1_part6\" method=\"post\">");
      if(childrenCount==0){
        out.println("<br/><h1>You need to have children to enter their names ;-)</h1>");
      }else{
        for(int i=1;i<=childrenCount;i++){
          out.println("<label>Please enter the name of the child number "+ i+"</label>");
          out.println("<input type=\"text\" name=\"childName\" required><br/><br/>");
        }
      out.println("<input type=\"submit\" name=\"Submit\">");
      }
      out.println("</form>");
      out.println("</body>");
      out.println("</html>");
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
      out.println("<title>Form Part 6.1</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<p>Your Children names are<br/>");

      out.println("<ul>");
      String[] childrenCount = request.getParameterValues("childName");
      for(int i=0;i<childrenCount.length;i++){
        out.println("<li>"+childrenCount[i] +"</li>");
      }
      out.println("</ul>");

      out.println("</body>");
      out.println("</html>");  
        
    }
}