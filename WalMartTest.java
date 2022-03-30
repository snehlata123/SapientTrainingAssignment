package enc;

import org.w3c.dom.Node;

public class WalMartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1,1,2,3,5,8,13,21,34,55
		fibo(10);
	}
	
	static void fibo(int n){
		int n1=0,n2=1;
		int n3 = 0;
		n3 = n1+n2;
		//o(n)
	   System.out.print(n3+"  ");
		while(n > 1){
			//int temp = n3;
			
			n3 = n1 + n2; // n3 1 n2 1 n1 0
			n1= n2; 
			n2 = n3 ;
			System.out.print(n3+" ");
			n--;
		}
	} 
	
	
	

}
