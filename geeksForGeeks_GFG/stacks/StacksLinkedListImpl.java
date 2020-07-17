package geeksForGeeks_GFG.stacks;

class Node{
	int data;
	Node next;
	
	Node(int d){
		this.data = d;
		next = null;
	}
}

public class StacksLinkedListImpl {
	Node head;
	
	public boolean isEmpty(){
		if(head==null)
			return true;
		else
			return false;
	}
	
	public void push(int new_data){
		Node new_node = new Node(new_data);
		
		if(head==null){
			head = new Node(new_data);
		}
		else{
			new_node.next = null;
			Node last = head;
			while(last.next != null)
				last = last.next;
			last.next = new_node;
		}
		System.out.println(new_data + " pushed to the stack.");
	}
	
	public int pop(){
		int popped =0;
		if(head==null)
			System.out.println("Stack is Empty!");
		else{
			Node last = head;
			while(last.next != null)
				last = last.next;
			popped = last.data;
			last = null;
		}
		return popped;
	}
	
	public int peek(){
		int topValue = 0;
		if(head==null)
			System.out.println("Stack is Empty!");
		else{
			Node last = head;
			while(last.next != null)
				last = last.next;
			topValue = last.data;
		}
		return topValue;
	}
	
	public static void main(String[] args) {
		StacksLinkedListImpl sll = new StacksLinkedListImpl();
		System.out.println(sll.isEmpty());
		sll.push(1);
		sll.push(2);
		sll.push(3);
		sll.push(4);
		System.out.println(sll.isEmpty());
		System.out.println(sll.pop() + " is popped from the Stack.");
//		sll.push(5);
		System.out.println(sll.peek());
	}

}
