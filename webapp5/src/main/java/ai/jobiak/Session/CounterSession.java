package ai.jobiak.Session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CounterSession
 */
@WebServlet("/session")
public class CounterSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CounterSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter(); 
		HttpSession session=request.getSession();
		int counter=1;
		if(session.isNew()) {
			session.setAttribute("visits",counter+"");
		}else {
			String counterStr=(String)session.getAttribute("visits");
			counter=Integer.parseInt(counterStr);
			counter++;
			session.setAttribute("visits",counter+"");
			
					
		}
		//response.setContentType("text/html");
		out.println("you visited #"+counter);
		out.println("SessionID"+session.getId());
		out.println("SessionMaxInterval"+session.getMaxInactiveInterval());
		out.println("Last Acceess Time"+session.getLastAccessedTime());
		
	}

}
