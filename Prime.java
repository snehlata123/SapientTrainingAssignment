package enc;

import java.util.*;

public class Prime {

	public static void main(String[] args) {
		int l =21;
		int h = 40;
		Set<Integer> prime = prime(l,h);
		 int freq[] = new int[10];
			System.out.println(prime);
		for(int p : prime){
			 while (p > 0) { 
	                freq[p % 10]++; 
	                p /= 10; 
	                } 
			
		}
		 int max = freq[0], ans = 0; 
		  
	        for (int j = 1; j < 10; j++) { 
	            if (max <= freq[j]) { 
	                max = freq[j]; 
	                ans = j; 
	            } 
	        } 
	        System.out.println(ans);

	}

	private static Set prime(int l, int h) {
		Set prime = new HashSet<>();
		for(int i=l;i<=h;i++){
			if(i%2!=0 && i%3!=0 && i%5!=0)
				prime.add(i);
		}
		
		
		return prime;
		
	}

}
