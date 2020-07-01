package coderank;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int total = 0;
		int q = in.nextInt();
		in.nextLine();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int j=0; j<q; j++){
		    int temp = in.nextInt();
		    arr.add(temp);
		}

		for(int i=0; i<arr.size()-1; i++){
			if(arr.get(i) == arr.get(i+1)){
				arr.remove(i+1);
				total = total + 1;
				i--;
			}
		}
		System.out.println(total);

	}

}
