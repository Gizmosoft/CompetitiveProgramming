package src;

//***  INTERVIEW PREPARATION KIT *** ///

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array2D_DS {
	static void addToArrayList(int sum, ArrayList<Integer> al){
		al.add(sum);
	}
	
	void addSums(int[][] arr, ArrayList<Integer> al){
		int sum = 0;
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				for(int k=j; k<j+3; k++){
					sum += arr[i][k] + arr[i+2][k];
				}
				sum += arr[i+1][j+1];
				addToArrayList(sum, al);
				sum=0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Array2D_DS a2d = new Array2D_DS();
		ArrayList<Integer> al = new ArrayList<>();
		//Enter a 6 x 6 Array (int)
		int arr[][] = new int[6][6];
		for(int i=0; i<6; i++){
			for(int j=0; j<6; j++){
				arr[i][j] = sc.nextInt();
			}
		}

		a2d.addSums(arr, al);
		Collections.sort(al);
		System.out.println(al.get(al.size()-1));
	}

}
