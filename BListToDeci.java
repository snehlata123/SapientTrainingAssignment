package GFGprac;

import java.util.List;
import java.util.LinkedList;

public class BListToDeci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Nodep head = null;
//		Nodep head = new Nodep(1);
//		head.next = new Nodep(0);
//		head.next.next =new  Nodep(1);
		//head.next.next.next = new Nodep(1);
		
		List<Integer> head = new LinkedList<>();
		head.add(1);
		head.add(0);
		head.add(0);
		head.add(1);
		head.add(0);
		head.add(0);
		head.add(1);
		head.add(1);
		head.add(1);
		head.add(0);
		head.add(0);
		head.add(0);
		head.add(0);
		head.add(0);
		head.add(0);
		System.out.println(getDecimal(head));
	}

	
	static int getDecimal(List<Integer> head){
		int res =0;
		int i=0;
		while(i< head.size() ){
			res = res*2 +head.get(i);
			i++;
		}
		return res;
	}
}
 class Nodep{
	int data;
	Nodep next;
	Nodep(int data ){
		this.data = data;
	}
}