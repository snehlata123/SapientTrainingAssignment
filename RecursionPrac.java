package GFGprac;

public class RecursionPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(sumOfNNatutalNo(2));
		String str = "MADAM";
		//System.out.println(palindromeCheck(str,0,str.length()-1));
		//System.out.println(sumOfDigits(12));
		printSub("ABC"," ",0);
		System.out.println();
		
		
		
		
		int arr[] = {40,50,30,40,50,30,31,32};
	    int n = arr.length;
	    int freq =  maxFreq(arr , n);
	    int count = 0;
	    for(int i = 0; i < n; i++) {
	        if(arr[i] == freq) {
	            count++;
	        }
	    }
	    System.out.println("Element " +maxFreq(arr , n) +" occurs "  +count +" times" );
		
	}
	
	static int maxFreq(int []arr, int n)
	{
	   
	    // using moore's voting algorithm
	    int res = 0;
	    int count = 1;
	    for(int i = 1; i < n; i++) {
	        if(arr[i] == arr[res]) {
	            count++;
	        } else {
	            count--;
	        }
	         
	        if(count == 0) {
	            res = i;
	            count = 1;
	        }
	         
	    }
	     
	    return arr[res];
	}
	
	
	
	
	
	
	
static void printN(int n){
	
	if(n == 0)
		return;
	System.out.println(n);
	printN(n-1);
	
}
static int sumOfNNatutalNo(int n){
	if(n == 0) return 0 ;
	return n+sumOfNNatutalNo(n-1);
}
static boolean palindromeCheck(String str,int start,int end){
	if(start >= end) return true;
	return(str.charAt(start) == str.charAt(end) && palindromeCheck(str, start+1, end-1));
}
static int sumOfDigits(int n){
	if(n == 0 ) return 0;
	return (n%10+sumOfDigits(n/10));
}
static void printSub(String str, String curr, int index)
{
	if(index == str.length())
	{
		System.out.print(curr+" ");
		return;
	}

	printSub(str, curr, index + 1);
	printSub(str, curr+str.charAt(index), index + 1);
}
}
