package GFGprac;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElementIndex {
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
			if(countElement.get(arr[i])>1){
				
				System.out.println(arr[i] +" index:"+i);
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		int [] arr ={1,5,3,4,3,5,6};
		FirstRepeatingElementIndex nonR= new FirstRepeatingElementIndex();
	nonR.firstNonRepeatingElement(arr);

	}

}
