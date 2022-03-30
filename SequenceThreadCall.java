package DP;

import java.util.concurrent.atomic.AtomicInteger;

public class SequenceThreadCall {
	Object monitor = new Object();
	int count = 0;
	//AtomicInteger number = new AtomicInteger();
	volatile int number = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SequenceThreadCall sequenceThreadCall = new SequenceThreadCall();
		Thread t1 = new Thread(sequenceThreadCall.new PrintValue(4,4)); 
		Thread t2 = new Thread(sequenceThreadCall.new PrintValue(1,4));
		Thread t3 = new Thread(sequenceThreadCall.new PrintValue(2,4));
		Thread t4 = new Thread(sequenceThreadCall.new PrintValue(3,4));
		
		t2.start();
		t3.start();
		t4.start();
		t1.start();
		
		
	}



class PrintValue implements  Runnable {
	int threadId;
	int numOfThreads;
	
	
	public PrintValue(int threadId, int numOfThreads) {
		super();
		this.threadId = threadId;
		this.numOfThreads = numOfThreads;
	}
	


private void printItem(){
	
	try{
		while(count < 10){
			//Thread.sleep(1000);
			synchronized(monitor) {
				//count++;
				if(number % numOfThreads != threadId){
					monitor.wait();
				}else{
					System.out.println(threadId +" : "+ number++);
					count++;
					monitor.notifyAll();
				}
			}
			
		}
	}catch(InterruptedException e){
		System.out.println(e.getMessage());
	}
}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		printItem();
		
	}


}
}

