package geeksForGeeks_GFG.trees;

public class BinaryTreeInorderTraversal_DFS {
	static Node root;
	
	void printInorder(Node root) {
		if(root == null)
			return;
		
		printInorder(root.left);
		
		System.out.print(root.data + " ");
		
		printInorder(root.right);
	}
	
	void printPreorder(Node root) {
		if(root == null)	return;
		
		System.out.print(root.data + " ");
		printPreorder(root.left);
		printPreorder(root.right);
	}
	
	void printPostorder(Node root) {
		if(root == null)	return;
		printPostorder(root.left);
		printPostorder(root.right);
		System.out.print(root.data + " ");
		
	}
	
	// Method overloading can be used to use root directly in the parameter place or else root declaration has to be static
//	void printInorder() {
//		printInorder(root);
//	}

	public static void main(String[] args) {
		BinaryTreeInorderTraversal_DFS tree = new BinaryTreeInorderTraversal_DFS();
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		tree.printInorder(root);
		System.out.println();
		tree.printPreorder(root);
		System.out.println();
		tree.printPostorder(root);

	}

}
