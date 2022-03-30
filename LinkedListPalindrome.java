package enc;

public class LinkedListPalindrome {
static class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
	}
}
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		printNodes(head);
		System.out.println("After reversal");
		//printNodes(reverse(head,2));
		
		Node headp = new Node(1);
		headp.next = new Node(2);
		headp.next.next = new Node(1);
		System.out.println(checkPalindrome(headp));
		
	}
	static boolean checkPalindrome(Node head){
		Node fast= head,slow=head;
		while(fast.next != null && fast.next.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}
		Node reversedHalf = reverseP(slow.next);
		while(reversedHalf != null){
			if(head.data != reversedHalf.data)
			return false;
			
			reversedHalf = reversedHalf.next;
			head = head.next;
		}
		return true;
	}
	
	static void printNodes(Node head){
		while(head != null){
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	static Node reverse(Node head,int k){
		Node curr=head, prev=null,next = null;
		int i=0;
		
		while(curr != null && i<k){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			i++;
		}
		if(next != null ){
		Node restNode = reverse(next, k);
		head.next = restNode;
		}
		return prev;
	} 
	
	static Node reverseP(Node head){
		Node curr=head,prev=null,next = null;
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

}
