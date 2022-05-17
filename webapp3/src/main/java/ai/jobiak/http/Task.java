package ai.jobiak.http;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Task
 */
public class Task extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Task() {
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
		String fnameStr=request.getParameter("custid");
		  String emailStr=request.getParameter("name");
		  String mobileStr=request.getParameter("balance");
		 // response.getWriter().println(fnameStr+emailStr+mobileStr);
		  Connection con = connect();
		
		 PrintWriter out = response.getWriter();  
		        response.setContentType("text/html");  
		        out.println("<html><body>");  
		        try 
		        {  
		            Statement stmt = con.createStatement();  
		            ResultSet rs = stmt.executeQuery("select * from customer");  
		            out.println("<table border=1 width=20% height=20%>");  
		            out.println("<tr><th>custid</th><th>name</th><th>balance</th><tr>");  
		            while (rs.next()) 
		            {  
		                String custid = rs.getString("custid");  
		                String name = rs.getString("name");  
		                String balance = rs.getString("balance");  
		                out.println("<tr><td>" + custid + "</td><td>" + name + "</td><td>" +balance + "</td></tr>");
		            }
		            out.println("</table>");
		            out.println("<html></body>");
		            		con.close();
		        
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		     
		
	}
		     
		           
		    
	
	            
		        
	
		       

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
