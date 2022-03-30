package GFGprac;

public class MathsPrac {

	public static void main(String[] args) {
	System.out.println(palindrome(121));
//palindrome(123);
	}
static double pow(int x,int n){
	double res = 1;
	while(n > 0 ){
		if(n %2 != 0)
			res = res*x;
		x = x*x;
		n = n/2;
	}
	
	
	
	return res;
}

static boolean palindrome(int n){
	int original = n;
	int rev = 0;
	while(n > 0){
		
		rev = rev*10+ n%10;
		n = n/10;
	}
	return (rev==original);
}
}
