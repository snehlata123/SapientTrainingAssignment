package GFGprac;

public class CircularLinkedListTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CNode head =null;
head = insertAtEnd(30,head);
head = insertAtEnd(20,head);
head = insertAtEnd(10,head);
head = insertAtEnd(5,head);
traverse(head);
	}
//o(n)
static	CNode insertAtBegin(int data,CNode head){
		CNode temp = new CNode(data);
		if(head == null ) 
		temp.next = temp;
		else{
			CNode curr = head;
		while(curr.next != head)
			curr = curr.next;
		curr.next = temp;
		temp.next = head;
		
		}
		return temp;
	}
//O(1)
static	CNode insertAtBeginConstant(int data,CNode head){
	CNode temp = new CNode(data);
	if(head == null){ temp.next = temp;
	return temp;
	}
	else{
		temp.next = head.next;
		head.next = temp;
		int i = head.data;
		head.data = temp.data;
		temp.data = i;
		
	}
	return head;
	
}

static	CNode insertAtEnd(int data,CNode head){
	CNode temp = new CNode(data);
	CNode curr = head;
	if(head == null) {temp.next = temp;
	return temp;
	}
	while(curr.next != head)
		curr = curr.next;
	curr.next=temp;
	temp.next = head;
	return head;
	}


static void traverse(CNode head){
	if(head == null) return;
	CNode r = head;
	do{
		System.out.println(r.data);
		r = r.next;
	}while(r != head);
}

}
class CNode{
	int data;
	CNode next;
	CNode(int data){
		this.data = data;
	}
}
