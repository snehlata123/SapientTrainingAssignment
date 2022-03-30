package DP;

public class MSProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<I>
//System.out.println(calulateSeriesSum(5));
//System.out.println(pow(5,5));
	}

	static int calulateSeriesSum(int n){
	int sum = 0;
	if(n == 0) return sum;
	for(int i=1;i<=n;i++){

	sum += pow(i,i);
	}
		return sum;
	}

	
	
	static int pow(int a,int b)	{
	if(b ==0 ) return 1;

	int answer = a;
	int increment = a;
	int i,j;
	for( i =1;i< b;i++){

	for(j = 1; j< a;j++ ){
	answer += increment;
	}
	increment = answer;
	}
	return answer;
	}
	
	
}
