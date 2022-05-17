package ai.jobiak.HashSet;

import java.util.TreeMap;

import java.util.*;

public class TreeTreeMap {
	public static void main(String[] args) {
		TreeMap players = new TreeMap();
		players.put(1, null);
		players.put(2, "kohili");
		players.put(4, "rahul");
		players.put(3, "dhoni");
		
		System.out.println(players);
		System.out.println(players.size());
		
		String name= (String) players.put(1, "rohit");
		System.out.println(name);
		System.out.println(players);
	}

}
