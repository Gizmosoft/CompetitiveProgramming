package google.hashCode;

import java.util.Scanner;

public class KickStart_RoundA_Prob1 {
	static int buffer;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();
        int arr[] = new int[100];
        for(int i=0; i<T; i++){
            int N = in.nextInt();
            int B = in.nextInt();
            in.nextLine();
            for(int j=0; j<N; j++){
                arr[j] = in.nextInt();
            }
            
            int val = arr[0];
            for(int k=1; k<N; k++){
                if(val<=B){
                    buffer+=1;
                    val = val+arr[k];
                }
                else{
                    val = val-arr[k-1];
                    val = val+arr[k];
                }
            }
            System.out.println("Case #"+(i+1)+": "+buffer);
            in.close();
        }

	}

}
