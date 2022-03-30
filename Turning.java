import java.util.*;
public class Turning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 int[] ex1 = new int[] {5,7,3,9,4,9,8,3,1};
//	        System.out.println("Example 1 answer = " + Turning.largestUniqueNumber(ex1) + ", expected = 8");
//	        
//	        int[] ex2 = new int[] {9,9,8,8};
//	        System.out.println("Example 2 answer = " + Turning.largestUniqueNumber(ex2) + ", expected = -1");
	        
	        
	        int[][] ex1 = new int[][] {{1,3,1},{1,5,1},{4,2,1}};
	        System.out.println("Example 1 answer = " + Turning.minPathSum(ex1) + ", expected = 7");
	        
	        int[][] ex2 = new int[][] {{1,2,3},{4,5,6}};
	        System.out.println("Example 2 answer = " + Turning.minPathSum(ex2) + ", expected = 12");
	}
	
	//O(n)
	
	  public static int largestUniqueNumber(int[] nums) {
	        int ans = -1;
	        //write your solution here
	        
	        Map<Integer,Integer> map = new HashMap<>();
	        for(int num:nums){
	            map.put(num,map.getOrDefault(num, 0)+1);
	        }
	        
	        for(Integer key:map.keySet()){
	        	if(map.get(key) == 1){
	        		ans = Math.max(key, ans);
	        	}
	        }
	        
	        return ans;
	    }
	

public static int minPathSum(int[][] grid) {
    int ans = -1;
    //write your solution here
    int height = grid.length;
    int width = grid[0].length;
    
    return min(grid,height-1,width-1);
    
    //return ans;        
}

static int min(int [][] grid,int row,int col){
	if(row==0 && col==0) return grid[row][col];
	if(row==0) return grid[row][col] + min(grid,row,col-1);
	if(col==0) return grid[row][col]+min(grid,row-1,col);
	return grid[row][col]+Math.min(min(grid,row-1  ,col  ), min(grid,row,col-1));
}
}

