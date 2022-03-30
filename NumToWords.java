package enc;

public class NumToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
converter("1234");


	}

	@FunctionalInterface
	interface Hello{
		void sayHi(String message);
	}
	
	class HelloImpl implements Hello{
   
Hello obj = 	(a)->
	System.out.println("Check");
		
		
	}
	
	static void converter(String num){
		
		int len = num.length();
		char [] nums = num.toCharArray();
		
		String [] ones = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String [] tens ={"","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
		String [] tenMultiples = {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
		String [] tenPows={"Hundred","Thousand"};
		
		int x = 0;
		while(x < nums.length){
			
			if(len >=3){
				if(nums[x] -'0' !=0){
					System.out.print( ones[nums[x]-'0']  +" ");
					                   
					System.out.print(tenPows[len-3]+" ");
				}
				--len;
			}
			else{
				if(nums[x] -'0' == 1){
					int sum = nums[x]-'0'+nums[x+1]-'0';
					System.out.print(tens[sum]);
				}
				else if(nums[x] -'0' == 2 && nums[x+1] -'0' == 0){
					System.out.print("Twenty");
				}else{
					int i=nums[x]-'0';
					if(i>0)
						System.out.print(tenMultiples[i] +" ");
					
					++x;
					
					if(nums[x] -'0' !=0) System.out.print(ones[nums[x]-'0']);	
				}
			}
			++x;
		}
		
	} 
	
	
	
	
	
	
	
	
}
