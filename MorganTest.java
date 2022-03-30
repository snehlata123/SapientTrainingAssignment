package GFGprac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MorganTest {

	public static void main(String[] args) {
		int arr[] = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 };
		getMinInKElements(arr,3);
		
				
	}
 static void getMinInKElements(int [] arr,int k){
	 PriorityQueue<Integer> queue = new PriorityQueue<>();
	 List<Integer> listMin= new ArrayList<>();
	 
	 for(int i=0;i<k;i++)
		 queue.add(arr[i]);
	 
	 listMin.add(queue.peek());
	 
	 queue.remove(arr[0]);
	 
	 for(int i=k ;i<arr.length;i++){
		 queue.add(arr[i]);
		 
		 listMin.add(queue.peek());
		 
		 queue.remove(arr[i-k+1]);
	 }
	 System.out.println(listMin);
	 
	  queue = new PriorityQueue<>(Comparator.reverseOrder());
	
	 queue.addAll(listMin);
	 System.out.println(queue.peek());
 }
	}



