package ai.jobiak.threads;

import java.util.Scanner;

public class TestThreadMethods {
	
	public static void main(String[] args) throws InterruptedException {
		Scanner scanner=new Scanner(System.in);
		SampleThread s1= new SampleThread("S1");
		s1.setPriority(Thread.MAX_PRIORITY);
		
		SampleThread s2= new SampleThread("S2");
		System.out.println("Starting threads...");
		//s2.setPriority(Thread.MAX_PRIORITY);
		
	//	String line=scanner.nextLine();
		s1.start();
		s2.start();
		
		
		//Thread.sleep(5000);
		
		
		System.out.println("Started threads...");
	}

}
