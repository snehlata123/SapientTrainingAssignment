package GFGprac;

import java.util.*;
public class RelativeSortArray {

	public static void main(String[] args) {
		int A1[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
        int A2[] = { 2, 1, 8, 3 };
        HashMap hmap = new HashMap();
        Vector<Integer> ans =  relSortArray(A1, A2);
        System.out.println(ans);

	}
	
	static Vector<Integer> relSortArray(int [] arr1,int [] arr2){
		
		Map<Integer,Integer> tMap = new TreeMap<Integer, Integer>();
		Vector<Integer>  result = new Vector<Integer>();
		
		for(int key :arr1){
		int count = tMap.getOrDefault(key, 0);
		tMap.put(key, count+1);
			
		}
		for(int temp : arr2){
			if(tMap.containsKey(temp)){
				int count = tMap.get(temp);
				while(count > 0){
					result.add(temp);
					tMap.remove(temp);
					count--;
				}
			}
		}
		
		for(Map.Entry<Integer, Integer> set : tMap.entrySet()){
			int key = set.getKey();
			int count = set.getValue();
			while(count > 0){
				result.add(key);
				count--;
			}
		}
		
		return result;
	}

}
