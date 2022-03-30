package DP;

public class MultiThreadSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Thread t1 = new Thread(new Add(1,10000));
		Thread t1 = new Thread(new Add(1,10),"T1");
		Thread t2 = new Thread(new Add(11,20),"T2");
		Thread t3 = new Thread(new Add(21,30),"T3");
		Thread t4 = new Thread(new Add(31,40),"T4");
		Thread t5 = new Thread(new Add(41,50),"T5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		

	}

}


class Add implements Runnable{
	int x;int y;
	

	public Add(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		add(x,y);
		
		
	}
	
	public void add(int start,int end){
		int sum = 0;
	synchronized (this) {
		for(int i=start;i<end;i++){
			sum += i;
			
		}
		System.out.println(Thread.currentThread().getName()+" sum from "+start +"to "+end+" "+sum);
		
	}
	}
	
	
}
