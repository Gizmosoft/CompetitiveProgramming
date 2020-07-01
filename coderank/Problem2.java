package coderank;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.text.DecimalFormat;

public class Problem2 {
	 static double sum;
	    static double calculate(){
	        for(int j=0; j<=100000; j++){
	            sum += 1/(Math.pow(j,  2) + (3*j) + 2);
	            
	        }
//	        System.out.printf("%.4f",sum);
			return sum;
	    }
	    public static void main(String[] args) {
//	    	DecimalFormat f = new DecimalFormat("##.0000");
	        double result = calculate();
	        String str = Double.toString(result);
	        str = str.substring(0, 6);
	        System.out.println(str);
	    }
}
