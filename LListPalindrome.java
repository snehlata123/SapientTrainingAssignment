package GFGprac;

public class LListPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodePal head=null;
		head = insertAtBeginning(head,"M") ;
		head = insertAtBeginning(head,"A") ;
		head = insertAtBeginning(head,"D") ;
		head = insertAtBeginning(head,"A") ;
		head = insertAtBeginning(head,"M") ;
		System.out.println(isPalindrome(head));
		
		
	}
	
	static NodePal insertAtBeginning(NodePal head,String data){
		NodePal temp = new NodePal(data);
		 temp.next = head;
		 return temp;
	}
	static NodePal reverse(NodePal head){
		NodePal curr = head;
		NodePal prev = null;
		while(head == null){
			NodePal next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			
		}
		return prev;
	}
	static boolean isPalindrome(NodePal head){
		if(head == null) return true;
		NodePal slow = head,fast = head;
		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		NodePal rev = reverse(slow.next);
		NodePal curr = head;
		
		while(rev != null){
			if(rev.data != curr.data) return false;
			rev = rev.next;
			curr = curr.next;
		}
		
		return true;
		
	}

}


class NodePal{
	String data;
	NodePal next;
	NodePal(String data){
		this.data = data;
	}
	

}
