package HackerRank;

import java.util.Scanner;

public class VeryBigNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long array[] = new long[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextLong();
		}
		long temp = 0;
		long sum = 0;
		
		for (int i = 0; i < n; i++) {
			//algorithm
			temp = array[i] + temp;
			sum = temp;
		}
		System.out.printf("%d",sum);
		
	}

}
