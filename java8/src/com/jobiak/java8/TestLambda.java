package com.jobiak.java8;
//Java8 vs interfaces

interface Test {
	public default void paint() { System.out.println("from the default methd..");}
	public static void method() { System.out.println("from the static methd..");}
	public abstract void print();
	//not allowed only onr abstrct method per FunctionalInterface public abstrct void print1();	
	}




class TestImpl implements Test {
	@Override
	
	public void print() {
		//TODO Auto-generated method stub
	}
}


interface Test2 {
	public void add(int a,int b);
}


interface Test3 {
	public int factorial(int n);
}
public class TestLambda {
	
	
	public static void main(String[] args) {

		Test test=()->{System.out.println("from print....printing");};
		test.print();
		
		
		Test2 test2=(int a,int b)->{
			
			
			int c=a+b;
			System.out.println(c);
		};
		
		test2.add(10,20);
		
		
		Test3 test3=(int n)->{
			int fact=1;
			int j=1;
			while(j<=n) {
				 
				
				
				  fact*=j;
				  j++;
			}
			
			
			return fact;};
			
			int factorialResult=test3.factorial(5);
			System.out.println(factorialResult);
			
			
			
			
			
			//interfaces anonymous classes
			Runnable r= new Runnable() {
				public void run() {
					System.out.println("from the run method.......");
				}
			};
			
			
			
			
			
			Thread t=new Thread(r);
			t.start();
			
			
			
			Runnable r1=()->{System.out.println("from()-> run method......");};
			
			Thread t1=new Thread(r1);
			t1.start();
			
		}
		}
		
		
		
		
	//	Runnable r= ()->{
			         //          for(int i=1;i<=5;i++) {
			           //     	   System.out.println(Thread.currentThread().getName()+ i);
			          //         }
		//};
		
		
		
		
		//Thread t=new Thread(r);
		//t.start();
		//}
		
	
	

