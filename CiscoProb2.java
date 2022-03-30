package GFGprac;

public class CiscoProb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [] inputArr = 	{0,1,1,0,0,0,1,0,1};
	sortArr(inputArr);
	for(int i=0;i<inputArr.length;i++){
		System.out.print(inputArr[i] +" ");
	}
	}
//time complexity o(n) aux 
	static void sortArr(int [] arr){
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == 0)
				
				count++;
			
		}
		
		for(int i=0;i<count;i++){
			arr[i] = 0;
		}
		for(int i=count;i<arr.length;i++) 
			 arr[i] = 1;
		
		
	}
	
	
}
