package ArrayPrg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] 	a =new int [] {1,2,5,6,9};
	int [] 	b = new int[] {3,4,12,13};
						
				//		1,2,3,4,5,6,9,12,13
	System.out.println(mergeArrays(a,b));
	}
private static Set<Integer> mergeArrays(int[] a,int [] b){
	
	int n = a.length;
	int m = b.length;
	Map<Integer,Boolean> hMap = new HashMap<>();
	
	for(int i=0; i < n; i++){
		hMap.put(a[i], true);
	}
	for(int i=0; i < m; i++){
		hMap.put(b[i], true);
	}
	return hMap.keySet();
}
}
