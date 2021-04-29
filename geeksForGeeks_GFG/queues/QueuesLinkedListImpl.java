package geeksForGeeks_GFG.queues;

class Node{
	int data;
	Node next;
	
	Node(int d){
		data = d;
		next = null;
	}
}

class QueueImplementor{
	Node head, rear;
	
	public QueueImplementor(){
		this.head = this.rear = null;
	}
	
	void enqueue(int d) {		// Same as append method used in LinkedList implementation
		Node newNode = new Node(d);
		
		if(head == null) {
			head = newNode;
			rear = newNode;
			System.out.println(newNode.data + " has formed the queue!");
			return;
		}
		newNode.next = null;
		
		// Traverse till the end of existing List and append the new node
		Node last = head;
		while(last.next!=null) {
			last = last.next;
		}
		last.next = newNode;
		rear = newNode;
		System.out.println(newNode.data + " has joined the queue!");
		return;
	}
	
	void dequeue() {
		// if queue is empty
		if(head==null) {
			System.out.println("Queue is Empty!!!");
			return;
		}
		Node throwNode = head;
		head = throwNode.next;
		throwNode.next = null;
		System.out.println(throwNode.data + " is leaving the queue!");
		return;
	}
	
	void printQueue() {
		if(head==null) {
			System.out.println("Nothing to Print here!!!");
			return;
		}
		Node n = head;
		while(n!=null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println();
		return;
	}
	
	Node getHead() {
		return head;
	}
	
	Node getRear() {
		return rear;
	}
}

public class QueuesLinkedListImpl {

	public static void main(String[] args) {
		QueueImplementor q = new QueueImplementor();
		System.out.println(q.getHead() + " is leading the queue!");
		System.out.println(q.getRear() + " is last in the queue!");
		
		q.printQueue();
		q.dequeue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.printQueue();
		
		System.out.println(q.getHead().data + " is leading the queue!");
		System.out.println(q.getRear().data + " is last in the queue!");
		
		q.dequeue();
		q.dequeue();
		q.printQueue();

	}

}
