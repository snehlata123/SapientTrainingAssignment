package GFGprac;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountDomain {
	
	
	
	 public static int howMany(String sentence) {
		    // Write your code here
		Pattern p = Pattern.compile("[^a-zA-Z]+");

		String [] str = sentence.split(" ");


		int count =0;
		for(String temp : str){
			//System.out.println(temp);
			if(temp.matches("^[a-zA-Z,.?-]*$") && !temp.matches("^[0-9]*$")) 
			{
				
				count++;
				System.out.print(temp+" "+count+" ");
				//System.out.println(count);
			
			}
//		    Matcher m = p.matcher(temp);
//		    if(m.matches()) count++;
		}
		//System.out.println(count);
		return count;
		    }

		
	

	public static void main(String[] args) {
		String[] counts = {
		        "900,google.com",
		        "60,mail.yahoo.com",
		        "10,mobile.sports.yahoo.com",
		        "40,sports.yahoo.com",
		        "300,yahoo.com",
		        "10,stackoverflow.com",
		        "20,overflow.com",
		        "5,com.com",
		        "2,en.wikipedia.org",
		        "1,m.wikipedia.org",
		        "1,mobile.sports",
		        "1,google.co.uk"
		       
		        
		    };
		
		String s = "jds dsaf lkdf kdsa fkldsf, adsbf ldka ads? asd bfdal ds bf[l. akf dhj ds 878  dwa WE DE 7475 dsfh ds  RAMU 748 dj.";
		howMany(s);
		
		
//		 Map<String, Integer> countMap = _printClickCountByDomain(counts);
//		 System.out.println(countMap);
//		 
//		 for(Map.Entry<String, Integer> nextChecker: countMap.entrySet()){
//			 System.out.println(nextChecker.getValue()    +" "+nextChecker.getKey() );
//		 }

	}
	
	static Map<String, Integer> _printClickCountByDomain(String [] counts){
		Map<String, Integer> res = new HashMap<>(); 
		
		for(String word : counts){
				String[] eachWordSplittedArr = 	word.split(",");  
				String key = eachWordSplittedArr[1];
				int value = Integer.parseInt(eachWordSplittedArr[0]);
				
				if(res.containsKey(key)){
					
					res.put(key, res.get(key) + value);
					
					
				}else{
					res.put(key, value);
				}
		
		}
		
//		Map<String, Integer> result = new HashMap<>(); 
//		
//		for(Map.Entry<String, Integer> nextChecker: res.entrySet()){
//		String domain = 	nextChecker.getKey();  //google.com
//		int count = nextChecker.getValue(); //900
//		
//		String[] eachWordSplittedArr = 	domain.split("."); 
//			if(result.containsKey(eachWordSplittedArr[1])){
//				
//				result.put(eachWordSplittedArr[1], res.get(eachWordSplittedArr[1]) + count);
//			}
//			else{
//				result.put(eachWordSplittedArr[1], count);
//			}
//			
//		}
		return res;
	}

}
