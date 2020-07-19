package geeksForGeeks_GFG.stacks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StacksDynamicArrayImpl {
	public static void push(int new_data, List<Integer> stackList){
		stackList.add(new_data);
		System.out.println(new_data + " pushed to stack.");
	}
	
	public static void pop(List<Integer> stackList){
		int popped = stackList.get(stackList.size()-1);
		stackList.remove(stackList.size()-1);
		System.out.println(popped + " popped from stack.");
	}
	
	public static void peek(List<Integer> stackList){
		System.out.println(stackList.get(stackList.size()-1) + " is the topmost element.");
	}

	public static void main(String[] args) {
		List<Integer> stackList = new ArrayList<Integer>();
		push(1, stackList);
		push(2, stackList);
		push(3, stackList);
		push(4, stackList);
		pop(stackList);
		pop(stackList);
		peek(stackList);
		push(4, stackList);
		peek(stackList);
		// Print elements of ArrayList using Iterator interface
		Iterator it = stackList.iterator();
		while(it.hasNext())
			System.out.println(it.next());	
		
	}

}
