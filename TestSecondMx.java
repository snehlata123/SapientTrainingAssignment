package GFGprac;
import java.util.*;

public class TestSecondMx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = new int[] {4, 3, 7, 8 };
		System.out.println(secondMax(arr));
		
		Collection<Integer> tempList = new ArrayList<Integer>();
		
		
		
	}
static int secondMax(int [] arr){
	int max=Integer.MIN_VALUE;
	int secMax = Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++){
		max = Math.max(max, arr[i]);
	}
	for(int i=0;i<arr.length;i++){
		if(arr[i] != max){
			secMax = Math.max(secMax, arr[i]);
		}
		
	}
	return secMax;
}




}
