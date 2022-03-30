
public class LearnStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;
	}
}
}

class MyStack{
	int capacity;
	int [] arr;
	int top;
	
	
	MyStack(int capacity){
		this.capacity = capacity;
		arr = new int[capacity];
		top = -1;
		
	}
	
	void push(int item){
		if(arr.length < capacity)
			top++;
		arr[top] = item;
	}
	
int pop(){
	int res =0;
	if(arr.length>0) res= arr[top--];
	return res;
}
}