package HackerRank;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		checkPalindrome(s);
	}
	
	public static void checkPalindrome(String s){
		String reverse = new StringBuffer(s).reverse().toString(); //reverse the given string
		
		//check whether the string is a palindrome or not
		if(s.equals(reverse))
			System.out.println("Yes, it is a palindrome");
		else
			System.out.println("No, it is not a palindrome.");
		
	}
}
