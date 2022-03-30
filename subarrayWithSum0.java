package GFGprac;

import java.util.HashSet;
import java.util.Set;

public class subarrayWithSum0 {
    boolean subArraySumZero(int arr[]){
    	int prefixSum=0;
    	Set s = new HashSet();
    	
    	for(int i=0;i<arr.length;i++){
    		prefixSum +=arr[i];
    		
    		if(prefixSum == 0 || s.contains(prefixSum)) return true;
    		else
    			 s.add(prefixSum);
    		
    	}
    	
    	return false;
    	
    	
    }
	public static void main(String[] args) {
		 int arr[] = { -3, 2, 3, 1, 6 };
		boolean flag =  new subarrayWithSum0().subArraySumZero(arr);
		if(flag){
			System.out.println("exists");
		}
		else{
			System.out.println("doesnt exist");
		}
	}

}
