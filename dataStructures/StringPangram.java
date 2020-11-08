package dataStructures;

public class StringPangram {
	public static boolean checkPangram(String str){
		boolean check[] = new boolean[26];		// By default, all false
		
		int index=0;
		for(int i=0; i<str.length(); i++){
			if('A'<=str.charAt(i) && str.charAt(i)<='Z')
				index = str.charAt(i) - 'A';
			else if('a'<=str.charAt(i) && str.charAt(i)<='z')
				index = str.charAt(i) - 'a';
			else
				continue;
			check[index] = true;
		}
		
		for(int i=0; i<=25; i++){
			if(check[i] == false)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
//		str = str.replaceAll("\\s", "");
		if(checkPangram(str) == true)
			System.out.println("The string is a Pangram");
		else
			System.out.println("The string is not a Pangram");
		
	}

}
