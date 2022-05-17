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
 * Servlet implementation class ShoppingCart4
 */
@WebServlet("/cart4")
public class ShoppingCart4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingCart4() {
        super();
        // TODO Auto-generated constructor stub
    }
    private ArrayList<Product> getProducts(){
        
    	  String url = "jdbc:mysql://localhost:3306/world";
    	  String user = "root";
    	  String pass = "admin";
    	  
    	  
    	  ArrayList<Product>productList=new ArrayList<>();
    	  Connection con=null;
    	   try {
    	   Class.forName("com.mysql.cj.jdbc.Driver");
    	   con = DriverManager.getConnection(url,user,pass);
    	   Statement st=con.createStatement();
    	   String selectSQL="select* from product";
    	   ResultSet rs=st.executeQuery(selectSQL);
    	   
    	   while(rs.next()) {
    	   
    	   Product p=new Product(rs.getString(1), rs.getString(2),rs.getDouble(3));
    	   
    	   productList.add(p);
    	   
    	   }
    	  } catch (Exception e) {
    	   
    	   e.printStackTrace();
    	  }finally {
    	   if(con!=null) {
    	    try {
    	     con.close();
    	     
    	    }catch(SQLException e) {
    	     e.printStackTrace();
    	    }
    	   }
    	  }
    	   return productList;
    	  }

    	    
    	    /**
    	  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    	  */
    	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	  
    	  PrintWriter out=response.getWriter();
    	  response.setContentType("text/html");
    	  ArrayList<Product>itemsList=null;
    	  itemsList=getProducts();
    	  out.println("<hr/>");
    	  
    	  for(int i=0;i<itemsList.size();i++) {
    	  out.println("<a href='cart4?item="+itemsList.get(i).getProductId()+"'>Add Item"+itemsList.get(i).getProductId()+"</a>"+"</br>");
    	  }
    	  
    	      
    	  out.println("<hr/>");
    	  HttpSession shoppingCart=request.getSession();
    	  ArrayList<Product>selectedItemsList=null;
    	  
    	  if(shoppingCart.isNew()) {
    	   selectedItemsList=new ArrayList<>();
    	   shoppingCart.setAttribute("items",selectedItemsList);
    	   
    	  }
    	  else {
    	       String qs=request.getQueryString();
    	       String splitArray[]=qs.split("=");
    	       String productId=splitArray[1];
    	    for(int i=0;i<itemsList.size();i++) {
    	     if(itemsList.get(i).getProductId().equals(productId)) {
    	     selectedItemsList=(ArrayList<Product>)shoppingCart.getAttribute("items");
    	     selectedItemsList.add(itemsList.get(i));
    	     shoppingCart.setAttribute("items",selectedItemsList);
    	     
    	     break;
    	    }
    	     
    	    }
    	   }
    	  
    	  for(Product p:selectedItemsList) {
    	   out.println(p.getProductId()+" : "+p.getDescription()+" : "+p.getPrice()+"</br>");
    	  }
    	  out.println("</hr>");
    	  out.println("<h3>Items in the cart#"+selectedItemsList.size());
    	  }
    	  
}
