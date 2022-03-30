package enc;

public class WalMartR2 {
	static class Nodew{
		boolean data;
		Nodew next;
		
	}
static Nodew nNode(int data){
	Nodew temp = new Nodew();
	temp.data = (data ==1?true:false);
	return temp;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//input :110
		//output :6
		
		Nodew head = nNode(1);
		head.next = nNode(1);
		head.next.next = nNode(0);
		head.next.next.next = nNode(1);
		System.out.println(getDecimal(head));

	}

static int getDecimal(Nodew head){
	int res = 0;
	while(head != null){
		
		res = ( res << 1) + (head.data?1:0);
		head = head.next;
	}
	return res;
}
	
}

