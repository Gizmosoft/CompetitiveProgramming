package geeksForGeeks_GFG.queues;

import java.util.Stack;

public class QueueUsingStack {
	static Stack<Integer> s1 = new Stack<Integer>();
	static Stack<Integer> s2 = new Stack<Integer>();
	
	static void enQueue(int x) {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
;		}
		s1.push(x);
		
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		System.out.println(x + " was added to the Queue.");
	}
	
	static int deQueue() {
		if(s1.isEmpty()) {
			System.out.println("The Queue is Empty!!!");
			return 404;
		}
		
		int x = s1.peek();
		s1.pop();
		return x;
	}
	
	static void printQueue() {
		if(s1.isEmpty()) {
			System.out.println("Nothing to Print here!!!!");
			return;
		}
		for(int s : s1) {
			System.out.print(s + " ");
		}
	}
	
	public static void main(String[] args) {
		printQueue();
		deQueue();
		enQueue(1);
		enQueue(2);
		enQueue(3);
		enQueue(4);
		printQueue();
		System.out.println();
		System.out.println(deQueue() + " left the queue!");
		System.out.println();
		printQueue();
		

	}

}
