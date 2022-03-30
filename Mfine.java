package DP;
import java.util.*;

public class Mfine {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 4;
int b = 5;

a = a^ b;
System.out.println(a);
b =  a^b;
System.out.println(b);
a = a^b;
System.out.println(a);
//System.out.println(a+" "+b);

	}

	
	public static List<String> smallestNegativeBalance(List<List<String>> debts) {
	    // Write your code here
	Map<String , int []> map = new HashMap<>();
	for(List list : debts) {
	String borrower = (String) list.get(0);
	String lender = (String) list.get(1);
	int amount = Integer.parseInt((String) list.get(2));
	int [] borrowerBal= map.getOrDefault(borrower, new int [] {0,0,0});
	borrowerBal[0] += amount;
	map.put(borrower, borrowerBal);
	int [] lenderBal= map.getOrDefault(lender, new int [] {0,0,0});
	lenderBal[1] += amount;
	map.put(lender, lenderBal);
	}
	for(Map.Entry<String, int []> entry : map.entrySet())
	{
	int [] bal = entry.getValue();
	bal[2] = bal[1] - bal[0];
	map.put(entry.getKey(), bal);
	}
	PriorityQueue pq = new PriorityQueue<>((a,b) -> map.get(a)[2] == map.get(b)[2] ? ((String) a).compareTo((String) b) : map.get(a)[2]-map.get(b)[2] );
	for(String key : map.keySet())
	{
	pq.add(key);
	}
	List<String> res = new ArrayList<>();
    int min = 0;
    while(!pq.isEmpty()) {
        
        String person = (String) pq.poll();
        int [] balance = map.get(person);
        
        if(balance[2] >= 0)
            return res;
        if(min >= balance[2])
        {
            min = balance[2];
            res.add(person);
        }
    }

   if(res.size()>=1)
return res;
else
res.add("no one is in debt");
return res ;
}
}
