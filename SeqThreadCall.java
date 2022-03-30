package DP;



public class SeqThreadCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 
	        Thread t1=new Thread(new PrintSequenceRunnable(1),"T1");
	        Thread t2=new Thread(new PrintSequenceRunnable(2),"T2");
	        Thread t3=new Thread(new PrintSequenceRunnable(3),"T3");
	        Thread t4=new Thread(new PrintSequenceRunnable(0),"T4");
	 
	        t1.start();
	        t2.start();
	        t3.start(); 
	        t4.start();
	}

}


 class PrintSequenceRunnable implements Runnable{
	 
    public int PRINT_NUMBERS_UPTO=10;
    static Integer  number = 1;
   Integer remainder;
    static Object lock=new Object();
 
    PrintSequenceRunnable(Integer remainder)
    {
        this.remainder=remainder;
    }
 
    @Override
    public void run() {
        while (number < PRINT_NUMBERS_UPTO - 2 ) {
            synchronized (lock) {
                while (number % 4 != remainder) { // wait for numbers other than remainder
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + number);
                number++;
                lock.notifyAll();
            }
        }
    }
}
 