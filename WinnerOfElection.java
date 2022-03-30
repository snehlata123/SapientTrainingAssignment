package GFGprac;

import java.util.*;

public class WinnerOfElection {

	public static void main(String[] args) {
		List l = new ArrayList<String>();
		l.add("john");
		l.add("john");
		l.add("john");
		l.add("john");
		l.add("johnny");
		l.add("johnny");
		l.add("johnny");
		l.add("johnny");
		l.add("jackie");
		l.add("jackie");
		l.add("jamie");
		l.add("jamie");
		l.add("jamie");
		WinnerOfElection w = new WinnerOfElection();
		System.out.println(w.winner(l, 13));
		
		

	}
	
	String winner(List<String> votes,int n){
		Map<String,Integer> hMap = new HashMap<String,Integer>();
		
		for(String key : votes)
		{
			if(hMap.containsKey(key)){
				int value = hMap.get(key);
				hMap.put(key, value+1);
				
			}else{
				hMap.put(key, 1);
			}
		}
		
		int max_value = 0;
		String nameC  = "";
		
		for(Map.Entry<String, Integer> set : hMap.entrySet()){
			String name = set.getKey();
			int value = set.getValue();
			
			if(max_value<value){
				max_value = value;
				nameC = name;
			}
			else if(max_value == value){
				if(name.compareTo(nameC) < 0)
				{ nameC = name;}
			}
		}
		return nameC;
	} 

}
