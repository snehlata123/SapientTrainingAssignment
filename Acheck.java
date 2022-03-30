package GFGprac;

import java.io.IOError;
import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.*;

public class Acheck {
	
	
	public static void main(String ... arrrrgs) {
		int num[] = {3,2,3};
		int a = 0;
		for(int i=0;i<num.length;i++){
			System.out.println("a"+ a+" nums[i]" +num[i]);
			a = a^num[i];
			
		}

System.out.println(a);
		
	}
	
	static List<Integer> productSort(List<Integer> numbers){
		 Map<Integer, Integer> map = new HashMap<>();
		for(Integer key:numbers){
			int count = map.getOrDefault(key, 0);
			map.put(key, count+1);
			
		}
		SortComparator1 comp = new SortComparator1(map);
		
		TreeMap<Integer,Integer> sortedMap = new TreeMap<Integer,Integer>(comp);
		ArrayList<Integer> result = new ArrayList<>();
		sortedMap.putAll(map);
		 for(Integer i : sortedMap.keySet()) {
	            int frequencey = sortedMap.get(i);
	            for(int count  = 1 ; count <= frequencey ; count++) {
	            	result.add(i);
	            }
		 }
		 return result;
		
	}
	}

class SortComparator1 implements Comparator<Integer>{
	Map<Integer,Integer> freqMap;
	SortComparator1(Map<Integer,Integer> freqMap){
		this.freqMap = freqMap;
	}
	public int compare(Integer k1,Integer k2){
		 Integer val1 = freqMap.get(k1);
         Integer val2 = freqMap.get(k2);

         int num = val2.compareTo(val1)  ;
         // if frequencies are same then compare number itself
        return  num == 0 ? k1.compareTo(k2)   : num;
       //  return  num == 0 ? k2.compareTo(k1)   : num;
	}
	
}