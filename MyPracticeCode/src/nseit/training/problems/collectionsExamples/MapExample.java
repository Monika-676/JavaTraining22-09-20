package nseit.training.problems.collectionsExamples;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer,String> hm = new HashMap<>();
        hm.put(1001, "Java programing");
        hm.put(1003, "Dot Net");
        hm.put(1004, "Python");
        hm.put(1005, "Java programing");
        
        System.out.println(hm);
        //Map.Entry m = hm.entrySet();
        for(Map.Entry m : hm.entrySet()){    
           System.out.println(m.getKey()+" "+m.getValue());    
        }
	}

}
