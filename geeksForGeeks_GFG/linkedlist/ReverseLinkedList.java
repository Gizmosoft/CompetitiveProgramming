package geeksForGeeks_GFG.linkedlist;

import java.util.Scanner;

public class ReverseLinkedList {
	Node head;
	
	void push(int new_data){
		Node new_node = new Node(new_data);
		
		if(head==null){
			head = new Node(new_data);
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
	
	void reverseList(){
		Node current = head;
		Node prev = null;
		Node next = null;
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	Node reverseListUsingRecursion(Node head){		// not working
		if(head==null)
			return null;
		else if(head.next == null)
			return head;
		else{
			Node nextNode = head.next;
			head.next = null;
			Node rev = reverseListUsingRecursion(nextNode);
			nextNode.next = head;
			return rev;
		}
	}
	
	void printRecursiveList(Node head){
		while(head!=null){
			System.out.print(String.valueOf(head.data) + " ");
			head = head.next;
		}
	}
	public static void main(String[] args) throws Exception{
		ReverseLinkedList rll = new ReverseLinkedList();
		
		
		rll.push(1);
		rll.push(2);
		rll.push(3);
		rll.push(4);
		
		rll.printList();
		
//		rll.reverseList();
//		
//		rll.printList();
		
//		Node rllist = rll.reverseListUsingRecursion(curr);
//		rll.printRecursiveList(head);
	}

}
