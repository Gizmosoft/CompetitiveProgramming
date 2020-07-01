package geeksForGeeks_GFG.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RotateArray {
	static String result = "";
	public static void main (String[] args) throws Exception
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	    int test = Integer.parseInt(br.readLine()); 
	    int N, D;
	    
	    while(test-->0){
	        String[] input = new String[2]; 
	        input = br.readLine().split(" ");
	        N = Integer.parseInt(input[0]);
	        D = Integer.parseInt(input[1]); 
	        int[] arr = new int[N];
	        String[] array = new String[N];
	        array = br.readLine().split(" ");
	        for(int j=0; j<N; j++){
	            arr[(j+N-D)%N] = Integer.parseInt(array[j]); 
	        }
	        for(int k=0; k<N; k++){
	            System.out.print(arr[k] + " ");   
	        }
	        System.out.println(result);
	    }
	 }

}
