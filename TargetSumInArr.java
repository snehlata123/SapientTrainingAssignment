package GFGprac;

import java.util.HashSet;
import java.util.*;

public class TargetSumInArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int A[] = {-2,3,9,5,6,7,5,1}; 
		int sum = 12;
		
		System.out.println(targetSumPair(A,sum));
	}
	
	//o(n) aux space(1) 
	static List<Integer> targetSumPair(int [] arr,int sum){
		
		Set<Integer> s = new HashSet<Integer>();
		List<Integer> res =  new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++){
			int tempS = sum-arr[i];
			if(s.contains(tempS)){
				res.add(tempS);
				res.add(arr[i]);
			}else{
				s.add(arr[i]);
			}
		}
		return res;
	}

}
