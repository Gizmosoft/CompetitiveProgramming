package algorithms.sorting;

public class InsertionSort {
	static void insertionSort(int[] arr, int n){
		for(int i=1; i<n; i++){
			int key = arr[i];
			int j = i-1;
			
			while(j >= 0 && arr[j] > key){
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}

	public static void main(String[] args) {
		int[] arr = {66,33,22,11};
		insertionSort(arr, arr.length);
		for(int i : arr)
			System.out.println(i);
	}

}
