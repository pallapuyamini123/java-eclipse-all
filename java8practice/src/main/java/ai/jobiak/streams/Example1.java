package ai.jobiak.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 {
	List<String> destList = new ArrayList<>(Arrays.asList("foo"));
	List<String> newList = Arrays.asList("0", "1", "2", "3", "4", "5");
	newList.parallelStream().collect(Collectors.toCollection(() -> destList));
	       
	System.out.println(destList);
	
	
	

}
}
