package HackerRank;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[][] = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
		int temp1 = 0;
		int leftDiagSum = 0;
		//algorithm
		for (int i = 0; i < n; i++) {
			temp1 = array[i][i] + temp1;
			leftDiagSum = temp1;
		}
		
		int temp2 = 0;
		int rightDiagSum = 0;
		
		for (int i = 0; i < n; i++) {
			temp2 = array[i][n-1-i] + temp2;
			rightDiagSum = temp2;
		}
		int result = 0;
		if(leftDiagSum > rightDiagSum)
			result = leftDiagSum-rightDiagSum;
		else
			result = rightDiagSum-leftDiagSum;
		
		System.out.printf("%d",result);
	}

}
