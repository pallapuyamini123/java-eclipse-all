package com.jobiak.optional;
import java.util.Optional;
public class option3 {


	
		
	 /*static void method(String input) {
	 if(input!=null)
	  System.out.println(input.length());
	 }*/
	  

	 public static void main(String[] args) {
	  
	  //not instantiated
	  String str = null;
	  //System.out.println(str.length());
	  
	  //instantiated
	  String str2 = new String("Java8");
	  //System.out.println(str2.length());

	  //method(str);
	  
	// Optional optional1 = Optional.of(str); //throwsNullPointerException
	  
	  
	// Optional optional1 = Optional.of(str2); 
	// System.out.println(optional.get());
	    
	  Optional optional2 = Optional.ofNullable(str);
	 // System.out.println(optional2.get()); //NoSuchELementException
	    
	 Optional optional3 = Optional.ofNullable(str2);
	   //System.out.println(optional3.get());
	    
	 Optional optional4 = Optional.ofNullable(str);
	  if(optional4.isPresent()) 
	  System.out.println(optional4.get()); //this exception is not thrown NoSuchELementException
	      
	  Optional optional5 = Optional.ofNullable(str);
	  System.out.println(optional5.orElse("Alternate String")); //NoSuchELementException
	  
	  Optional optional6 = Optional.ofNullable(str2);
	  System.out.println(optional6.orElse("Alternate String")); //NoSuchELementException
	  
	  }


}
