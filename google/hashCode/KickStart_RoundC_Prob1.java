package google.hashCode;

import java.util.Scanner;

public class KickStart_RoundC_Prob1 {
	
	static int buffer, count;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		in.nextLine();
		for(int i=1; i<=T; i++){
			int N = in.nextInt();
			int K = in.nextInt();
			in.nextLine();
			int[] arr = new int[N];
			for(int j=0; j<N; j++){
				arr[j] = in.nextInt();
			}
			for(int m=0; m<N; m++){
				if(arr[m]==K){
					while(arr[m+1]==(arr[m]-1)){
						buffer+=1;
						m = m+1;
						if(arr[m]==1){
							count+=1;
							break;
						}
					}
				}
			}
			System.out.println("Case #"+i+": "+count);
		}
	}
}
