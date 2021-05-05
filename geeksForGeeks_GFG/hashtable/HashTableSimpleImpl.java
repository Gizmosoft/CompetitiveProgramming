package geeksForGeeks_GFG.hashtable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableSimpleImpl {

	public static void main(String[] args) {
		Hashtable<Integer, String> table1 = new Hashtable<>();
		Hashtable<Integer, String> table2 = new Hashtable<>();
		
		table1.put(1, "Kartikey");
		table1.put(2, "Rajat");
		table1.put(3, "Amritesh");
		table1.put(4, "Hrithik");
		
		table2.put(10, "Robert");
		table2.put(20, "Joanne");
		table2.put(30, "Axel");
		//table2.remove(30);
		
		System.out.println(table1);
		System.out.println(table2);
		
		for(Map.Entry<Integer, String> e : table1.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		System.out.println();
		for(Map.Entry<Integer, String> f : table2.entrySet()) {
			System.out.println(f.getKey() + " " + f.getValue());
		}
		
	}

}
