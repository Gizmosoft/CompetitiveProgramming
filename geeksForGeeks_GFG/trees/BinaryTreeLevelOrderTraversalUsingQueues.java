package geeksForGeeks_GFG.trees;

import java.util.LinkedList;
import java.util.Queue;

// class - Node, already existed in this package
//class Node{
//	int data;
//	Node left, right;
//	
//	public Node(int d) {
//		data =d;
//		right = left = null;
//	}
//}

public class BinaryTreeLevelOrderTraversalUsingQueues {
	Node root;
	
	void printLevelOrder() {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()) {
			// remove head element
			Node tempNode = q.poll();
			System.out.print(tempNode.data + " ");
			
			// enqueue left child
			if(tempNode.left != null) {
				q.add(tempNode.left);
			}
			
			// enqueue right child
			if(tempNode.right != null) {
				q.add(tempNode.right);
			}
		}
	}

	public static void main(String[] args) {
		BinaryTreeLevelOrderTraversalUsingQueues queue = new BinaryTreeLevelOrderTraversalUsingQueues();
		queue.root = new Node(1);
		queue.root.left = new Node(2);
		queue.root.right = new Node(3);
		queue.root.left.left = new Node(4);
		queue.root.left.right = new Node(5);
		
		queue.printLevelOrder();
	}

}
