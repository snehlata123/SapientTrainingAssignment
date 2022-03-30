import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TopKClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c1 = new Client(1,100);
		Client c2 = new Client(2,200);
		Client c3 = new Client(3,150);
		Client c4 = new Client(1,140);
		Client c5 = new Client(2,250);
		Client c6 = new Client(2,350);
		List<Client> clients = new ArrayList<>();
		clients.add(c1);
		clients.add(c2);
		clients.add(c3);
		clients.add(c4);
		clients.add(c5);
		clients.add(c6);
		System.out.println( getTopK(clients,2));

	}
	static List<Integer> getTopK(List<Client> clients, int k) { 
		Map<Integer,Integer> sumMap = new HashMap<>();
		
		//o(n)
		
	
		
		for(Client client : clients){
			int id = client.id;
			int purcaseAmt = client.purchseAmount;
			if(sumMap.containsKey(id)){
				int amt = sumMap.get(id);
				sumMap.put(id,  (amt + purcaseAmt));
			}else{
				sumMap.put(id, purcaseAmt);
			}
			
		}
		
		
		System.out.println(sumMap);
		
		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		pq.addAll(sumMap.values().stream().collect(Collectors.toList()));
		System.out.println(pq);
		List<Integer> result = new ArrayList<>();
		int i=0;
		while(!pq.isEmpty()  && i<k){
			result.add((pq.poll()));
			i++;
		}
		List<Integer> result1 = new ArrayList<>();
		
		
		for(int temp : result)
			for (Entry<Integer, Integer> entry : sumMap.entrySet()) {
	            if (entry.getValue().equals(temp)) {
	            	result1.add(entry.getKey());
	            }
			}
		
		
		return result1;
		

		
	}
}


class Client {
	Integer id;
	Integer purchseAmount;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPurchseAmount() {
		return purchseAmount;
	}
	public void setPurchseAmount(int purchseAmount) {
		this.purchseAmount = purchseAmount;
	}
	public Client(Integer id, Integer purchseAmount) {
		super();
		this.id = id;
		this.purchseAmount = purchseAmount;
		
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", purchseAmount=" + purchseAmount + "]";
	}
	
	
	
}