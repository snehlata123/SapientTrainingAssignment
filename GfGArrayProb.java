package GFGprac;

public class GfGArrayProb {

	public static void main(String[] args) {
		int [] arr = {10,5,20,8};
		System.out.println(largestElement(arr));
		System.out.println("index::"+secondLargestEle(arr));
		System.out.println(checkSorted(arr));
		int [] arr1={1,2,3,4,5} ;
		
		for(int temp:leftRotateByD(arr1,2))
			System.out.print(temp+" ");
		int [] lArr = {7,10,4,10,6,5,2};
		leadersInArray(lArr);
		//int [] stocks = {1,5,3,8,12};
		int [] stocks = {100,180,260,310,40,535,695};
		stockBuySell(stocks);
		
		int [] sizeOfBars={1,2,3};
		System.out.println(trappingRainWater(sizeOfBars));
	}
	
	
	static int largestElement(int []arr){
		int max=0;
		int j=0;
		for(int i=1;i<arr.length;i++){
			if(arr[max] < arr[i])
			{	
				max = i;
			}
		}
		return max;
	}
	
	static int secondLargest(int [] arr){
		
		int max=largestElement(arr);
		int secMax=-1;
		
		for(int i=0;i<arr.length;i++){
			if(arr[max] != arr[i])
			if(secMax == -1)
				secMax = i;
			if(arr[max] < arr[i])
				secMax = i;
				
		}
		
		return secMax;
	}
static int secondLargestEle(int [] arr){
	int res = -1;
	int largest = 0;
	for(int i=1;i<arr.length;i++){
		if(arr[i] > arr[largest]){
			res = largest;
			largest =i;
		}
		else if(arr[i] != arr[largest]){
			
				if(res == -1 || arr[i] > arr[res]) res = i;
			}
		}
	
	return res;
}
static boolean checkSorted(int [] arr){
	
	for(int i =0;i<arr.length-1;i++)
	if((arr[i] > arr[i+1])) return false;
	return true;
}
static int[] reverse(int [] arr){
	int low = 0;int high = arr.length-1;
	while(low < high){
		int temp = arr[low];
		arr[low]= arr[high];
		arr[high] = temp;
		low++;high--;
	}
	return arr;
}
static int removeDuplicateFromSortedArr(int [] arr){
	int res=1;
	for(int i=1;i<arr.length;i++){
		if(arr[i] != arr[res-1]){
			arr[res] =arr[i];
			res++;
		}
	}
	return res;
}
//10,8,0,0,12,0
//time:o(n)
//space:o(1)
static int[] moveZerosEnd(int [] arr){
	int count = 0;
	for(int i = 0;i<arr.length;i++){
		if(arr[i] != 0 ){
			//swap(arr[i],arr[count]);
			int temp = arr[i];
			arr[i] = arr[count];
			arr[count] = temp;
			count++;
		}
	}
	return arr;
}// o(n) space o(1)
static int[] leftRotateByOne(int [] arr){
	int n = arr.length;
	int temp = arr[0];
	
	for(int i=0;i<arr.length-1;i++)
		arr[i]=arr[i+1];
	
	arr[n-1]= temp;
	
	return arr;
}

static int[] leftRotateByD(int [] arr,int d){
	int n = arr.length;
reverse(arr,0,d-1);
	 reverse(arr,d,n-1);
	 reverse(arr,0,n-1);
	return arr;
}

static void reverse(int[] arr,int low,int high){
	while(low < high){
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
		low++;
		high--;
	}
	//return arr;
}
//O(n) Aux space (O1)
static void leadersInArray(int [] arr){
	int n = arr.length;
	System.out.println();
	int currLeader = arr[n-1];
	System.out.print(arr[n-1]+" ");
	for(int i=n-2;i>=0;i--){
		
		if(arr[i] > currLeader){
			currLeader = arr[i];
			System.out.print(currLeader +" ");
		}
	
	}
}
//{2,3,10,6,4,8,1}
	
static int maxDiff(int [] arr){
	int res = arr[1] - arr[0]; //1
	int min = arr[0];
	for(int i = 1;i<arr.length;i++){
		res = Math.max(res, arr[i]-min);
		min = Math.min(min,arr[i]);
	}
	return res;
}	
	
static int stockBuySell(int [] arr){
	int profit = 0;
	
	for(int i = 0;i<arr.length-1;i++){
		if(arr[i+1]>arr[i]){
			profit += arr[i+1] -arr[i];
		
		}
	}
	System.out.println("profit"+profit);
	
	return profit;
}

static int trappingRainWater(int [] arr){
	
	int [] lMax = new int[arr.length];
	int [] rMax = new int[arr.length];
	int res = 0;
	lMax[0]=arr[0];
	for(int i=1;i<arr.length;i++){
		lMax[i] = Math.max(lMax[i-1], arr[i]);
	}
	rMax[arr.length-1] = arr[arr.length-1];
	for(int i=arr.length-2;i>=0;i--){
		rMax[i] = Math.max(rMax[i+1], arr[i]);
	}
	for(int i=0;i<arr.length;i++){
		res +=Math.min(lMax[i], rMax[i]) - arr[i];
	}
	
	return res;
}


static int maxConsecutiveOnes(int [] arr){
	int res =0;
	int curr = 0;
	for(int i=0;i<arr.length;i++){
		if(arr[i]==0) curr =0;
		else{
			curr++;
			res = Math.max(curr, res);
		}
		
	}
	return res;
}
static int maxSum(int arr[], int n)
{
	int res = arr[0];

	int maxEnding = arr[0];

	for(int i = 1; i < n; i++)
	{
		maxEnding = Math.max(maxEnding + arr[i], arr[i]);

		res = Math.max(maxEnding, res);
	}
	
	return res;
}


}

