package coderank;
import java.io.*;
import java.util.*;

public class Problem1 {
	static ArrayList<Double> solve(double[] temps){
        int x = temps.length;
        ArrayList<Double> quar = new ArrayList<Double>();
        for(int i=0; i<x; i++){
            if(temps[i]>=100.4){
                quar.add(temps[i]);
            }
        }
        return quar;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();
        double[] temps = new double[num];
        for(int i=0; i<num; i++){
            temps[i] = in.nextDouble();
        }
        ArrayList<Double> res = solve(temps);
        for(int j=0; j<res.size(); j++)
        	System.out.print(res.get(j) + " ");
        System.out.println();
        System.out.println(res.size());
    }

}
