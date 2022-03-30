package GFGprac;
/*
 * Tree
 */
public class TreeInorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  root ,left , right
		TreeInorer treeOrder = new TreeInorer();
		TreeNode root = null ;
		treeOrder.inorder(root);

	}
	//Traverse tree In-Order:Root Left subtree Right subtree
	private void inorder(final TreeNode root){
	
		if(root == null)
			return;
		if(root != null) System.out.println(root.data);
		if(root.left != null)
			inorder(root.left);
		
		if(root.right != null)
			inorder(root.right);
		
		
		}

	class TreeNode{
		private	int data;
		private	TreeNode left;
		private	TreeNode right;
		TreeNode(int data){
		this.data = data;
	}
	}
	}