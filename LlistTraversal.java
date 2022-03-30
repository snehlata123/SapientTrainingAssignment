package GFGprac;

public class LlistTraversal {

	public static void main(String[] args) {
//		Node head = new Node(10);
//		head.next = new Node(20);
//		head.next.next= new Node(30);
		//head = null;
		Node head = null;
		head = insertAtBeginning(head,40);
	 head = insertAtBeginning(head,30);
	 head = insertAtBeginning(head,20);
	 head = insertAtBeginning(head,10);
//		head = insertAtEnd(head, 10);
//		head = insertAtEnd(head, 20);
//		head = insertAtEnd(head, 30);
//		head = deleteHead(head);
//		head = deleteTail(head);
	 head = insertAtPos(head,3,50);
	 System.out.println(searchKey(head, 4));
	 //searchKey(head, 10);
		//traverse(head);
		
	
///recursionTraversal(head);
}
	
static	int searchKey(Node head,int key){
		
		if(head == null) return -1;
		int pos=0;
		while(head != null){
			pos = pos +1;
			System.out.println(head.data+" "+pos);
			if(head.data == key) return pos;
			
			
			head = head.next;
			
			
			
		}
		
		return -1;
	}
	static Node insertAtPos(Node head,int pos,int data){
		Node curr = head;
		int counter = 0;
		Node temp = new Node(data);
		if(pos == 1){
			temp.next = head;
			head= temp;
			return head;
		}
		if(head == null) return head;
		
		while(curr.next != null && counter < pos){
			curr = curr.next;
			counter++;
			if(counter == pos-1){
				temp.next = curr.next;
				curr.next = temp;
			}
		}
		return head;
	}
	
	static Node deleteHead(Node head){
		Node curr = head;
		if(head == null) return head;
		return head.next;
	}
	static Node deleteTail(Node head){
		if(head == null) return null;
		if(head.next == null) return null;
		Node curr = head;
		while(curr.next.next != null) curr = curr.next;
		curr.next = null;
		return head;
		
		
	}
	
	static Node insertAtEnd(Node head,int x){
		Node temp = new Node(x);
		Node curr = head;
		if(head==null){
			return temp;
		}
		while(curr.next != null){
			curr = curr.next;
		}
		curr.next = temp;
		return head;
		
	}
	
	static Node insertAtBeginning(Node head,int x){
		Node temp = new Node(x);
		temp.next = head;
	head = temp;
		return head;
	}
	
	static void traverse(Node head){
		while(head != null){
			System.out.println(head.data);
			head = head.next;
		}
	}
	static int intersection(Node list1,Node list2){
		Node curr1 = list1;
		Node curr2 = list2;
		Node res=null;
		if(list1 == null || list2 == null) return -1;
		while(curr1 != null && curr2 != null){
			
			if(curr1 == curr2)
				res= curr1;
			curr1 = curr1.next;
			curr2 = curr2.next;
		}
		return res.data;
	}
	static void recursionTraversal(Node head){
		
		if(head == null) return;
			
			System.out.print(head.data+" ");
		recursionTraversal(head.next);
		
	}
	
}


class Node {
	int data;
	Node next;
	Node(int data){
		this.data = data;
		
		
	}
}
