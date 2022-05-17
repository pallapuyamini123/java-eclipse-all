package ai.jobiak.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class TestBulkOperations {
	
	public static void main(String[] args) {
		ArrayList<String> companies= new ArrayList<>();
		companies.add("googgle");
		companies.add("apple");
		companies.add("tcs");
		companies.add("goldmen sachs");
		companies.add("jobiak");
		
		System.out.println(companies);
		
		
		HashSet setOfTelecomCompanies = new HashSet();
		setOfTelecomCompanies.add("reliance");
		setOfTelecomCompanies.add("airtel");
		setOfTelecomCompanies.add("idea");
		setOfTelecomCompanies.add("bsnl");
		
		
		System.out.println(setOfTelecomCompanies);
		
		
		
		//bulk
		
		System.out.println(setOfTelecomCompanies.containsAll(setOfTelecomCompanies));
		
		
		System.out.println(companies.containsAll(companies));
		
		
		setOfTelecomCompanies.add("googgle");
		setOfTelecomCompanies.add("apple");
		setOfTelecomCompanies.add("tcs");
		setOfTelecomCompanies.add("goldmen sachs");
		setOfTelecomCompanies.add("jobiak");
		
		System.out.println(setOfTelecomCompanies.containsAll(setOfTelecomCompanies));
		System.out.println(setOfTelecomCompanies.size());
		setOfTelecomCompanies.removeAll(companies);
		System.out.println(setOfTelecomCompanies.size());
		
		
		
		
		
		
		
		
		//RetainAll
		ArrayList<String> comp= new ArrayList<>();
		comp.add("googgle");
		comp.add("apple");
		comp.add("tcs");
		comp.add("goldmen sachs");
		
		
		HashSet telecomList = new HashSet();
		
		
		telecomList.add("reliance");
		telecomList.add("airtel");
		telecomList.add("idea");
		telecomList.add("bsnl");
		telecomList.add("googgle");
		telecomList.add("goldmen sachs");
		
		telecomList.addAll(telecomList);
		
		System.out.println(telecomList);
		
		
		telecomList.retainAll(telecomList);
		
		System.out.println(telecomList);
		
		
		}

}
