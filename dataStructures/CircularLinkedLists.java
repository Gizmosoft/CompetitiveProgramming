package dataStructures;

public class CircularLinkedLists {
	Node head;
	Node tail;
	
	public CircularLinkedLists insertNode(CircularLinkedLists cll, int data) {
		Node newNode = new Node(data);
		
		if(cll.head == null) {
			cll.head = newNode;
		}
		else {
			cll.tail.next = newNode;
		}
		tail = newNode;
		tail.next = head;
		
		return cll;
	}
	
	public void printCircularLinkedLists(CircularLinkedLists cll) {
		Node key = cll.head;
		while(key.next!=head) {
			System.out.println(key.data);
			key = key.next;	
		}
		System.out.println(key.data);
	}

	public static void main(String[] args) {
		CircularLinkedLists cll = new CircularLinkedLists();
		
		cll.insertNode(cll, 1);
		cll.insertNode(cll, 2);
		cll.insertNode(cll, 3);
		cll.insertNode(cll, 4);
		cll.insertNode(cll, 5);
		
		cll.printCircularLinkedLists(cll);

	}

}
