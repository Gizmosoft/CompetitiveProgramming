package dataStructures;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListUsingCollections {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Bombay");
		al.add("Bangalore");
		al.add("Chennai");
		al.add("Kolkata");
		al.add("Delhi");
		System.out.println("unsorted " + al);
		Collections.sort(al);
		System.out.println("sorted " + al);
	}
}
