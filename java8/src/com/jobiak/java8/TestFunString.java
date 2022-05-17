package com.jobiak.java8;
import java.util.function.Function;
public class TestFunString {
	
	
	public static void main(String[] args) {
		
		
		
                Function<String,Integer> lengthFunction=(String str)->{return str.length();};
		
                int result=lengthFunction.apply("Jobiak.com");
                System.out.println("Length of given string.....");
                System.out.println(result);
                

               Function<String,String> subStringFun=(String str1)->{return str1.substring(2);};
		
               String r=subStringFun.apply("Jobiak.com");
               System.out.println("Substring of given string.....");
               System.out.println(r);
               
               
               Function<String,String> lowerStringfun=(String str2)->{return str2.toLowerCase();};
       		
               String r1=lowerStringfun.apply("JOBIAK");
               System.out.println("Lowercase of given string.....");
               System.out.println(r1);
               
               
               Function<String,String> upperStringfun=(String str3)->{return str3.toUpperCase();};
          		
               String r2=lowerStringfun.apply("welcome to jobiak");
               System.out.println("Uppercase of given string.....");
               System.out.println(r2);
               
               
               
               Function<String,String> funString=(String str4)->{return str4.replace("b","B");};
          		
               String r3=funString.apply("jobiak web developer");
               System.out.println("replace of given string.....");
               System.out.println(r3);
               
               
               
               Function<String,String> funcString=(String str5)->{return str5.indent(3);};
          		
               String r4=funcString.apply("Jobiak Employee");
               System.out.println("Giving the  spaces before string.....");
               System.out.println(r4);
               
               
               Function<String,String> conctString=(String str6)->{return str6.concat("JOBIAK");};
          		
               String r5=conctString.apply("HELLO");
               System.out.println("concatination of given string.....");
               System.out.println(r5);
               
               
 
	}

}
