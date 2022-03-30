package enc;

public class LongestString {

	public static void main(String[] args) {
		String str="aaaabbbnccccvvaaaaaaa";
//		longestStr(str);
		longestString(str);

	}
	
	private static void longestString(String str){
		int len = 1;
		int substrlen = 0;
		int index = 0;
		
		for(int i=0; i<str.length()-1; i++){
			
			if(str.charAt(i)==str.charAt(i+1)){
				len++;
				
				if(i==str.length()-2){
					if(substrlen < len){
						substrlen = len;
						index = i+2-len;
						i++;
					}
					break;
				}
			}
			else{
				if(substrlen < len){
					substrlen = len;
					index = i+1-len;
				}
				len = 1;
			}
		}
		
		System.out.println(index + ", " + substrlen);
	}

	private static void longestStr(String str) {		
		int length = 1;
		int index = 0;
		String temp="";
			for(int i=0;i<str.length()-1;i++){
				
			if(str.charAt(i)==str.charAt(i+1)){
				
				temp+=String.valueOf(str.charAt(i));
				length=length+1;
				i=i+1;
			}
			else{
				length=1;
				temp="";
			}
			}	
			
		System.out.println(length);

	}
	
}
