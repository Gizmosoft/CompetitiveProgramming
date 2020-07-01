package dataStructures;

import java.util.*;

//This program combines two dynamic arrays into one single dynamic array

public class PlayWithArrayList {

	public static void main(String[] args) {
		String[] words = {"Hello", "World", "Some", "More"};
		String[] more = {"Example", "Fun"};
		System.out.println(merge(words, more));
		System.out.println(merge(words, more).getClass().getName());
	}
	
	public static ArrayList<String> merge(String[] words, String[] more){
		ArrayList<String> sentence = new ArrayList<String>();
		for(String w : words) sentence.add(w);
		for(String w : more) sentence.add(w);
		return sentence;
	}

}
