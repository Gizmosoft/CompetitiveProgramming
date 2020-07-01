package HackerRank;

import java.util.Scanner;

public class CompareTheTriplets {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		int b[] = new int[3];
		for(int i=0; i<3; i++){
			a[i] = sc.nextInt();		
		}
		for(int i=0; i<3; i++){
			b[i] = sc.nextInt();	
		}
		int aSum=0;
		int bSum=0;
		
		for(int i=0; i<3; i++){
			if(a[i] > b[i])
				aSum +=1;
			else if(a[i] < b[i])
				bSum +=1;		
		}
		System.out.printf("%d %d",aSum,bSum);
		
	}

}
