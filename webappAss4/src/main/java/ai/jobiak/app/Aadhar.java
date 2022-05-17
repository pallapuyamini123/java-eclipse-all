package ai.jobiak.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ai.jobiak.core.TestAadhar;

/**
 * Servlet implementation class Aadhar
 */
@WebServlet("/connect")
public class Aadhar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Aadhar() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void TestAadhar() {
    	private String fullName;
		private String gender;
		private String dob;
		private String address;
		private String district;
		private String pincode;
		private String mobile;
		private String email;
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
    	
    
		public void AadharDetails() {
			Scanner input=new Scanner(System.in);
			out.println("enter your fullname");
			fullName=input.nextLine();
			out.println("enter your gender");
			gender=input.nextLine();
			out.println("enter your date of birth");
			dob=input.nextLine();
			out.println("enter your address");
			address=input.nextLine();
			out.println("enter your district");
			district=input.nextLine();
			out.println("enter pincode");
			pincode=input.nextLine();
			out.println("enter your mobile number");
			mobile=input.nextLine();
			out.println("enter your email");
			email=input.nextLine();
		}
		public  void insertDetails() throws SQLException {
			
			Connection con=DriverManager.getConnection(url,userName,password);
			out.println("connection to database...");
			String sql="insert into aadhar values(?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1,fullName);
			
			pstmt.setString(2,gender);
			
		
			pstmt.setString(3,dob);
			pstmt.setString(4,address);
			pstmt.setString(5,district);
			pstmt.setString(6,pincode);
			pstmt.setString(7,mobile);
			pstmt.setString(8,email);
			pstmt.execute();
			out.println("Record inserted successfully");

		}
		public void ModifyAadhar() throws SQLException {
			Connection con=DriverManager.getConnection(url,userName,password);
			Scanner input=new Scanner(System.in);
			out.println("enter your fullname");
			fullName=input.nextLine();
			System.out.println("enter your mobile number");
			mobile=input.nextLine();
			//System.out.println("connection to database...");
			String sql1="update aadhar  set fullName=? where mobile=?";
			PreparedStatement pstmt=con.prepareStatement(sql1);
			pstmt.setString(1,fullName);
			pstmt.setString(2,mobile);
			pstmt.execute();
			out.println("Record updated successfully");
		}
		public void viewAadhar() throws SQLException {
			Connection con=DriverManager.getConnection(url,userName,password);
			Scanner input=new Scanner(System.in);
			Statement stmt=con.createStatement();
			
			String select="select * from aadhar";
	        ResultSet rs=stmt.executeQuery(select);
			
			while(rs.next()) {
				out.println(rs.getString(1) + " :: "+rs.getString(2)+" :: "+rs.getString(3)+" :: "+rs.getString(4)+" :: "+rs.getString(5) + " :: "+rs.getString(6)+" :: "+rs.getString(7)+" :: "+rs.getString(8));
			}
			
		}
		public void admin() {
			
		}
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		int choice=0;
		int userchoice1=0;
		TestAadhar service=new TestAadhar();
		out.println("Welcome to Aadhar seva:)");
		out.println("Select an Sevice \n 1.Apply for new aadhar \n 2.Modify aadhar \n 3. view your aadhar\n");
		Scanner input= new Scanner(System.in);
		choice=input.nextInt();
		switch(choice)
		{
		case 1:
			service.AadharDetails();
			service.insertDetails();
			break;
		case 2:
			out.println("Select data to modify/update: \n 1.FullName \n 2.Date of birth \n 3.Address \n 4.Mobile number");
			userchoice1=input.nextInt();
			Scanner sc=new Scanner(System.in);
			switch(userchoice1)
			{
			case 1:
				service.ModifyAadhar();		
				break;
			
			default:
				out.println("Please select choice");
		
		}
		case 3:
			service.viewAadhar();
			break;
			
			default:
				out.println("Please select choice");
				
		}
	}
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

	
