package enc;

import java.util.*;

public class Ns {
public static void main(String [] args){
	String str = "WER c123";
	 boolean res =  ((!str.equals(""))
	            && (str != null)
	            && (str.matches("[^a-zA-Z0-9 ]*$")));
	 System.out.println(res);
	 //System.out.println(power(8,3));
	 int arr1[] = {2, 5, 6} ; int arr2[] = {4, 6, 8, 10} ;
	 union(arr1,arr2);
	
}
//arr1[] = {2, 5, 6} arr2[] = {4, 6, 8, 10} 
public static void union(int[] arr1,int [] arr2){
	int i=0,j=0;
	while(i<arr1.length && j<arr2.length){
		if(arr1[i]<arr2[j]) System.out.println(arr1[i++]+" ");
		else if(arr2[j] < arr1[i]) System.out.println(arr2[j++]+" ");
		else
			System.out.println(arr2[j++]+" ");
	}
}

public static int power( int N, int M)
{
    int power = N, sum = 1;
    while(M > 0)
    {
        if((M & 1) == 1)
        {
            sum *= power;
        }
        power = power * power;
        M = M >> 1;
    }
    return sum;
}
}