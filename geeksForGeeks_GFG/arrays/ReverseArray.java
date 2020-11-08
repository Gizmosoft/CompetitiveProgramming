package geeksForGeeks_GFG.arrays;

public class ReverseArray {
	static void reverse(int[] arr, int n){
		int[] b = new int[n];
		int j = n;
		for(int i=0; i<n; i++){
			b[j-1] = arr[i];
			j = j-1;
		}
		
		for(int k=0; k<n; k++){
			System.out.print(b[k]+ " ");
		}
	}
	
	static void reverseUsingRecursion(int[] arr, int start, int end){
		int temp;
		if(start>=end)
			return;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reverseUsingRecursion(arr, start+1, end-1);
	}
	
	static void printArray(int arr[], int size) 
    { 
        for (int i=0; i < size; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(""); 
    } 
	
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
//		reverse(arr, arr.length);
		reverseUsingRecursion(arr, 0, arr.length-1);
		printArray(arr, arr.length);
	}

}
