package ai.jobiak.work;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Task9
 */
public class Task9 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Task9() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int inp=Integer.parseInt(request.getParameter("dec"));
		PrintWriter out=response.getWriter();
		int i;
		int[] a=new int[100];
		for(i=0;inp!=0;i++,inp=inp/16)
		{
		a[i]=inp%16;
		}
		for(i--;i>=0;i--)
		{
		switch(a[i]){
		case 10:out.print("A");break;
		case 11:out.print("B");break;
		case 12:out.print("C");break;
		case 13:out.print("D");break;
		case 14:out.print("E");break;
		case 15:out.print("F");break;
		default:out.print(a[i]);break;
        }
		}
	}
	}


