package geeksForGeeks_GFG.hashmaps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapSimpleImpl {
	
// Implementing PUT & GET methods of HashMap
	public static void main(String[] args) {
		HashMap<Object, Object> map = new HashMap<>();
		
		map.put("Kartikey", 10);
		map.put("Kaatyayani", 2);
		map.put("Mallika", 32);
		map.put("Rishabh", 5);
		map.put("Jenice", 23);
		map.put("John", 23);
		map.put(null, null);
		map.put("Don", null);
		
		System.out.println(map);
		
		/* Traversing using Iterator */
/*		
		Iterator it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key= (String) it.next();  
			System.out.println(key + "   " + map.get(key));
		}
*/
		
		/* Traversing using forEach & keySet */
/*
		for(Object key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
*/
		/* Traversing using Map.Entry interface & entrySet method of HashMap collection which converts Collections to set 			format - getKey() & getValue() are the inbuilt methods */
		
		for(Map.Entry<Object, Object> e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
	}

}
