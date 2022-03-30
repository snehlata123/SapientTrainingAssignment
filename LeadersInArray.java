package GFGprac;

public class LeadersInArray {
	
	
	void printLeaders(int arr[],int n){
		int max_element= arr[n-1];
		System.out.print(max_element+" ");
		for(int i = n-2;i >=0;i--){
			if(arr[i] > max_element){
				max_element = arr[i];
				System.out.print(max_element+" ");
			}
		}
		
	}
	
	

	public static void main(String[] args) {
		LeadersInArray lead = new LeadersInArray();
		  int arr[] = new int[]{15,18,5,3,6,2};
	        int n = arr.length;
	        lead.printLeaders(arr, n);

	}

}
