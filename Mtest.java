package GFGprac;

public class Mtest extends Thread{
	Runnable r = () -> { System.out.println("My Runnable"); };
	public static void main(String[] args) {
		new Mtest().start();

	}

}
