package google.hashCode;

import java.util.Scanner;

public class KickStart_Round_C_Prob3 {
	
	static boolean checkPerfectSquare(int sum){
		double temp = Math.sqrt(sum);
		
		return ((temp-Math.floor(temp))==0);
	}
	
	static int sumOfSubarray(int[] array){
		int perfectsubarrays = 0;
		for(int m=0; m<array.length; m++){
			System.out.println(array[m]);
		}
		for(int i=0; i<array.length; i++){
			for(int j=i; j<array.length; j++){
				int sum = 0;     
                for (int k = i; k <= j; k++) {
                    sum = sum+array[k];
                    System.out.println(sum);
                }
//                if(checkPerfectSquare(sum)){
//                	perfectsubarrays++;
//        		}
			}
		}
		return perfectsubarrays;
	}
	static int solve(int[] array){
		int result = sumOfSubarray(array);
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for(int i=1; i<=test; i++){
			int n = scan.nextInt();
			int[] array = new int[n];
			for(int j=0; j<n; j++){
				array[j] = scan.nextInt();
			}
			System.out.println("Case #"+i+": "+solve(array));
		}
		scan.close();
	}

}
