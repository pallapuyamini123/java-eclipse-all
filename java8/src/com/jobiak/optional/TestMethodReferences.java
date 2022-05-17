package com.jobiak.optional;




	import java.util.Arrays;
	import java.util.List;

	class Utility{
		
	 Utility(){
	  System.out.println("from default constructor of Utility()");
	 }
	 void method() {
	  System.out.println("from instance method");
	 }
	 static void method2() {
	  System.out.println("from static method2()");
	 }
	}

	interface TestRefs{
		
	 void substitute();
		
	}

	public class TestMethodReferences {

	 public static void main(String[] args) {
		
	  Utility util = new Utility();
	  TestRefs ref = util::method; //the instance method reference
	  ref.substitute();
	  
	  TestRefs ref2 = Utility::method2; //static method reference
	  ref2.substitute();
	  
	  TestRefs ref3 = Utility::new; //constructor reference
	  ref3.substitute();
	  
	  List<Integer>list = Arrays.asList(1,2,3,4,5,6);
	 // System.out.println("List of Numbers: "+list);
	  list.stream().forEach(System.out::println);
	  
	 }

	}

