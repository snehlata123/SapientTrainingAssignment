package enc;
import java.util.*;
public class FetchEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "the sky is blue";
	System.out.println(reverseWords(s));
	}
	  public static String reverseWords(String s) {
	        String result = "";
	         if (s == null){
	            return s;
	        }   
	        String[] words = s.trim().split("\\s+");
	        List wordList = Arrays.asList(words);
	        Collections.reverse(wordList);
	        return String.join(" ", wordList);
	   
	}
}

