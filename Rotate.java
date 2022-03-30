package GFGprac;

import java.util.Arrays;

public class Rotate {
	
	 // Function to exchange data of two given indices in an array
    public static void swap(int[] arr, int i, int j)
    {
        int data = arr[i];
        arr[i] = arr[j];
        arr[j] = data;
    }
 
    // Function to reverse a given subarray
    public static void reverse(int[] arr, int low, int high)
    {
        for (int i = low, j = high; i < j; i++, j--) {
            swap(arr, i, j);
        }
    }
 
    // Function to left-rotate an array by `r` positions
    public static void leftRotate(int[] arr, int r)
    {
    	int n  = arr.length;
        // Reverse the first `r` elements
        reverse(arr, 0, n-r-1);
 
        // Reverse the remaining `n-r` elements
        reverse(arr, n-r, n - 1);
 
        // Reverse the whole array
        reverse(arr, 0, arr.length - 1);
    }
 
 

	public static void main(String[] args) {
		int arr[] = { 1,2,3,4,5,6,7 };
		 int k = 3;
		 k = k%arr.length;
		 Rotate r = new Rotate();
		 r.leftRotate(arr,k);
		 System.out.println(Arrays.toString(arr));

	}

}
