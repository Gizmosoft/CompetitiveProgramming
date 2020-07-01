package HackerRank;

public class FibonacciSeriesUsingRecursion {
	public static int a=0,b=1,c;
	public static void main(String[] args) {
		int count = 10;
		System.out.println(a+"\n"+b);
		generateFibonacci(count-2);
	}
	
	public static void generateFibonacci(int count){
		if(count>0){
			c = a+b;
			a = b;
			b = c;
			System.out.println(c);
			generateFibonacci(count-1);
		}
	}

}
