package HackerRank;

public class FibonacciSeriesWithoutRecursion {

	public static void main(String[] args) {
		generateFibonacci(10);
	}
	
	public static void generateFibonacci(int count){
		int a = 0,b = 1,c;
		System.out.println(a+"\n"+b);
		for(int i=2;i<count;i++){
			c = a+b; //put value of a+b in c
			a = b;	 //put value of b in a
			b = c;  //put value of c in b
			System.out.println(c);
		}
	}
}
