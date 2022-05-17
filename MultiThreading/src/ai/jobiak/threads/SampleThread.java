package ai.jobiak.threads;
import java.util.Scanner;

public class SampleThread extends Thread {
	String name;

	
	SampleThread(String name){
		this.name=name;
		
	}

	
	public void run() {
		for(int i=1;i<5;i++)
			System.out.println(this.name+"#enterd run()= "+i);
	
	
	
	 
	try {
		sleep(1000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
}
	
	


