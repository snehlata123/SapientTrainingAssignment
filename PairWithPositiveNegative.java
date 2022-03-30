package GFGprac;

import java.util.Arrays;
import java.util.Collections;
import java.util.*;
import java.util.Vector;

public class PairWithPositiveNegative {

	public static void main(String[] args) {
		int[] arr =  {11,-4,4,-3,-9,4,-4,-2,1,2,-4,2};
List l = pairs(arr);
System.out.println(l);
	}
	
	static Vector<Integer> pairs(int [] arr){
		
		Vector v = new Vector();
		Vector<Integer> result = new Vector();
		Map<Integer,Integer> tMap = new TreeMap<>();
		for(int i : arr){
			if(i< 0){
				v.add(i);
			}
			else{
				if(tMap.containsKey(i)){
					int value = tMap.get(i);
					tMap.put(i, value+1);
				}else{
					tMap.put(i, 1);
				}
			}
			
		}
		Collections.sort(v);
		System.out.println("v::"+v);
		System.out.println(tMap);
		
		for(int i=v.size()-1;i>=0;i--){
			int negValue = (int) v.get(i);
			int mapKey = negValue* -1;
			//int mapValue = tMap.get(mapKey);
			if(tMap.containsKey(mapKey)   ){
				int mapValue = tMap.get(mapKey);
				if(mapValue > 0){
				result.add(negValue);
				result.add(mapKey);
				tMap.put(mapKey, mapValue-1);}
			}
			
			
		}
		return result;

	}
}


