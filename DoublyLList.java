package GFGprac;

public class DoublyLList {

	public static void main(String[] args) {
		DoublyNode head = null;
//		head = insertBegin(head, 30);
//		head = insertBegin(head, 20);
//		head = insertBegin(head, 10);
		
		
		head = insertAtEnd(head, 10);
		head = insertAtEnd(head, 20);
		head = insertAtEnd(head, 30);
		//head = reverseDoublyLlist(head);		
	//	traverse(head);
//		head = deleteHead(head);
//		head = deleteHead(head);
//		head = deleteHead(head);
		head = deleteLastNode(head);
		traverse(head);
		

	}
	static DoublyNode deleteLastNode(DoublyNode head){
		 DoublyNode curr = head;
		if(head == null || head.next == null) {
			return null;
		}
		while(curr.next != null)
			curr = curr.next;
		
		curr.prev.next = null;
		return head;
		
	}
	
	static DoublyNode insertBegin(DoublyNode head,int data) {
		DoublyNode temp = new DoublyNode(data);
		temp.next = head;
		if(head != null)
		head.prev = temp;

		return temp;
		
	}
	static DoublyNode deleteHead(DoublyNode head){
		if(head == null || head.next == null) return null;
		head = head.next;
		return head;
	}
	
	
	static DoublyNode reverseDoublyLlist(DoublyNode head){
		DoublyNode curr = head;
		
		if(head == null || head.next == null) return head;
		DoublyNode temp = null;
		while(curr != null){
			
			temp = curr.prev;
			curr.prev= curr.next;
			curr.next = temp;
			curr = curr.prev;
		}
		return temp.prev;
		
		
	}
	
	static DoublyNode insertAtEnd(DoublyNode head,int data){
		DoublyNode curr = head;
		DoublyNode temp = new DoublyNode(data);
		if(curr == null) return temp;
		while(curr.next != null){
			curr = curr.next;
		}
		temp.prev = curr;
		curr.next = temp;
		return head;
	}
	
static void traverse(DoublyNode head){
	while(head != null){
		System.out.println(head.data);
		head = head.next;
	}
	
}
}

class DoublyNode{
	int data;
	DoublyNode prev;
	DoublyNode next;
	DoublyNode(int data){
		this.data = data;
	}
}
