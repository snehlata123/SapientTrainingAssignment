package enc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreePrac {
	
	static class Node{
		Node left;
		int data;
		Node right;
		Node(int data){
			this.data = data;
		}
		
	}

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		System.out.println("inorder");
		inOrder(root);
		System.out.println("preorder");
		preOrder(root);
		System.out.println("postorder");
	//	postOrder(root);
		
		Node root1=new Node(10);
    	root1.left=new Node(20);
    	root1.right=new Node(30);
    	root1.left.left=new Node(40);
    	root1.left.right=new Node(50);
    	root1.right.left=new Node(60);
    	root1.right.right=new Node(70);
    	System.out.println("LEVEL ORDER");
    	levelOrderTraversal(root);
    	//System.out.println();
    	//System.out.println("LEFT VIEW");
    	//leftViewOfTree(root1);
    //	System.out.println();
	}

	
	static void inOrder(Node root){
		if(root != null){
			inOrder(root.left);
			System.out.print(root.data+" ");
			
			inOrder(root.right);
			
		}
		System.out.println();
		
	}
	static void preOrder(Node root){
		if(root != null){
			System.out.print(root.data+" ");
			inOrder(root.left);		
			
			inOrder(root.right);
			
		}
		System.out.println();
		
	}
	static void postOrder(Node root){
		if(root != null){
			
			inOrder(root.left);		
			
			inOrder(root.right);
			System.out.print(root.data+" ");
			
		}
		
	}
	static int heightOfBinaryTree(Node root){
		if(root == null) return 0;
		else
			return Math.max(heightOfBinaryTree(root.left),heightOfBinaryTree( root.right)) +1;
	}
	static void levelOrderTraversal(Node root){
		if(root == null) return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()){
			Node curr =  q.poll();
			System.out.println(curr.data +" ");
			if(curr.left != null) q.add(curr.left);
			if(curr.right != null) q.add(curr.right);
		}
		
	}
	static int sizeOfBinaryTree(Node root){
		if(root == null) return 0;
		else return  1+sizeOfBinaryTree(root.left)+sizeOfBinaryTree(root.right);
	}
	static int getMax(Node root){
		
		if(root == null) return Integer.MIN_VALUE;
		else return Math.max(root.data, Math.max(getMax(root.left), getMax(root.right)));
	}
	static void leftViewOfTree(Node root){
		if(root == null) return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()){
			int count = q.size();
			for(int i=0;i<count;i++)
			{
				Node curr = q.poll();
				if(i==0)
					System.out.print(curr.data+" ");
				if(curr.left!=null)q.add(curr.left);
				if(curr.right!=null)q.add(curr.right);
			} 
		}
	}
	
	static void spiralTraversal(Node root){
		if(root == null) return;
		Queue<Node> q = new LinkedList<Node>();
		Stack<Integer> s = new Stack<Integer>();
		boolean reverse = false;
		q.add(root);
		while(!q.isEmpty()){
			int count = q.size();
			for(int i=0;i<count;i++){
				
				Node curr = q.poll();
				if(reverse)
					s.push(curr.data);
				else
					System.out.println(curr.data+" ");
				if(curr.left!=null)q.add(curr.left);
				if(curr.right != null) q.add(curr.right);
						
				
			}
			if(reverse)
			{
				while(!s.empty()){
					System.out.println(s.pop()+" ");
				}
			}
			
			reverse = !reverse;
			
		}
	}
	
}
