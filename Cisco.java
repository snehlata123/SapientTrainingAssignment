package ArrayPrg;

import java.util.Arrays;

public class Cisco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "121";
		//System.out.println(palindrome(str, 0, str.length()-1));
		int [][] arr = {{1, 2, 3, 4},

                    {5, 6, 7, 8},

                    {9, 10, 11, 12},

                    {13, 14, 15, 16}};
//spiralPrint(arr.length, arr[0].length,arr);
int [] nums ={1,1,9,3,3,4,4};
System.out.println(appearOnce(nums));

	}
static int appearOnce(int [] nums){
return	Arrays.stream(nums).reduce(0,(a,b)->a^b);
	
}
	
	static boolean palindrome(String str,int start,int end){
		if(start == end) return true;
		else{
			if(str.charAt(start)==str.charAt(end))
				return palindrome(str,start+1,end-1);			
			else return false;
		}
	}
	static void spiralPrint(int m, int n, int a[][]) {
		  int i, k = 0, l = 0;
		 
		  while (k < m && l < n) {
		    for (i = l; i <n; ++i) {
		      System.out.print(a[k][i] + " ");
		    }
		    k++;
		    for (i = k; i <m; ++i) {
		      System.out.print(a[i][n - 1] + " ");
		    }
		    n--;
		    if (k < m) {
		      for (i = n - 1; i >= l; --i) {
		        System.out.print(a[m - 1][i] + " ");
		      }
		      m--;
		    }
		    if (l < n) {
		      for (i = m - 1; i >= k; --i) {
		        System.out.print(a[i][l] + " ");
		      }
		      l++;
		    }
		  }
		}
}
