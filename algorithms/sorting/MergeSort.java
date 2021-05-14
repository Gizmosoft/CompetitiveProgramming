package algorithms.sorting;

public class MergeSort {
	static void merge(int[] arr, int l, int m, int r) {
		// calculate sizes of two separate half arrays
		int n1 = m-l+1;
		int n2 = r-m;
		
		// Create temp arrays
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		// copy data to temp arrays
		for(int i=0; i<n1; ++i)
			L[i] = arr[l+i];
		for(int j=0; j<n2; ++j)
			R[j] = arr[m+1+j];
		
		// *** Merge the two temp arrays *** //
		
		// Initial index of two subarrays
		int i=0, j=0;
		
		// Initial index of merged array
		int k = l;
		
		// Compare elements of both half arrays and organize them in the main array
		while(i<n1 && j<n2) {
			if(L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		// Copy remaining elements of L[], if any
		while(i<n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		
		// Copy remaining elements of R[], if any
		while(j<n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	
	void sort(int[] arr, int l, int r) {
		if(l<r) {
			// calculate middle index
			int m = l + (r-l)/2;
			
			// sort two halves separately
			sort(arr, l, m);
			sort(arr, m+1, r);
			
			// merge the two sorted halves
			merge(arr, l, m, r);
		}
	}
	
	static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = {20, 100, 2, 5, 78, 34, 11, 1};
		MergeSort m = new MergeSort();
		
		System.out.println("Given array is : ");
		printArray(arr);
		
		System.out.println("\n Sorted Array is : ");
		m.sort(arr, 0, arr.length-1);
		printArray(arr);

	}

}
