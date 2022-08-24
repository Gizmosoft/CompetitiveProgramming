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
		
		//insert new node at the end
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
				while(last.next != null){
					last = last.next;
				}
				//when we reach the end, insert newNode here
				last.next = newNode;
			}
			//return the list with new appended elements
			return list;
		}
		
		//insert new node at the front
		@SuppressWarnings("null")
		public static LinkedLists insertAtFront(LinkedLists list, int data) {
			Node newNode = new Node(data);
			newNode.next = null;
			
			newNode.next = list.head;
			list.head = newNode;
			
//			if(list.head == null){
//				list.head = newNode;
//			}
//			else {
//				newNode.next = list.head;
//				list.head = newNode;
//			}
			return list;
		}
		
		
		//insert data after a particular mentioned key value
		@SuppressWarnings("null")
		public static LinkedLists insertAtKey(LinkedLists list, int data, int key) {
			//creating the basic structure of the new node
			Node newNode = new Node(data);
			newNode.next = null;
			
			if(list.head == null) {
				System.out.println("The list is empty, no search could be made on an empty list!");
				return list;
			}
			
			Node temp = list.head;
			while(temp != null) {
				if(temp.data == key) {
					newNode.next = temp.next;
					temp.next = newNode;
					break;
				}
				temp = temp.next;
			}
			
			return list;
		}
		
		//merging 2 linked lists
		@SuppressWarnings("null")
		public void merge(LinkedLists list2) {
			Node l1 = this.head;
			Node l2 = list2.head;
			
			while(l1.next != null) {
				l1 = l1.next;
			}
			
			l1.next = l2;
		}
		
		//deleting node at the front
		public static LinkedLists deleteAtFront(LinkedLists list) {
			int x;	
			Node temp = list.head;
			if(temp != null) {
				list.head = temp.next;
				temp.next = null;
				x = temp.data;
				System.out.println(x + " has been deleted from the list!");
			}
			else {
				System.out.println("The list is empty, nothing to delete!");
			}
			return list;
		}
		
		// deleting node from the End
		public static LinkedLists deleteAtEnd(LinkedLists list) {
			Node temp = list.head;
			
			if(temp!=null) {
				while(temp.next.next != null) {
					temp = temp.next;
				}
				Node temp2 = temp.next;
				temp.next = null;
				System.out.println(temp2.data + " has been deleted from the list!");
			}
			else {
				System.out.println("The list is empty, nothing to delete!");
			}
			
			return list;
		}
		
		// deleting node after a specific key - find the key and delete it
		public static LinkedLists deleteAtKey(LinkedLists list, int key) {
			Node temp = list.head;
			
			if(temp!=null) {
				while(temp != null) {
					
					// explicit condition check for 'data found in first node'\
					if(temp.data == key) {
						list.head = temp.next;
						temp.next = null;
						System.out.println(temp.data + " has been deleted from the list!");
						break;
					}
					
					// explicit condition check for 'key not found'
					if(temp.next == null) {
						System.out.println("The key couldn't be found!");
						return list;
					}
					
					if(temp.next.data == key) {
						Node delTemp = temp.next;
						temp.next = delTemp.next;
						delTemp.next = null;
						System.out.println(delTemp.data + " has been deleted from the list!");
						break;
					}
					temp = temp.next;
				}
			}
			else {
				System.out.println("The list is empty, nothing to delete!");
			}
			
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
			System.out.println();
		}
	
		public static void main(String[] args) {
			LinkedLists list = new LinkedLists(); //object creation
			
			//inserting values
			list = insert(list, 1);
			list = insert(list, 2);
			list = insert(list, 3);
			list = insert(list, 4);
			list = insert(list, 5);
//			list = insertAtFront(list, 10);
//			list = insertAtKey(list, 14, 2);
			printList(list);
			
//			LinkedLists list2 = new LinkedLists();
//			
//			list2 = insert(list2, 5);
//			list2 = insert(list2, 6);
//			list2 = insert(list2, 7);
//			list2 = insertAtFront(list2, 11);
//			list2 = insertAtKey(list2, 12, 5);
//			printList(list2);	
//			
//			System.out.println("Merging two lists:\n");
//			list.merge(list2);
//			printList(list);
			
//			list = deleteAtFront(list);
//			list = deleteAtEnd(list);
			list = deleteAtKey(list, 5);
			printList(list);
		}
}
