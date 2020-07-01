package dataStructures;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListsUsingCollections {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Kartikey");
		ll.add("Ankit");
		ll.add("Amritesh");
		ll.addFirst("Rajat");
		
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
