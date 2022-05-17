package ai.jobiak.collections;
import java.util.*;


public class TestArray {
	
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		System.out.println(list.size());
		
		list.add("Think in java");
		list.add("java unleashed");
		list.add("java for dummies");
		list.add("head for first");
		list.add("java in action");
		
		
		System.out.println(list.size());
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		
		ArrayList bookList=new ArrayList();
		System.out.println(bookList.size());
		
		bookList.add("Think in java");
		bookList.add("java unleashed");
		bookList.add("java for dummies");
		bookList.add("head for first");
		bookList.add("java in action");
		
		System.out.println(bookList.size());
		System.out.println(bookList);
		
		for(int i=0;i<bookList.size();i++) {
			System.out.println(bookList.get(i));
			
	
		}
		 
		
		
		Collections.sort(bookList);
		System.out.println(bookList);
		
		
		
		
	}

}
