package enc;

public class RandomString {

	public static void main(String[] args) {
		System.out.println(randStr(5));

	}
	
	static String randStr(int n){
		
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz"; 
		 StringBuilder sb = new StringBuilder(n); 
		
		 for (int i = 0; i < n; i++) { 
			  
	            // generate a random number between 
	            // 0 to AlphaNumericString variable length 
	            int index 
	                = (int)(AlphaNumericString.length() 
	                        * Math.random()); 
	  
	            // add Character one by one in end of sb 
	            sb.append(AlphaNumericString 
	                          .charAt(index)); 
	        } 
	  
	        return sb.toString(); 
	    } 
	}
	


