package algorithms;

import java.util.Scanner;

public class LinearSearchEx {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		int n = myObj.nextInt();
		int item = myObj.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){					//for reading array
            arr[i]=myObj.nextInt();
        }
//		int[] arr = {5,4,3,7,9,1};
//		int item = 9;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==item){
				System.out.println("Item present at " +i+ " index position");
				temp = temp+1;
			}
		}
		if(temp == 0){
			System.out.println("Item not found!");
		}
	}

}
