package HackerRank;

public class SwapTwoNumbersWithoutTemp {

	public static void main(String[] args) {
		SwapTwoNumbersWithoutTemp call = new SwapTwoNumbersWithoutTemp();
//		call.usingAdditionAndSubtraction(15, 10);
		System.out.println(usingAdditionAndSubtraction(15, 10)); //Another way of calling a static method
		call.usingMultiplicationAndDivision(15, 10);
		call.usingBitwiseXOR(15, 10);
	}
	
	public static String usingAdditionAndSubtraction(int x, int y){
		x = x+y;
		y = x-y; //get y
		x = x-y; //get x
//		System.out.println("Using Addition And Subtraction\nAfter swapping: "+"x = "+x+", y = "+y+"\n");
		return x +", "+ y;
	}
	
	private void usingMultiplicationAndDivision(int x, int y){
		x = x*y;
		y = x/y; //get y
		x = x/y; //get x
		System.out.println("Using Multiplication And Division\nAfter Swapping: "+"x = "+x+", y = "+y+"\n");
	}
	
	private void usingBitwiseXOR(int x, int y){
		x = x^y;
		y = x^y; //get y
		x = x^y; //get x
		System.out.println("Using Bitwise XOR\nAfter Swapping: "+"x = "+x+", y = "+y+"\n");
		
	}
}
