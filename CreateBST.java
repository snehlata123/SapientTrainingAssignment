package GFGprac;

public class CreateBST {
	static int getPlatform(float arr[],float [] dept){
		int requiredPlat = 1,res = 1;
		for(int i=0;i<arr.length;i++){
			requiredPlat = 1;
			for(int j =  i+1;j<arr.length;j++){
				if((arr[i] >= arr[j] && arr[i] <= dept[j] || arr[j] >= arr[i] && arr[j] <= dept[i])){
					requiredPlat +=1;
				}
			}
			res =  Math.max(res, requiredPlat);
		}
		
		return res;
	}

	public static void main(String[] args) {
		//1 2 3 4 5 6 7 8 9 10
		
		NodeTC root = new NodeTC(8);
		root.left = new NodeTC(3);
		root.right = new NodeTC(10);
		root.left.left = new NodeTC(1);
		root.left.right = new NodeTC(6);
		
		root.left.right.left = new NodeTC(4);
		root.left.right.right = new NodeTC(7);
		root.right.right = new NodeTC(14);
		root.right.right.left = new NodeTC(13);
	//	System.out.println(checkBST(root));
		//float arr[] = new float[6];
		float arr[] =new float[] {9.00f, 9.40f, 9.50f, 11.00f, 15.00f, 18.00f};
		float	dep[] = new float[] {9.10f, 12.00f, 11.20f, 11.30f, 19.00f, 20.00f}; 
		System.out.println(getPlatform(arr,dep));
	}
	static boolean checkBST(NodeTC root){
		if(root.left != null && root.left.data > root.data && root.right.data < root.data) return false;
		if(!checkBST(root.left) || !checkBST(root.right) ) return false;
		return true;
	}
	
}

	


class NodeTC{
	int data;
	NodeTC left;
	NodeTC right;
	NodeTC(int data ){
		this.data = data;
	}
	
	
}
