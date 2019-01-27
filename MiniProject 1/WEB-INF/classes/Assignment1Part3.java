import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.util.*;

public class Assignment1Part3 extends HttpServlet{

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
        String picture = request.getParameter("picture");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPswd = request.getParameter("confirmPswd");
        String gender = request.getParameter("gender");
        String country = request.getParameter("country");
        String address = request.getParameter("address");
        String[] hobbies = request.getParameterValues("hobbies");

        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Form Part3</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> Hello "+name+", Welcome!!!!</h1>");
        out.println("<hr/>");
        out.println("<p><h3>Account Details:</h3><br/>");
        out.println("<p>Name: " + name +"</p>");
        out.println("<p>Email: " + email +"</p>");
        out.println("<p>Password: " + password +"</p>");
        out.println("<p>Profile picture: " + picture +"</p>");
        out.println("<p>Gender: " + gender +"</p>");
        out.println("<p>Country: " + country +"</p>");

        out.println("<p>Hobbies: </p>");
        out.println("<ul>");
        for(String h: hobbies){
            out.println("<li>"+h+"</li>");
        }
        out.println("</ul>");
        out.println("<p>Address: " + address +"</p>");
        out.println("</body>");
        out.println("</html>");
}
}