package enc;

import java.util.Stack;

public class WalmartProb3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Stack<Character> st = new Stack();
//		 st.push('a');
//		 st.push('b');
//		 st.push('c');
//		 st.push('d');
		 revStack(st);
		System.out.println(st);
		
		
		
		
	}

	static void revStack(Stack<Character> st){
		if(st.size() > 0){
			char x = st.peek();
			st.pop();
			revStack(st);
			
			insertAtBottom(x,st);
			
			
		}
	}
		
		static void	insertAtBottom(char x,Stack<Character> st){
			if(st.isEmpty()){
				st.push(x);
			}else{
				char item = st.peek();
				st.pop();
				insertAtBottom(x, st);
				st.push(item);
			}
			
			
		}
		
		
	
	
	
	
	
	
}
