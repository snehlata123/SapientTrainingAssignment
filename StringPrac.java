package GFGprac;


import java.util.*;


public class StringPrac {
	static final int CHARS=256;
	public  static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//System.out.println(checkPalindrome("ABzA"));
		String s = "   a good   example  ";
		char[] wordsChar = s.toCharArray();
	//	 reverseWords(wordsChar, s.toCharArray().length);
		System.out.println(wordsChar);
		reverseWords("   a good   example   ");

	}
static boolean checkPalindrome(String str){
	int n = str.length()-1;
	
	for(int i=0;i<n;i++)
	{	if(str.charAt(i) != str.charAt(n))
			return false;
				n--;
	}
	return true;
}
static boolean checkSubSeq(String s1,String s2){
	int j=0;
	int m = s2.length();
			for(int i=0;i<s1.length() && j <s2.length();i++){
				if(s1.charAt(i) ==s2.charAt(j)) j++;
			}
	return (j == m);
}
static boolean anagramCheck(String s1,String s2){
	int [] count = new int [CHARS];
	for(int i=0;i<s1.length();i++){
		count[s1.charAt(i)]++;
		count[s2.charAt(i)]--;
	}
	for(int i=0;i<CHARS;i++)
		if(count[i] != 0) return false;
	return true;
	
}
static int leftMostRepeatingChar(String str){
	int [] count = new int [CHARS];
	for(int i=0;i<str.length();i++){
		count[str.charAt(i)]++;
	}
	
	for(int i=0;i<str.length();i++)
		if(count[str.charAt(i)]>1) return i;
	return -1;
	
	
	
	}
static void reverse(char[]str,int low,int  high){
	while(low <= high){
		char temp = str[low];
		str[low] = str[high];
		str[high] = temp;
		low++;high--;
	}
}
static String reverseWords(char [] str,int n){
		int start=0;
		for(int i=0;i<str.length;i++){
			if(str[i] == ' '){
				reverse(str,start,i-1);
				start = i+1;
			}
		}
		reverse(str,start,n-1);
		reverse(str,0,n-1);
		return (new String(str).trim());
}


static String reverseWords(String s) {
    String result = "";
      if (s == null){
         return s;
     }  
      System.out.println(s);
      System.out.println(s.trim());
     String[] words = s.trim().split("\\s+");
     
     
     List wordList =Arrays.asList(words);
     Collections.reverse(wordList);
     return String.join(" ", wordList);
}
}
