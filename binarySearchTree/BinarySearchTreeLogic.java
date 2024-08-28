package binarySearchTree;
class Node{
	int data;
	Node left;
	Node right;
	public Node(int data) {
		this.data = data;
	}
}

public class BinarySearchTreeLogic {
	Node root;

	public void insert(int data) {
		root = insertRecursion(root, data);
		
	}
	public Node insertRecursion(Node root,int data) {
		if(root == null) {
			root = new Node(data); 
			
		}
		else if(data <root.data) {
			root.left = insertRecursion(root.left, data);
		}
		else {
			root.right = insertRecursion(root.right, data);
		}
		return root;
	}
	
	public void inorder() {
		inorderRec(root);
	}
	public void inorderRec(Node root) {
		
		if(root != null) {
			inorderRec(root.left);
			System.out.print(root.data+" ");
			inorderRec(root.left);
		}
	}

}
