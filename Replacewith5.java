package Array;

public class Replacewith5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(convertfive(10));
	}
	 static int convertfive(int n) {
	        // Your code here
		 int count = 1,num=0,rem;
		 while(n != 0) // checking whether number is not equals to zero
	        {
	            rem=n%10; // finding the last digit
	            if(rem==0) //replacing it with 5
	            {
	            num=num+count*5; // building the new number
	            }

	            else num = num + rem*count; //if it is not 0, building the new number
	            count = count*10; // increasing the place value for next digit.
	            n=n/10;
	        }
	        return (num);
	 }   
	    
}
