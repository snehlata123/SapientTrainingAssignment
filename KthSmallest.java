package GFGprac;

import java.util.PriorityQueue;
import java.util.*;

public class KthSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>  l = new ArrayList<Integer>();
		l.add(7); 
		l.add(10 );
		l.add(4 );
		l.add(20); 
		l.add(15);
		l.add(19);
		l.add(18);
		l.add(17);
		kLargestElement(l,4);
		

	}
static int kthSmall(List<Integer> list,int k){
	Queue<Integer> pq = new PriorityQueue<>();
	pq.addAll(list);
	int i=0;
	while(!pq.isEmpty()  && i<k-1){
		System.out.println(pq);
		System.out.println(pq.poll());
		i++;
	}
	System.out.println(pq);
	System.out.println("result::");
	return pq.peek();
}

static void kLargestElement(List<Integer> arr,int k){
	PriorityQueue<Integer> pq = new PriorityQueue<>();
	for(int i=0;i<k;i++) pq.add(arr.get(i));
	for(int i=k;i<arr.size();i++){
		if(pq.peek() < arr.get(i)){
			pq.poll();
			pq.add(arr.get(i));
		}
	}
	System.out.println(pq);
}

}
