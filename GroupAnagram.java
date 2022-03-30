package GFGprac;
import java.util.*;

public class GroupAnagram {
	
	static Vector<Vector<String>> gpAnagram(String [] strs){
		Map<String,Vector<String>> hMap = new HashMap<String,Vector<String>>();
		Vector<Vector<String>> result = new Vector<Vector<String>>();
		//List<List<String>> result = new ArrayList<List<String>>();
		
		
		for(String str : strs){
			
			char[] temp = str.toCharArray();
			Arrays.sort(temp);
			String tempStr = new String(temp);
			if(hMap.containsKey(tempStr)){
				hMap.get(tempStr).add(str);
			}else{
				Vector<String> v = new Vector<String>();
				v.add(str);
				hMap.put(tempStr, v);
			}
		
			
		}
		for(Map.Entry<String, Vector<String>> set:hMap.entrySet()){
			result.add(set.getValue());
		}
		
		return result;
		
		
		
		
		
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		String [] strs = {"eat","tea","tan","ate","nat","bat"};
	System.out.println(	gpAnagram(strs));

	}

}
