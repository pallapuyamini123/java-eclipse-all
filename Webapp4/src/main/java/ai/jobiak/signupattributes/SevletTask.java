package ai.jobiak.signupattributes;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SevletTask
 */
public class SevletTask extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SevletTask() {
        super();
        // TODO Auto-generated constructor stub
    }
    private Connection connect()  {
    	String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection(url,userName,password);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//PrintWriter out=response.getWriter();
		
		try {
			Connection con = connect();
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			
			ResultSet 	rs = stmt.executeQuery("select * from customer");;
			rs.next();
			PrintWriter out=response.getWriter();
			ServletContext context=getServletContext();
			context.setAttribute("custid",rs.getString(1));
			context.setAttribute("name",rs.getString(2));
			context.setAttribute("balance", rs.getString(3));
			
			RequestDispatcher dispatcher=context.getRequestDispatcher("/tasks");
			dispatcher.forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
			
		
		
		/*request.setAttribute("balance","100");//will be alive till the request is in progress on server side
		request.setAttribute("branch","cse");//they are lost once the response 
		
		RequestDispatcher dispatcher=context.getRequestDispatcher("/tasks");
		dispatcher.forward(request, response);*/
		
		
		//context.setAttribute("fname","yamini");
		//context.setAttribute("email", "yamini@gmail.com");
	//	context.setAttribute("mobile","12345");
		
		
		
		
	}

}
