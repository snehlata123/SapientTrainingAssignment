package DP;

public class DPPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(coinChange(new int[]{7,1,5,6,2},7));
		 int n = 5;
		    int a[] = { 7,1,5,6,2 };
		    int sum = 7;
		    System.out.println(subsetSum(a,n,sum));
	}
static int coinChange(int [] coins,int sum){
	int n = coins.length;
	int [][]dp = new int[sum+1][n+1];
	for(int i=0;i<=n;i++) dp[0][i]=1;
	//for(int i=1;i<=sum;i++) dp[i][1]=0;
	for(int i=1;i<=sum;i++){
		for(int j=1;j<=n;j++){
			dp[i][j] = dp[i][j-1];//simply ignore the jth coin
			if(coins[j-1] <=i)
				dp[i][j] += dp[i-coins[j-1]][j];
		}
	}
	return dp[sum][n];
}


static int subsetSum(int arr[], int n, int sum)
{
     
    // Initializing the matrix
    int tab[][] = new int[n + 1][sum + 1];
 
    // Initializing the first value of matrix
    tab[0][0] = 1;
 
    for(int i = 1; i <= sum; i++)
        tab[0][i] = 0;
 
    for(int i = 1; i <= n; i++)
        tab[i][0] = 1;
 
    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= sum; j++)
        {
             
            // If the value is greater than the sum
            if (a[i - 1] > j)
                tab[i][j] = tab[i - 1][j];
 
            else
            {
                tab[i][j] = tab[i - 1][j] +
                            tab[i - 1][j - a[i - 1]];
            }
        }
    }
 
    return tab[n][sum];
}
}
