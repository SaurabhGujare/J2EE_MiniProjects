import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.util.*;

public class ShowRequestHeader extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{

		//set content type (MEME)
		response.setContentType("text/html");

		//create printwriter object
		PrintWriter out = response.getWriter();

		//Write html code to show headers
		out.println("<html>");
		out.println("<head><title>Request Header</title></head>");
		out.println("<body>");
		out.println("<h1> Displaying Request Header</h1> <br/><br/>");
		out.println("<strong>Request Method:</strong> "+request.getMethod());
		out.println("<br/> <strong>Request URI: </strong>"+request.getRequestURI());
		out.println("<br/> <strong>Request Protocol: </strong>"+request.getProtocol()+"<br/>");
		out.println("<br/> <br/> <table border=2 ALIGN=\"center\">");
		out.println("<TR>");
		out.println("<TH>HEADER NAME</TH>");
		out.println("<TH>HEADER VALUE</TH>");
		out.println("</TR>");
		
		Enumeration headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()){
			String headerName = (String) headerNames.nextElement();
			out.println("<TR>");
			out.println("<TD> "+headerName+" </TD>");
			out.println("<TD> "+request.getHeader(headerName)+" </TD>");
			out.println("</TR>");
		}
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		doGet(request,response);
	}
}