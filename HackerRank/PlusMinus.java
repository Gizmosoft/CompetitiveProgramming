package HackerRank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {
	public static int posTemp = 0;
	public static int negTemp = 0;
	public static int zeroTemp = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double array[] = new double[n];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]  > 0)
				posTemp += 1;
			if(array[i] < 0)
				negTemp += 1;
			if(array[i] == 0)
				zeroTemp += 1;
		}
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(6);
		
		System.out.println(df.format((double)posTemp/n));
		System.out.println(df.format((double)negTemp/n));
		System.out.println(df.format((double)zeroTemp/n));
		
	}

}
