package geeksForGeeks_GFG.linkedlist;

import java.util.*;

class Node{
	int data;
	Node next;
	
	Node(int d){
		data = d;
		next = null;
	}
}

public class CountNodesOfLinkedList {
	Node head;
	
	void push(int new_data){
		Node new_node = new Node(new_data); // Node created with value
		
		new_node.next = head; // make next of new node as head
		head = new_node;      // Move head to point to the new node
	}
	
	void append(int new_data){
		Node new_node = new Node(new_data);
		
		if(head==null){
			head = new_node;
			//head = new Node(new_data);
			return;
		}
		
		new_node.next = null;
		//Traverse till the last node
		Node last = head;
		while(last.next != null){
			last = last.next;
		}
		// change the last.next of currently last node to new_node
		last.next = new_node;
		return;
	}
	
	void printList(){
		Node n = head;
		while(n.next != null){
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.print(n.data + " ");
		System.out.println();
	}
	
	int getCount(){
		Node n = head;
		int count = 0;
		while(n.next != null){
			count++;
			n = n.next;
		}
		return count+1;
	}
	
	public static void main(String[] args) {
		CountNodesOfLinkedList ll = new CountNodesOfLinkedList();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0; i<n; i++){
			ll.append(sc.nextInt());
		}
		ll.printList();
		// data input complete
		System.out.println(ll.getCount());
	}

}
