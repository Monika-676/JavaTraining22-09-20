package nseit.training.problems.assignment4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StateCapitalHashMap {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Maharashtra", "Mumbai");
		hm.put("Tamilnadu", "Chennai");
		hm.put("Goa", "Panji");
		hm.put("Ladakh", "Leh");
		hm.put("Gujrat", "Gandhinagar");
		//System.out.println(hm);
		for(Map.Entry<String, String> i : hm.entrySet()) {
			System.out.println(i.getValue().toLowerCase()+"$"+i.getKey().toLowerCase());	
		}
		 
		
	}

}
