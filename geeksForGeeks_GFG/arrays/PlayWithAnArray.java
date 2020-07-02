package geeksForGeeks_GFG.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PlayWithAnArray {
	static int formatArray(int[] arr, int n){
		for(int i=1; i<arr.length; i++){
			if(i%2==0){
				i++;
				continue;
			}
			if(arr[i]<arr[i-1]){
				int temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;
			}
			else if(arr[i]==arr[i-1]){
				return 0;
			}
		}
		return 1;
	}
	
	static int[] returnArray(int[] arr, int n){
		for(int i=1; i<arr.length; i++){
			if(i%2==0){
				i++;
				continue;
			}
			if(arr[i]<arr[i-1]){
				int temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;
			}
		}
		int[] newarr = Arrays.copyOfRange(arr, 0, n);
		return newarr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int[] arr = new int[100];
		while(test-->0){
			int n = sc.nextInt();
			for(int i=0; i<n; i++){
				arr[i] = sc.nextInt();
			}
			System.out.println(formatArray(arr, n));
			System.out.println(Arrays.toString(returnArray(arr, n)));
		}
	}

}
