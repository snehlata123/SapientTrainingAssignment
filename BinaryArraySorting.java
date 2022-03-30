
public class BinaryArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1,0,1,1,1,1,1,0,0,0};
SortBinaryArray(arr, arr.length);

	}
	static int[] SortBinaryArray(int arr[], int n) 
	{ 
	    // code here
	    
	    int cnt = 0;
	    for(int i=0;i<n ;i++){
	        if(arr[i]  != 1)
	          arr[cnt++] = arr[i];
	    }
	    while(cnt < n){
	        arr[cnt++] = 1;
	    }
	    return arr;
	} 
}
