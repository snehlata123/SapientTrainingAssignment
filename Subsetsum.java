package DP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Subsetsum {
	static int count;
    static int sum;
    static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n = 6;
		count =0;
		int arr[]= {1,2,5,4,8,3}, sum = 7;
		System.out.println(countSubsets(arr,n,sum));
		f(arr, 0, 0);
		 System.out.println(count);
	}

	
	static int countSubsets(int arr[],int n,int sum){
		if(n==0) return (sum ==0)?1:0;
	
	
	return countSubsets(arr, n-1, sum) + countSubsets(arr, n-1, sum - arr[n-1]);
	
}
	
	 static void f(int[] pat, int i, int currSum) {
	        if (currSum == sum) {
	            count++;
	            return;
	        }
	        if (currSum < sum && i < n) {
	            f(pat, i+1, currSum + pat[i]);
	            f(pat, i+1, currSum);
	        }
	    }
	}