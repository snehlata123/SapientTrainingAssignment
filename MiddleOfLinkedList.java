package GFGprac;

public class MiddleOfLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int fib(int n){
		int [] f = new int[n+2];
		f[0] = 0;f[1] = 1;
		int i=2;
		while(i<=n){
			f[n] = f[i-1]+f[i-2];
		}
		return f[n];
	}

}
