package HackerRank;

public class PalindromeNumbers {

	public static void main(String[] args) {
		PalindromeNumbers driver = new PalindromeNumbers();
		driver.pailndromeMethod(1234);
	}
	
	public void pailndromeMethod(int n){
		int r,sum=0,temp;
		temp = n;
		while(n>0){
			r = n%10; //get remainder
			sum = (sum*10)+r;
			n = n/10;
		}
		if(temp == sum){
			System.out.println("Yes, it is a palindrome.");
		}
		else
			System.out.println("No, it is not a palindrome.");
	}

}
