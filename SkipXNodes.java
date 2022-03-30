package enc;

public class SkipXNodes {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		head.next.next.next.next.next=new Node(6);
		head.next.next.next.next.next.next=new Node(7);
	skipNodesByX(head,2,1);
		
printNodes(head);
	}
	
static void printNodes(Node head){
	while(head != null){
		System.out.print(head.data+" ");
		head = head.next;
	}
	
}
	//10,5
	static void skipNodesByX(Node head,int x,int y){
		Node dummy1 = head,dummy2;
		//Node dummy2;
		int count;
		
		while(dummy1 != null){
			
			for(count=1; count< x && dummy1 != null ;count++ )
				dummy1 = dummy1.next;	
				
			
				if(dummy1 == null) return  ;
			
			dummy2 = dummy1.next;
				for(count=1;count<= y && dummy2 != null ;count++){
					dummy2 = dummy2.next;					
					
				}
				dummy1.next = dummy2;
				dummy1 = dummy2;
				
			
			
			
		}	
		
		
	}
	
static	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			
		}
	}	
	
}
