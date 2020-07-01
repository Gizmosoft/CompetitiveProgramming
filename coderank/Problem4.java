package coderank;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		int arr[][] = new int[n][n];
		ArrayList<Integer> alist = new ArrayList<Integer>();
		ArrayList<Integer> blist = new ArrayList<Integer>();
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				arr[i][j] = in.nextInt();
				if(arr[i][j] == 1){
					alist.add(i);
					blist.add(j);
				}
			}
		}
		for(int k=0; k<alist.size(); k++){
			System.out.print("("+alist.get(k)+","+blist.get(k)+") ");
		}
	}

}
