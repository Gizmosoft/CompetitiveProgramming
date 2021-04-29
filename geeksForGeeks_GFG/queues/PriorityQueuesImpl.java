package geeksForGeeks_GFG.queues;

import java.util.PriorityQueue;

public class PriorityQueuesImpl {

	public static void main(String[] args) {
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);
		pQueue.add(10);
		pQueue.add(22);
		pQueue.add(5);
		pQueue.add(100);
		pQueue.add(224);
		pQueue.add(105);
		
/*		// get the front most element in the queue
		System.out.println(pQueue.peek());
		// get the front most element & remove it from the queue
		System.out.println(pQueue.poll());
		
		System.out.println(pQueue.peek());
*/		
		for(Integer i : pQueue) {
			System.out.print(i + " ");
		}
		

	}

}
