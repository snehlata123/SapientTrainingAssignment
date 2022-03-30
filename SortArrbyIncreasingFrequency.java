package GFGprac;

import java.util.*;
public class SortArrbyIncreasingFrequency {

	public static void main(String[] args) {
		int[] array = { 4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5 };
		 Map<Integer, Integer> map = new HashMap<>();
	        List<Integer> outputArray = new ArrayList<>();
	        for (int current : array){
	        	int count = map.getOrDefault(current, 0);
	        	map.put(current,count+1);
	        	outputArray.add(current);
	        }
	        SortComparator sort = new SortComparator(map);
	        Collections.sort(outputArray,sort);
	        for (Integer i : outputArray) {
	            System.out.print(i + " ");
	        }
	        

	}

}

class SortComparator implements Comparator<Integer>{
	 private final Map<Integer, Integer> freqMap;
	 SortComparator(Map<Integer, Integer> tFreqMap)
	    {
	        this.freqMap = tFreqMap;
	    }

	@Override
	public int compare(Integer o1, Integer o2) {
		 int freqCompare = freqMap.get(o2).compareTo(freqMap.get(o1));
		 int valueCompare = o1.compareTo(o2);
		 if(freqCompare==0) return valueCompare;
		 else
		return freqCompare;
		 
		//return 0;
	}
	
}
