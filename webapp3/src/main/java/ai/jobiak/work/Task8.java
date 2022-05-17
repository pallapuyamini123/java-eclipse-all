package ai.jobiak.work;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Task8
 */
public class Task8 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Task8() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out= response.getWriter();
		  String n=request.getParameter("num"); 
	    	int n1 = Integer.parseInt(request.getParameter("num"));  
	    	
	    	int r,sum=0,temp;
	    	temp=n1;
	    	while(temp>0) {
	    		r=temp%10;
	    		sum=sum+r*r*r;
	    		temp=temp/10;
	    		
	    	}
	    	if(sum==n1) {
	    		out.println("it is armstrong");
	    	} else {
	    		out.println("not a armstrong");
	    	}

	}

	

}
