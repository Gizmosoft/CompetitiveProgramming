package src;

// ***  INTERVIEW PREPARATION KIT *** ///

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class LeftRotationArrays {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = new String[2]; 
        input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int D = Integer.parseInt(input[1]);
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
        	arr[(i+N-D)%N] = sc.nextInt();
		}
//        System.out.println(Arrays.toString(arr));   
        for (int a : arr) {
			System.out.print(a+" ");
		}
	}
}
