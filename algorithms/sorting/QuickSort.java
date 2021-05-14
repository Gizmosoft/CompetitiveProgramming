package algorithms.sorting;

public class QuickSort {
	
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		
		for(int j=low; j<=high; j++) {
			if(arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, high);
		return (i+1);
	}
	
	static void quicksort(int[] arr, int low, int high) {
		if(low < high) {
			//calculate the partition index - pi
			int pi = partition(arr, low, high);
			
			quicksort(arr, low, pi-1);
			quicksort(arr, pi+1, high);
		}
	}

	static void printArray(int[] arr, int size) {
		for(Integer i : arr) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = { 10, 7, 8, 9, 1, 5 };
	    int n = arr.length;
	    
	    quicksort(arr, 0, n-1);
	    System.out.println("The sorted arrray:");
	    printArray(arr, n);

	}

}
