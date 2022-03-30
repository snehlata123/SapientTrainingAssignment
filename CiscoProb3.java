package GFGprac;

import java.util.*;

public class CiscoProb3 {
/*
 * input 0,4,5,7,1,3,6,9
 * 
 * 0 1 1 3 4 5 6 7 9
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {0,4,5,7,1,3,6,9};
		System.out.println();
		//System.out.println(longestConsecutiveArrCount(arr));
		String abc = "xyz";
		abc = "def";
		String b = new String ("def");
		System.out.println(b==abc);

	}
static int longestConsecutiveArrCount(int [] arr){
	
	Arrays.sort(arr);
	
	int res = 0;int count =0;
	
	List<Integer> list = new ArrayList<>();
	for(int i=0;i<arr.length-1;i++){
		if(arr[i] != arr[i+1] ) list.add(arr[i]);
	}
	
	for(int i=0;i<list.size();i++){
		if(i > 0 &&  list.get(i) - list.get(i-1) == 1)
		{	
			
			System.out.println(list.get(i-1)+" " );
			count++;
			
		}
		else
			count = 1;
	}
	return count;
}

}

class Singleton{
	private static  volatile Singleton singletonIns  ;
	private Singleton(){}
	public static Singleton getInstance(){
		if(singletonIns == null){
			synchronized (Singleton.class) {
				if(singletonIns == null){
					singletonIns = new Singleton();
				}
				
			}
		}
		return singletonIns;
	}
}
