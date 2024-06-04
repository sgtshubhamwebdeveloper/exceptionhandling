package eligibility;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class CheckVoterEligibility extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public CheckVoterEligibility() {
      
    }
    public void destroy() {
		
	}
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw =response.getWriter();
		String name = request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		if(age>=18)
		{
			pw.println("<font color='green'size='4'>"+name+"you are eligible to vote</font>");
			
		}
		else 
			pw.println("<font color='red'size='4'>"+name+"you are not eligible to vote</font>");
		pw.println("<br><br><a href='Vote.html'>Home</a>");
		pw.close();
	}
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
