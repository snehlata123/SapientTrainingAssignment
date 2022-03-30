import java.util.*;

public class OracleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//int [] prices =	{4, 10, 14, 2, 8, 21, 16 };
	int [] prices =	{ 32, 29, 25, 15, 12, 5, 7};
	  String s = "abctd";
      String q = "cat";
   
      if (isPresent(s, q))
          System.out.println("Yes");
      else
          System.out.println("No");
		
		
	}
	static int maxProfit(int [] prices){
		int maxCurr=0;
		int maxSoFar = 0;
		
		
		for(int i=1;i<prices.length;i++){
			
			maxCurr = Math.max(0, maxCurr += prices[i] - prices[i-1]);
			maxSoFar = Math.max(maxCurr, maxSoFar);
			
		}
		
		return maxSoFar;
	}
	


static boolean isPresent(String s, String q)
{
     
    // Count occurrences of all
    // characters in s.
    int []freq = new int[256];
    for (int i = 0; i < s.length(); i++)
        freq[s.charAt(i)]++;
 
    // Check if number of occurrences of
    // every character in q is less than
    // or equal to that in s.
    for (int i = 0; i < q.length(); i++)
    {
        freq[q.charAt(i)]--;
         
        if (freq[q.charAt(i)] < 0)
            return false;
    }
 
    return true;
}
}
