package ai.jobiak.HashSet;

import java.util.TreeSet;

public class TestTreeSet {
	
	public static void main(String[] args)  {
	/*TreeSet ranks = new TreeSet();
	
	ranks.add(1);
	ranks.add(6);
	ranks.add(9);
	ranks.add(3);
	System.out.println(ranks.size());
	System.out.println(ranks); */
	
	Course1 c1= new Course1("BCPL","Computer Basics",90,500);
	Course1 c2= new Course1("PGL1","Alogarithms",20,7500);
	Course1 c3= new Course1("PGL3","Java progamming",60,20500);
	Course1 c4= new Course1("PGL3","Java programming",60,20500);
	
	
	TreeSet courseTree=new TreeSet();
	courseTree.add(c1);
	courseTree.add(c2);
	courseTree.add(c3);

	courseTree.add(c4);

	System.out.println((courseTree));

	}
}







	
	
	


