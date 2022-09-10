package geeksForGeeks_GFG.trees;

class Node{
	int data;
	Node left, right;
	
	Node(int d){
		data = d;
		left = right = null;
	}
}
public class BinaryTreeLevelOrderTraversalBFS {
	Node root;
	
	public BinaryTreeLevelOrderTraversalBFS() {
		root = null;
	}
	
	void printLevelOrder() {
		int h = getHeight(root);
		//System.out.println(h);
		int i;
		for(i=1; i<=h; i++) {
			printGivenLevel(root, i);
		}
	}
	
	int getHeight(Node root) {
		if(root == null) {
			return 0;
		}
		else {
			// calculate height of each subtree recursively
			int lheight = getHeight(root.left);
			int rheight = getHeight(root.right);
			
			//System.out.println(lheight);
			//System.out.println(rheight);
			// return the larger height
			// easy approach:
			// return Math.max(lheight, rheight) + 1;
			if(lheight>rheight)
				return lheight+1;
			else
				return rheight+1;
		}
	}
	
	void printGivenLevel(Node root, int level) {
		if(root==null) {
			return;
		}
		if(level == 1) {
			System.out.print(root.data + " ");
		}
		else if(level > 1) {
			printGivenLevel(root.left, level-1);
			printGivenLevel(root.right, level-1);
		}
	}
	
	public static void main(String[] args) {
		BinaryTreeLevelOrderTraversalBFS tree = new BinaryTreeLevelOrderTraversalBFS();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		// Level Order Traversal or BFS must return tree in the order 1-2-3-4-5
		
		tree.printLevelOrder();

	}

}
