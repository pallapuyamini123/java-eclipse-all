package ai.jobiak.streams;
import java.io.*;
public class FileToConsole {
	
	public static void main(String[] args)throws IOException {
		//byte streams
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Fresher\\eclipse-workspace\\IOStreams\\src\\ai\\jobiak\\streams\\FileToConsole.java");
		int data=fis.read();
		while(data!=-1) {
			//System.out.print(data);
			System.out.print((char)data);
			data=fis.read();
		}
	}
	
	

}
