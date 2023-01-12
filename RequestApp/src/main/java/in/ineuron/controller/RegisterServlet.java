package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/register", loadOnStartup = 1)
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	static {
		System.out.println("Servlet loading...");
	}
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("Servlet is instantiation....");
    }
    
    public void init() {
    	System.out.println("Servlet is initializing....");
    }

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Reuest processing for POST GET type method..");
		System.out.println("Request method implementation class.."+request.getClass().getName());
		System.out.println("Response method implementation class.."+response.getClass().getName());
		
		String username = request.getParameter("username");
		String contactnumber =request.getParameter("contactnumber");
		String emailid = request.getParameter("emailid");
		String[] courses = request.getParameterValues("courses");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		out.println("<html><head><title>OUTPUT PAGE</title></head>");
		out.println("<body bgcolor='cyan'>");
		out.println("<center><h1>Course Details of a Student: </h1></center>");
		out.println("<table border='1' align='center'>");
		out.println("<tr><th>USERNAME: </th><td>"+username+"</td></tr>");
		out.println("<tr><th>CONTACT NUMBER:</th><td>"+contactnumber+"</td></tr>");
		out.println("<tr><th>EMAIL ID:</th><td>"+emailid+"</td></tr>");
		out.println("<tr>");
		out.println("<th>Course Selected</th>");
		out.println("<td>");
		for (String course : courses) {
			out.println(course+"</br>");
		}
		out.println("</td>");
		out.println("</tr>");
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
		
		out.close();
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Servlet is Deinstantiated...");
	}

}
