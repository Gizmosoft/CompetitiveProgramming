package HackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String name = scan.next();
			int number = scan.nextInt();
			map.put(name, number);
			scan.nextLine();
		}
		while(scan.hasNext())
		{
			String s=scan.nextLine();
			try {
				int temp = map.get(s);
				System.out.println(s + "=" + temp);
			} catch (NullPointerException e) {
				// TODO: handle exception
				System.out.println("Not Found");
			}
		}
	}

}
