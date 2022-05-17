package ai.jobiak.signupattributes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadTask
 */
public class ReadTask extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadTask() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		ServletContext context=getServletContext();
		out.println("CUSTID:"+context.getAttribute("custid"));
		out.println("NAME:"+context.getAttribute("name"));
		out.println("BALANCE:"+context.getAttribute("balance"));
		//out.println("BALANCE:"+request.getAttribute("balance"));
		//out.println("BRANCH"+request.getAttribute("branch")); */
		
		
		
	//	out.println("FNAME:"+context.getAttribute("fname"));
		//out.println("EMAIL:"+context.getAttribute("email"));
		//out.println("MOBILE:"+context.getAttribute("mobile"));
	}

}
