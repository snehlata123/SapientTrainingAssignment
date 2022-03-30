package DP;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PrintOddEven oddeven = new PrintOddEven();
		Thread t1 = new Thread(new PrintOddEven(0),"even");
		Thread t2 = new Thread(new PrintOddEven(1),"odd");
		
		t1.start();
		t2.start();
		
		
		

	}

}

class PrintOddEven implements Runnable{
	Integer evenflag;
    static Integer number = 1;
    static Object lock = new Object();

    PrintOddEven(Integer evenFlag) {
        this.evenflag = evenFlag;
    }

    @Override
    public void run() {
        while (number < 10) {
            synchronized (lock) {
                try {
                    while (number % 2 != evenflag) { 
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + " " + number++);
              
                lock.notifyAll();
            }
        }
    }
		
	}
	
	
	
	
