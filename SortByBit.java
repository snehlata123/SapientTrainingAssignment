import java.util.*;
import java.util.Collections;
import java.util.Comparator;

public class SortByBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List l = Arrays.asList(1,2,3,4,5,6);
sort(l);
System.out.println(l);
	}

	static List<Integer> sort(List<Integer> arr){
		Collections.sort(arr,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				int c1 = o1.bitCount(o1);
				int c2 = o2.bitCount(o2);
				if(c1 <=c2) return 1;
				else return -1;
				
			}
		});
		  
	        return arr;
	    }
	
}
