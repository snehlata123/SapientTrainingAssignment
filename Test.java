package GFGprac;

import java.util.*;

public class Test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int A[] = { 1, 3, 46, 9, 1, 3 };
		 System.out.println(A[6]);
	        int n = 47;
	      // List n1 =  printpairs(A, n);
	      // System.out.println(n1);
	}
	
	 static List printpairs(int[] list, double sum)
	    {
		 List s = new ArrayList<Integer>();
		HashMap<Integer,Integer> hMap = new HashMap<Integer,Integer>();
		for(Integer key : list){
			if(hMap.containsKey(key)){
				int value = hMap.get(key);
				hMap.put(key, value++);
			}else{
				hMap.put(key, 1);
			}
			
		}
		for(Map.Entry<Integer,Integer> set : hMap.entrySet()){
			int key = set.getKey();
			int value = set.getValue();
			int pair = (int)sum-key;
			if(hMap.containsKey(pair)){
				s.add(key);
			}
		}
		return s;
	    }
	
	}
