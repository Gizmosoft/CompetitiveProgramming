package geeksForGeeks_GFG.stacks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StacksUsingJCF {
	
	public static <T> ArrayList stacktoArrayList(Stack stack) {
		List<T> arrList = new ArrayList<>();
		arrList.addAll(stack);
		return (ArrayList) arrList;
	}
	
	public static Stack arrayToStack(Stack stack) {
		String[] arr = {"a","b","c","d", "e"};
		for(String s: arr)
			stack.push(s);
		return stack;
	}

	@SuppressWarnings("unchecked")
	public static <T> void main(String[] args) {
		Stack<T> stack = new Stack<>();

		System.out.println("Is stack empty? : " + stack.empty());
		
		stack.push((T) "Kartikey");
		stack.push((T) "Pruthe");
		stack.push((T) "Vijay");
		
		System.out.println("Stack is: " + stack);
		
		System.out.println("Top most element: " + stack.peek());
		
		System.out.println("Is stack empty? : " + stack.empty());
		
		stack = arrayToStack(stack);
		
		// Print using Lambda operator
		stack.forEach(s -> {
			System.out.print(s + ", ");
		});
		System.out.println();
		
		ArrayList<T> arrList = stacktoArrayList(stack);
		System.out.println(arrList);
		
		int position = stack.search("Vijay");
		if(position!=-1) {
			System.out.println("Vijay was found in place: " + position);
		}
		else {
			System.out.println("This item is not in the stack");
		}
		
		// Printing using Iterator - allows only forward traversal. LostIterator can be used for forward & backward traversal
		Iterator<T> itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
		System.out.println();
		
	}
}
