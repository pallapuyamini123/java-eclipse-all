package ai.jobiak.shopping;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class shoppingCart3
 */
@WebServlet("/cart3")
public class shoppingCart3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public shoppingCart3() {
        super();
        // TODO Auto-generated constructor stub
    }

	private String[] getProductIds() {
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		String productIds[]=new String[10];
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,userName,password);
			Statement stmt=con.createStatement();
			String selectSQL="Select productId from product";
		
			ResultSet rs=stmt.executeQuery(selectSQL);
			
			int i=0;
			while(rs.next()) {
				productIds[i]=rs.getString(1);
				i++;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return productIds;
		
	}
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String  productIds[]=getProductIds();
		for(int i=0;i<productIds.length;i++){
			out.println("<a href='cart3?item="+productIds[i]+"'>Add Item "+productIds[i]+"</a></br>");
		}
		String queryStr=request.getQueryString();
	//	System.out.println(queryStr);
		String splitArray[]= queryStr.split("=");
		String productId=splitArray[1];
		
	//	System.out.println(productId);
		
		
		ArrayList<Product> itemsList=null;
		HttpSession shoppingCart=request.getSession();
		
		if(shoppingCart.isNew()) {
			itemsList=new ArrayList<>();
			shoppingCart.setAttribute("items",itemsList);
			
		}else {
			itemsList=(ArrayList<Product> )shoppingCart.getAttribute("items");
			itemsList.add(new Product(productId,"ABC",80.00));
			shoppingCart.setAttribute("items",itemsList); //session
			
	}
		for(Product p:itemsList) {
			out.println(p.getProductId()+"::"+p.getDescription()+"::"+p.getPrice()+"</br>");
		}
		out.println("<h3>items in the cart:"+itemsList.size());

	}
	

}
