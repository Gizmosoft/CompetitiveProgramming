package geeksForGeeks_GFG.stacks;

class Stack{
	static final int MAX_SIZE = 5;	// Max Stack Size
	int top;							// Determines the top element of stack 
	int arr[] = new int[MAX_SIZE];		// Initialize an array of MAX Stack Size
	
	Stack(){
		top = -1;
	}
	
	boolean push(int x){
		try {
//		if(top >= MAX_SIZE){
//			System.out.println("Stack Overflow!");
//			return false;
//		}
//		else{
			arr[++top] = x;
			System.out.println(x + " pushed into the stack.");
			return true;
//		}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Stack Overflow!");
			//e.printStackTrace();
			return false;
		}
	}
	
	// Method to remove the topmost element
	int pop(){
		if(top < 0){
			System.out.println("Stack Underflow!");
			return 0;
		}
		else{
			try {
				int x = arr[top--];
				return x;
			} catch (ArrayIndexOutOfBoundsException e) {
				int x = arr[--top];
				return x;
			}
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
			try {
				int x = arr[top];
				return x;
			} catch (ArrayIndexOutOfBoundsException e) {
				int tempTop = top-1;
				System.out.println("I can just see this at the top: ");
				return arr[tempTop];
			} 
		}
	}
	
	void printStack(Stack s){
		if(isEmpty()){
			System.out.println("Stack Underflow! - Cannot print.");
		}
		else{
			try {
				while(top >=0){
					int x = arr[top--];
					System.out.print(x + " ");
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				//e.printStackTrace();
				System.out.println("Can't print an Overflowing Stack!");
			}
		}
	}
}

public class StacksArrayImpl {

	public static void main(String[] args) {
		Stack s = new Stack();
		System.out.println(s.isEmpty());	// true
		s.pop();	// Stack Underflow
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(4);
		s.push(5);	// Stack Overflow
		System.out.println(s.isEmpty());	 // false
		System.out.println(s.pop() + " popped from the stack.");
		System.out.println(s.peek() + " is the topmost element.");
		System.out.println();
		s.printStack(s);
	}

}
