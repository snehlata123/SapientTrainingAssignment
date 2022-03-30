package ArrayPrg;
import java.util.*;
public class Thread2 {

	Node root;
	static class Node{
		int data;
		Node left,right;
	}
	
	static Node newNode(int data){
		Node node = new Node();
		node.data = data;
		node.left = null;
		node.right = null;
		return node;
	}	
	
	public static void main(String[] args) throws InterruptedException {
		Thread2 tree = new Thread2();
		tree.root = newNode(1);
		tree.root.left = newNode(2);
		tree.root.right = newNode(3);
		tree.root.left.left = newNode(4);
		tree.root.left.right = newNode(5);
		System.out.println("inorder");
		tree.inOrder(tree.root);
		System.out.println("");
		
		tree.mirror(tree.root);
		
		System.out.println("inorder mirroed");
	
	tree.inOrder(tree.root);
	}
	private Node mirror(Node root){
		if(root == null) return null;
		Node left = mirror(root.left);
		Node right = mirror(root.right);
		
		root.left= left;
		root.right = right;
		return root;
	}
	private void inOrder(Node root){
		if(root == null) return ;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
}
