package com.jobiak.java8examples;



interface Icecream {
	public default void msg() { System.out.println("this is icecream parlour");}
	public void order();
}
interface Test {
	public default void paint() { System.out.println("from the default methd..");}
	public static void method() { System.out.println("from the static methd..");}
	public abstract void print();
	//not allowed only onr abstrct method per FunctionalInterface public abstrct void print1();	
	}




class TestImpl implements Test,Icecream {
	@Override
	
	public void print() {
		//TODO Auto-generated method stub
	}
	public void order() {
		
	}
}

public class Lambda1 {
	public static void main(String[] args) {

		Test test=()->{System.out.println("from print....printing");};
		test.print();
		Icecream t=()->{ System.out.println("this is icecream parlour");};
		t.order();
	}
}
