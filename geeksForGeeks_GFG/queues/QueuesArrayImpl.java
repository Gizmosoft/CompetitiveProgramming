package geeksForGeeks_GFG.queues;


class Queue{
	private static int front, rear, MAX_SIZE;
    private static int queue[];
  
    Queue(int s)
    {
        front = rear = 0;
        MAX_SIZE = s;
        queue = new int[MAX_SIZE];
    }
	
	
	static void enqueue(int x) {
		// Check if queue is full or not
		if(MAX_SIZE == rear) {
			System.out.println("The Queue is Full!!!");
			return;
		}
		else {
			queue[rear] = x;
			System.out.println(x + " has been added to queue.");
			rear++;
		}
		return;
	}
	
	void dequeue() {
		// Check for an Empty Queue
		if(front == rear) {
			System.out.println("Queue is Empty!!!");
		}
		else {
			// Shifting each element of the queue, one step ahead
			for(int i=0; i<rear-1; i++) {
				queue[i] = queue[i+1];
			}
			
			// appending zeroes at the vacant spots
			if(rear < MAX_SIZE) {
				queue[rear] = 0;
			}
			
			// decrement rear
			rear--;
		}
		return;	
	}
	
	int getRear() {
		return queue[rear];	
	}
	
	int getFront() {
		return queue[front];
	}
	
	void printQueue() {
		System.out.println("Showing the queue...");
		for(int i=0; i<=rear-1; i++) {
			System.out.print(queue[i] + " ");
		}
		System.out.println();
	}
}

public class QueuesArrayImpl {

	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.printQueue();
		q.dequeue();
		q.printQueue();
		
		System.out.println("\n" + q.getFront() + "\t" + q.getRear());
		
	}

}
