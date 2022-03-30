package GFGprac;

public class OracleTest {
/*
 * input:abc
 * abc,bca,ab,
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 14;
	      assert age <= 18 : "Cannot Vote";
	      System.out.println("The voter's age is " + age);
		
		combinationPermutationOfString("abc"," ");
		

	}
	
	
	static void combinationPermutationOfString(String str,String res){
		
		int n= str.length() ;
		if(str.length() == 0) 
			{
			System.out.print(res+" ");
			return;
			}
		
		for(int i=0; i<n;i++){
			char temp = str.charAt(i);
		String tempStr = str.substring(0,i) + str.substring(i+1);
		String left = str.substring(0,i) ;
		String right = str.substring(i+1);
		String full = left + right;
			
			
			combinationPermutationOfString(full, res+temp);
			
		}
		
	}

}
