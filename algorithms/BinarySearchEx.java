package algorithms;

public class BinarySearchEx {
	
	public int binSearch(int arr[], int l, int r, int key){
		if(r >= l){
			int mid = l+(r-l)/2;
			if(arr[mid]==key)
				return mid;
			
			if(arr[mid]>key)
				return binSearch(arr, l, mid-1, key);

			return binSearch(arr, mid+1, r, key);
		}
		return -1;		
	}

	public static void main(String[] args) {
		BinarySearchEx bs = new BinarySearchEx();
		int arr[] = {0,1,2,5,6,14,18};			//Sorted array of integers
		int key = 2;
		int n = arr.length;
		int result = bs.binSearch(arr, 0, n-1, key);
		if(result == -1)
			System.out.println("Number not found!");
		else
			System.out.println("Number found at index "+ result);
	}

}
