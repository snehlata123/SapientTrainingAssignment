package GFGprac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
	     Set s = new HashSet(Arrays.asList(nums1));
	        List l = new ArrayList();
	        System.out.println(s.size());
	        for(int i = 0;i<nums2.length;i++){
	            if(s.contains(nums2[i])){
	              l.add(nums2[i]); 
	              s.remove(nums2[i]);
	            }
	        }
	        System.out.println(l.size());
	       int arr[] = new int[l.size()];
	     //  int i=0;
	      for(int i=0;i<l.size();i++){
	    	   arr[i++]=(int) l.get(i);
	       }
	      System.out.println(arr.length);
	       return arr;
	}

	public static void main(String[] args) {
		int [] nums1 = {1,2,2,1}; int []  nums2 = {2,2};
		IntersectionOfArrays intArr = new IntersectionOfArrays();
		int arr[]=intArr.intersection(nums1, nums2);
		for(int temp :arr){
			System.out.println(temp);
		}
	
		
	}

}
