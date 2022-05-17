package com.jobiak.java8examples;
interface ArmStr{
	public boolean isArmstrongnum(int a);
}

public class Arm {
	public static void main(String[] args) {
		//Using lambda function
		ArmStr a=(int n)-> {
			int temp,digits=0,last=0,sum=0;
			temp=n;
			while(temp>0)
			{
				temp=temp/10;
				digits++;
			}
			temp=n;
			while(temp>0) {
				last=temp%10;
				sum+=(Math.pow(last, digits));
				temp=temp/10;
			}
			if(n==sum)
				return true;
			else
				return false;
		};
		System.out.println(a.isArmstrongnum(153));


}
}
