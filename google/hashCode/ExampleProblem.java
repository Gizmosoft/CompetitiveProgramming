package google.hashCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExampleProblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int points = scan.nextInt();
		int types = scan.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<types; i++){
			map.put(i, scan.nextInt());
		}
//		System.out.println(Arrays.asList(map));
		
	}

}
