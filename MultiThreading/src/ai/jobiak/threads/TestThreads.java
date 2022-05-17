
package ai.jobiak.threads;

public class TestThreads {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("started main thread........");
		
		
		SampleThread s1 = new SampleThread("s1");
		SampleThread s2 = new SampleThread("s2");
		
		
		//s1.run();
		//s2.run();
		
		s1.start();
		s2.start();
		//s1.setDaemon(true);
		//s2.setDaemon(true);
		
		System.out.println("existing main thread......");
	}
}
	


