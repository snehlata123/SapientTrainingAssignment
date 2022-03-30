package GFGprac;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatingElement {
	void firstNonRepeatingElement(int [] arr){
		Map<Integer,Integer> countElement = new HashMap();
		for(int i =0;i<arr.length;i++){
			int temp = arr[i];
			if(!countElement.containsKey(temp)){
				countElement.put(temp, 1);
			}
			else{
				int val = countElement.get(temp);
				countElement.put(temp, val+1);
			}
		}
		for(int i = 0;i<arr.length;i++){
			if(countElement.get(arr[i])==1){
				
				System.out.println(arr[i]);
				break;
			}
		}
		
	}
	

	public static void main(String[] args) {
		int [] arr ={-1,2,-1,3,2};
		NonRepeatingElement nonR= new NonRepeatingElement();
	nonR.firstNonRepeatingElement(arr);
	
		

	}

}
