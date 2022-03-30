import java.math.BigInteger;
import java.util.*;


public class TestUBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	Scanner s = new Scanner(System.in);
	int sum = s.nextInt();
	System.out.println("input array");
	String x = s.nextLine();
	System.out.println(x);
String [] strs = 	x.split(",");
//int [] arr = new int [strs.length];
List arr =new ArrayList<Integer>();
for(String temp : strs){
	arr.add( Integer.parseInt(temp));
}

        
System.out.println(checkPair(arr,sum));
    }

static boolean checkPair(List<Integer> arr,int sum){
 HashSet<Integer> s = new HashSet<Integer>();
boolean result = false;

        for (int i = 0; i < arr.size(); ++i)
        {
            int temp = sum - arr.get(i);
            if(s.contains(temp)){
                result = true; 
                break;
            }else{
                s.add(temp);
            }

        }

return result;
}


}
