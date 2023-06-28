package geeksForGeeks_GFG.trees;

import java.util.*;

public class GenericTreeCommonProperties {
	private static class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	public static Node constructTree(int[] arr) {
		Node root = null;
		Stack<Node> stack = new Stack<>();
		for (int elem : arr) {
			if (elem == -1) {
				stack.pop();
			} else {
				Node temp = new Node();
				temp.data = elem;

				if (stack.size() > 0) {
					stack.peek().children.add(temp);
				} else {
					root = temp;
				}
				stack.push(temp);
			}
		}
		return root;
	}

	public static void display(Node node) {
		String str = node.data + " -> ";
		for (Node child : node.children) {
			str += child.data + ", ";
		}
		str += " ."; // shows this is the end of the branches here - no more children
		System.out.println(str);

		for (Node child : node.children) {
			display(child);
		}
	}

	public static int getSize(Node node) {
		int size = 0;
		for (Node child : node.children) {
			int childCount = getSize(child);
			size = size + childCount;
		}
		size = size + 1;

		return size;

	}

	public static int getMax(Node node) {
		// write your code here
		int max = Integer.MIN_VALUE;
		
		for(Node child : node.children) {
			// METHOD 1
//			if(child.data > max) {
//				max = child.data;
//			}
//			int childMax = getMax(child);
//			if(childMax > max)
//				max = childMax;
			
			// METHOD 2
			int childMax = getMax(child);
			max = Math.max(childMax, max);
		}
		max = Math.max(node.data, max);
		
		return max;
	}
	
	public static int getHeight(Node node) {
		// this is through DFS
		int height = -1;
		
		for(Node child : node.children) {
			int childHeight = getHeight(child);
			height = Math.max(childHeight, height);
		}
		height += 1;
		return height;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, -1, 30, 50, -1, 60, -1, -1, 40, 70, 190, -1, 100, -1, -1, 80, -1, -1, -1 };

		Node root = constructTree(arr);
		display(root);
		System.out.println("Size of the tree: " + getSize(root));
		System.out.println("Max of the tree: " + getMax(root));
		System.out.println("Height of the tree: " + getHeight(root));
	}

}
