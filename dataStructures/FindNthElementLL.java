package dataStructures;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}
public class FindNthElementLL {
	Node head;
	public int GetNth(int index){
		Node current = head;
		int count = 0;
		while(current!=null){
			if(count == index)
				return current.data;
			count++;
			current = current.next;
		}
		assert(false);
		return 0;
	}
	
	public void printing(){
		Node nd = head;
		while(nd!=null){
			System.out.print(nd.data+" -> ");
			nd = nd.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindNthElementLL llist = new FindNthElementLL();
		Scanner scan = new Scanner(System.in);
		for(int i=5; i>0; --i){
			int d = scan.nextInt();
			llist.push(d);
		}
		llist.printing();
		System.out.print("Enter the index you want to look for: ");
		int n = scan.nextInt();
		System.out.println("Element at index "+n+" is: "+llist.GetNth(n));
	}

	private void push(int new_data) {
		// TODO Auto-generated method stub
		Node new_Node = new Node(new_data);
		new_Node.next = head;
		head = new_Node;
	}

}
