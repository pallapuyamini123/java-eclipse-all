package ai.jobiak.http;

import java.io.IOException;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignupForm
 */
public class SignupForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupForm() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private Connection connect() throws SQLException {
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
		}
		return con;
	
    }
    


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fnameStr=request.getParameter("fname");
		String emailStr=request.getParameter("email");
		String mobileStr=request.getParameter("mobile");
		
		Connection con = null;
		try {
			con = connect();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		int count=0;
		
		try {
			
			PreparedStatement pst;
			pst = con.prepareStatement("insert into signup values(?,?,?)");
			pst.setString(1, fnameStr);
			pst.setString(2, emailStr);
			pst.setString(3, mobileStr);
			count=pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		response.getWriter().println(count+"record inserted");
	}
    }
