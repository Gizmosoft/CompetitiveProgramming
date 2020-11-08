package algorithms.sorting;

public class SelectionSort {
	static void selectionSort(int[] arr, int n){
		for(int i=0; i<n-1; i++){
			int index=i;
			for(int j=i+1; j<n; j++)
				if(arr[j]<arr[i])
					index = j;
			
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = {4,2,3,1};
		selectionSort(arr, arr.length);
		for(int i : arr)
			System.out.println(i);
	}

}
