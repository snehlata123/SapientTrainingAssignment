package GFGprac;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 void sieveOfEratosthenes(int num){
		 boolean [] prime = new boolean[num];
		 int i=0;
		while(i < num ){
			prime[i] = true;
			i++;
		}
		for(int p=2;p*p<=num;p++){
			if(prime[p]  ==true){
				for(int k = p*p;k<=num;k +=p){
					prime[k] = false;
				}
			}
		}
	 }
	
}
