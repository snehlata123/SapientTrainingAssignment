package GFGprac;

import java.util.*;
import java.util.Map.Entry;

public class KeyPair {
	 public int [] twoSum(int[] nums, int target){
		 Map<Integer, Integer> hMap= new HashMap();
		 for(int i=0;i<nums.length;i++){
			 int key=nums[i];
			 if(hMap.containsKey(key)){
				 int value=(int) hMap.get(key);
				 hMap.put(key, value+1);
			 }else{
				 hMap.put(key, 1);
			 }
		 }
		 int arr[] = new int[2];
		 int k=0;
		 for (Map.Entry<Integer, Integer> set : hMap.entrySet()){
//			 System.out.println(set.getKey()+" "+set.getValue());
//		 }
//		Iterator<Entry<Integer,Integer>> it = hMap.entrySet().iterator();
//		 while(it.hasNext()){
//			 Map.Entry<Integer, Integer> set = (Map.Entry<Integer, Integer>)it.next();
		
		int key =  set.getKey();
		int value = set.getValue();
		int pair = target-key;
		if(hMap.containsKey(pair)){
			if(key != pair){
				arr[k++]=pair;
			}
			else{
				if(value > 1){
					arr[0]=pair;
					arr[1]=pair;
				}
			}
		}
		 }
		 return arr;
	 }
	public static void main(String[] args) {
		int [] nums= {2,5,5,11};
		KeyPair obj = new KeyPair();
		int [] arr = obj.twoSum(nums, 10);
		for(int i :arr)
			System.out.println(i);

	}

}
