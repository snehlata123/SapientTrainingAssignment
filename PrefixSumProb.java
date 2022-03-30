package GFGprac;

public class PrefixSumProb {

	public static void main(String[] args) {
		int arr[] = {10, 20, 10, 5, 15};
		
		
		 
		 prefixSum(arr);
		 //O(n)
		 System.out.println(prefixRange(arr,1, 3));
	        System.out.println(prefixRange(arr,2, 4));

	}

  private static int prefixRange(final int [] prefix,final int l,final int h){
	 
	  int result =  prefix[h] ;
			  if(l-1 >=0)
		result = result - prefix[l-1];
	  
	  return result;
	  
  }
  
  static void prefixSum(int [] arr){
	 
		
		for(int i = 1;i <arr.length;i++)
			arr[i] = arr[i]+arr[i-1];
  }
  
  private static void rangeSum(int [] arr,int l,int r,int k,int [] prefix){
	  prefix[l] = arr[l]+k;
	  arr[r+1] -= k;
	 
	  
  }
	
	
}
