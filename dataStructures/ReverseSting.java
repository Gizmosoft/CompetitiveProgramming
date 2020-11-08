package dataStructures;

public class ReverseSting {
	static String reverseStringUsingStringBuffer(String str){
		StringBuffer strBuff = new StringBuffer();
		strBuff.append(str);
		strBuff = strBuff.reverse();
		return strBuff.toString();
	}
	
	static void reverseStringUsingCharArray(String str){
		char[] chArray = str.toCharArray();
		
		for(int i = chArray.length-1; i>=0; i--){
			System.out.print(chArray[i]);
		}
	}
	
	static void reverseStringUsingRecursion(String str){
		if((str==null)||(str.length()<=1))
			System.out.println(str);
		else{
			System.out.print(str.charAt(str.length()-1));
			reverseStringUsingRecursion(str.substring(0, str.length()-1));
		}
	}
	
	public static void main(String[] args) {
		String str = "abcd";
		System.out.println(reverseStringUsingStringBuffer(str));
		reverseStringUsingCharArray(str);
		System.out.println();
		reverseStringUsingRecursion(str);
	}

}
