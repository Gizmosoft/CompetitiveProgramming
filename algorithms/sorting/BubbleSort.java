package algorithms.sorting;

public class BubbleSort {
	void bubbleSort(){
		int[] arr = {36,24,22,12,1};
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			int flag = 0;
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1])
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = 1;
			}
			if(flag==0)
				break;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort();
		
	}

}
