package geeksForGeeks_GFG.stacks;

class Stack{
	static final int MAX_SIZE = 1000;	// Max Stack Size
	int top;							// Determines the top element of stack 
	int arr[] = new int[MAX_SIZE];		// Initialize an array of MAX Stack Size
	
	Stack(){
		top = -1;
	}
	
	boolean push(int x){
		if(top >= MAX_SIZE-1){
			System.out.println("Stack Overflow!");
			return false;
		}
		else{
			arr[++top] = x;
			System.out.println(x + " pushed into the stack.");
			return true;
		}
	}
	
	// Method to remove the topmost element
	int pop(){
		if(top < 0){
			System.out.println("Stack Underflow!");
			return 0;
		}
		else{
			int x = arr[top--];
			return x;
		}
	}
	
	boolean isEmpty(){
		return (top < 0);
	}
	
	int peek(){
		if(top < 0){
			System.out.println("Stack Underflow!");
			return 0;
		}
		else{
			int x = arr[top];
			return x;
		}
	}
	
	void printStack(Stack s){
		if(isEmpty()){
			System.out.println("Stack Underflow! - Cannot print.");
		}
		else{
			while(top >=0){
				int x = arr[top--];
				System.out.print(x + " ");
			}
		}
	}
}

public class StacksArrayImpl {

	public static void main(String[] args) {
		Stack s = new Stack();
		System.out.println(s.isEmpty());
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.isEmpty());
		System.out.println(s.pop() + " popped from the stack.");
		System.out.println(s.peek() + " is the topmost element.");
		System.out.println();
		s.printStack(s);
	}

}
