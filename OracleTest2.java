
public class OracleTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countUniqueChars("Hello"));
		System.out.println(countUniqueChars("java"));
		System.out.println(countUniqueChars(null));
		
		Point p1 = new Point(3,4);
		Point p2 = new Point(5,6);
		
		
		Point p13d = new ThreeDPoint(3,4,5);
		Point p23d = new ThreeDPoint(6,7,8);
	}

	static double distance2D(Point p1,Point p2){
		
		int x1 = p1.x;
		int y1 = p1.y;
		
		
		int x2 = p2.x;
		int y2 = p2.y;
		
		
		return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) *1.0 );
		
	}
	
static double distance3D(ThreeDPoint p1,ThreeDPoint p2){
		
		int x1 = p1.x;
		int y1 = p1.y;
		int z1 = p1.z;
		
		int x2 = p2.x;
		int y2 = p2.y;
		int  z2 = p2.z;
		
		
		return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) *1.0 );
		
	}
	
	
	public static long countUniqueChars(String input) {
		
		if( input==null ) return 0;
		
		return input.toLowerCase().chars().distinct().count();
	}
	
	
	
	
}

interface Calulate{
	double distance(Point p1,Point p2);
	
	
}
 class Point implements Calulate{
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public double distance(Point p1, Point p2) {
		// TODO Auto-generated method stub
		int x1 = p1.x;
		int y1 = p1.y;
		
		
		int x2 = p2.x;
		int y2 = p2.y;
		
		
		return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) *1.0 );
		
		
	}

	
	
	
}


class ThreeDPoint extends Point implements Calulate{
		int z;
	
	public ThreeDPoint(int x, int y, int z) {
		super(x, y);
		this.z = z;
		
	}


	
	
}