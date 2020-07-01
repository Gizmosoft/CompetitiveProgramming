package dataStructures;

public class LinkedLists {
	Node head;		//head of the list
	
	//class Node - Linked List Node
	//static enables main() to access it
	static class Node{
		int data;
		Node next;
		
		//constructor
		Node(int d){
			data = d;
			next = null;
		}
	}
		
		//insert new node
		@SuppressWarnings("null")
		public static LinkedLists insert(LinkedLists list, int data){
			//create a new node in the LinkedList with data
			Node newNode = new Node(data);
			newNode.next = null;	//setting the newNode next pointer to null
			//if the Linked list is empty(i.e. the head of the Linked List is NULL), then
			//set the newNode as the head of the LinkedList
			if(list.head == null){
				list.head = newNode;
			}
			//if the LinkedList has some elements already then put this newNode at the end of the
			//LinkedList
			else{
				//setting head of the list to a variable last of Node
				Node last = list.head;
				//iterating through the list with assigning all values to last until the next value is NULL
				while(last != null){
					last = last.next;
				}
				//when we reach the end, insert newNode here
				last.next = newNode;
			}
			//return the list with new appended elements
			return list;
		}
		
		public static void printList(LinkedLists list){
			//assign the head of the list to a variable currentNode
			Node currentNode = list.head;
			System.out.print("Linked List : ");
			//Traverse through the LinkedList
			while(currentNode != null){
				//print the data in the currentNode
				System.out.print(currentNode.data + " ");
				//go to next node
				currentNode = currentNode.next;
			}
		}
	
		public static void main(String[] args) {
			LinkedLists list = new LinkedLists(); //object creation
			
			//inserting values
			list = insert(list, 1);
			list = insert(list, 2);
			list = insert(list, 3);
			printList(list);
		}
}
