package GFGprac;

public class Replace0to1Integer {

	 static int convert0To1Rec(int num)
	    {
	        // Base case
	        if (num == 0)
	            return 0;
	 
	        // Extraxt the last digit and change it if needed
	        int digit = num % 10;
	        if (digit == 0)
	            digit = 1;
	 
	        // Convert remaining digits and append the
	        // last digit
	        return convert0To1Rec(num / 10) * 10 + digit;
	    }
	 
	    // It handles 0 and calls convert0To5Rec() for
	    // other numbers
	    static int convert0To5(int num)
	    {
	        if (num == 0)
	            return 1;
	        else
	            return convert0To1Rec(num);
	    }
	 
	    // Driver function
	    public static void main(String[] args)
	    {
	        System.out.println(convert0To5(100));
	    }
	}
	 