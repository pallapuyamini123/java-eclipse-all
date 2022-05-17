package ai.jobiak.ass;

import java.io.Serializable;

public class Contact implements Serializable{
	private String name;
	private String age;
	private String mobile;
	public Contact() {
		  System.out.println("bean instantiated");
		 }
		 
		public String getname() {
		 return name;
		}
		public void setname(String name) {
		 this.name = name;
		 System.out.println("prop is set.."+name);
		}
		public String getage() {
		 return age;
		}
		public void setAge(String age) {
		 this.age = age;

		}
		public String getMobile() {
		 return mobile;
		}
		public void setMobile(String mobile) {
		 this.mobile = mobile;
		}

}
