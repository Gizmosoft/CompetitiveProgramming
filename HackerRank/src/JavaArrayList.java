package src;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d,q,x,y;
		ArrayList[] al = new ArrayList[n];
		for(int i=0; i<n; i++){
			d =scan.nextInt();
			al[i] = new ArrayList<Integer>();
			for (int j = 0; j < d; j++) {
				al[i].add(scan.nextInt());
			}
		}
		q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			x = scan.nextInt();
			y = scan.nextInt();
			try {
				System.out.println(al[x-1].get(y-1));
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("ERROR!");
			}
		}

	}

}
