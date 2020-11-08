package algorithms.sorting;

public class RecursiveBubbleSort {
	static void bubbleSortRecursion(int[] arr, int n){
		if(n==1)
			return;
		for(int i=0; i<n-1; i++){
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			bubbleSortRecursion(arr, n-1);
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = {36,24,22,12,1};
		bubbleSortRecursion(arr, arr.length);
		for(int j=0; j<arr.length; j++){
			System.out.println(arr[j]);
		}
	}

}
