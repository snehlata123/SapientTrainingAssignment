	package enc;
	
	public class TestThread {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Multithread MT = new Multithread();
			Thread t = new Thread( "Thread - 1 ", MT);
			Thread t1 = new Thread( "Thread - 2 ", MT);
			t.start();
			t1.start(); // wait for threads to end
			try
			{
				t.join();
				t1.join();
			} catch ( Exception e)
			{
				System.out.println("Interrupted");
			}
		}
	}
	class Multithread
	{
		public void printCount()
		{
			try
			{
				for(int i = 5; i<0; i--)
				{
					System.out.println("Counter --- " + i );
				}
			}
			catch (Exception e)
			{
				System.out.println("Thread interrupted.");
			}
		}
	}
	class Thread extends Multithread
	{
		private Thread t;
		private String threadName;
		Multithread MT;
		Thread( String name, Multithread mt)
		{
			threadName = name;
			MT= mt;
		}
		public void run()
		{
			MT.printCount();
			System.out.println("Thread " + threadName + " exiting.");
		}
		public void start ()
		{
			System.out.println("Starting " + threadName );
			if (t == null)
			{
				t = new Thread (this, threadName); t.start ();
			}
		}
	}
