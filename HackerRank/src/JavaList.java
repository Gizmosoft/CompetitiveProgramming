package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Integer> l1 = new ArrayList();
		for (int i = 0; i < n; i++) {
			l1.add(scan.nextInt());
		}
		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			String query = scan.next();
			if(query.equals("Insert")){
				int x = scan.nextInt();
				int y = scan.nextInt();
				l1.add(x, y);
			}
			else{	//Delete
				int x = scan.nextInt();
				l1.remove(x);
			}
		}
		scan.close();
		
		for(Integer num : l1)
			System.out.print(num + " ");
		//l1.forEach(System.out::print);
		//System.out.println(l1);
	}
}
