package com.jobiak.optional;

import java.util.Optional;

public class option {
	 // public static void main(String[] args) {  
	  //      String[] str = new String[10];  
	   //     String lowercaseString = str[5].toLowerCase();  
	   //     System.out.print(lowercaseString);  
	   // }  
	//To avoid the abnormal termination, we use Optional class. In the following example, we are using Optional. So, our program can execute without crashing.
     

public static void main(String[] args) {  
    String[] str = new String[10];  
    Optional<String> checkNull = Optional.ofNullable(str[5]);  
    if(checkNull.isPresent()){  // check for value is present or not  
        String lowercaseString = str[5].toLowerCase();  
        System.out.print(lowercaseString);  
    }else  
        System.out.println("string value is not present");  
}  





}
