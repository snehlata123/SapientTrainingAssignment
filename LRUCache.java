package GFGprac;

import java.util.*;

public class LRUCache {

	static Deque<Integer> doublyQueue;
	Set<Integer> hSet;
	int cacheSize;
	
	
	
	public LRUCache(int cacheSize) {
		super();
		doublyQueue = new LinkedList<>();
		hSet = new HashSet<>();
		this.cacheSize = cacheSize;
	}

	void access(int item){
		if(!hSet.contains(item))
		{
			if(doublyQueue.size() == cacheSize){
				int rear = doublyQueue.removeLast();
				hSet.remove(rear);
			}
		}else{
			doublyQueue.remove(item);
			
		}
		doublyQueue.push(item);
		hSet.add(item);
	}

static void printCache(){
	Iterator it = doublyQueue.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRUCache cache = new LRUCache(5);
		cache.access(4);
		cache.access(3);
		cache.access(4);
		cache.access(1);
		cache.access(2);
		printCache();
		
		
	}

}
