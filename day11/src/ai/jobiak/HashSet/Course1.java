package ai.jobiak.HashSet;

import java.util.TreeSet;

public class Course1 implements Comparable {
	
	
	
	
	private String courseId;
	private String title;
	private int durationHours;
	private double fees;
	public Course1() {
	}
	public Course1(String courseId, String title, int durationHours, double fees) {
		super();
		this.courseId=courseId;
		this.title=title;
		this.durationHours=durationHours;
		this.fees=fees;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId=courseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public int getDurationHours() {
		return durationHours;
	}
	public void setDurationHours(int durationHours) {
		this.durationHours=durationHours;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees=fees;
	}
	public String toString() {
		return "Course1 [courseId=" + courseId + ", title=" + title + ", durationHours=" + durationHours + ", fees=" + fees + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Course1 ref = (Course1) o;
		if(this.courseId.compareTo(ref.getCourseId())<0) {
			return -1;
		}
		else if(this.courseId.compareTo(ref.getCourseId())==0) {
			return 0;
		}
		else if(this.courseId.compareTo(ref.getCourseId())>0) {
			return 1;
		}
		return 0;
	}
	
	

	
	


       
		
		/* TreeSet Colors = new TreeSet();
		Colors.add("blue");
		Colors.add("pink");
		Colors.add("red");
		Colors.add("green");
		Colors.add("yellow");
		System.out.println(Colors.size());
		System.out.println(Colors); */
		
	  /*  TreeSet ranks = new TreeSet();
		
		ranks.add(1);
		ranks.add(6);
		ranks.add(9);
		ranks.add(3);
		System.out.println(ranks.size());
		System.out.println(ranks);
	}
	Course1 c1= new Course1("BCPL","Computer Basics",90,500);
	Course1 c2= new Course1("PGL1","Alogarithms",20,7500);
	Course1 c3= new Course1("PGL3","Java progamming",60,20500);
	Course1 c4= new Course1("PGL3","Java programming",60,20500);
	
	
	TreeSet courseTree=new TreeSet();
	
	courseTree
	courseTree
	private Object courseId;.add(c2);
	courseTree.add(c3);
	
	courseTree.add(c4);
	
	System.out.println(courseTree);
	
	
	
		
		
		
		
		
		public int compareTo(Object o) {
			
		Course1 ref = (Course) o;
		if(this.courseId.compareTo(ref.getCourseId())<0)  {
			return -1;
		}else if(this.courseId.compareTo(ref.getCourseId())==0) {
			return 0;
		}else if(this.courseId.compareTo(ref.getCourseId())>0) {
			return 1;
		}
		return 0;       */
		
		
		


		
	}





