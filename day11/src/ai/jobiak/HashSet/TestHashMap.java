package ai.jobiak.HashSet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {
	
	private static Set entires;

	public static void main(String[] args) {
		HashMap  map = new HashMap();
		map.put("apple","iphone");
		
		map.put("Samsung","notel");
		map.put("blackberry","smart phone");
		
		System.out.println(map);
		
		System.out.println(map.size());
		System.out.println(map.get("samsung"));
		
		
		Set keys = map.keySet();
		Iterator iter=keys.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		Collection values= map.values();
		for(Object obj:values) {
			System.out.println(obj);
		}
		
		
		Set<Entry<Object,Object>> entries = map.entrySet();
		Iterator iter2= entries.iterator();
		while(iter2.hasNext()) {
			Entry entry= (Entry) iter2.next();
			System.out.println(entry.getKey() + "::" + entry.getValue());
		}
	
	}

}
