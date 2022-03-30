package GFGprac;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * Input: k = 3, n =  4
list1 = 1->3->5->7->NULL
list2 = 2->4->6->8->NULL
list3 = 0->9->10->11->NULL
Given k linked lists each of size n and each list is sorted in non-decreasing order, merge them into a single sorted (non-decreasing order) linked list and print the sorted linked list as output.

 */


public class ExpediaTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Node mergeKSortedLists( Node arr[], int k)
	    {
		
		Node head=null ,last=null;
		PriorityQueue<Node> priorityQueue = new PriorityQueue<Node>(new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				// TODO Auto-generated method stub
				return o1.data - o2.data;
			}
			
		});
		
		for(int i=0;i<k;i++){
			if(arr[i] != null) priorityQueue.add(arr[i]);
		}
		
		while(priorityQueue.isEmpty()==false){
			Node first = priorityQueue.peek();
			
			priorityQueue.remove();
			
			if(first.next != null){
				priorityQueue.add(first.next);
			}
			if(head == null) {
				head = first;
				last = first;
						
			}else{
				last.next = first;
				last = first;
			}
		}
		
		return head;
	    }
	
}
