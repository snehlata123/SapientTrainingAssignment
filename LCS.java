package DP;

import java.util.Arrays;

public class LCS {
static int [][]memo;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="AXYZ", s2="BAZ";
		
	    int m = 4, n = 3;
	    
	    memo= new int [m+1][n+1];
	    for(int[] i: memo)
	    {
	        Arrays.fill(i,-1);
	    }
	    System.out.println( LCSMemo(s1,s2,m,n));
	    System.out.println( LCSTabulation(s1,s2,m,n));
	}

	
	static int LCSMemo(String s1,String s2,int m,int n){
		if(memo[m][n]!=-1)
            return memo[n][m];
		if(m ==0 || n== 0) memo[m][n]= 0;
		
		else{
		
		if(s1.charAt(m-1) == s2.charAt(n-1)) memo[m][n]= 1+LCSMemo(s1,s2,m-1,n-1);
		else{
			memo[m][n]=	Math.max(LCSMemo(s1,s2,m-1,n),LCSMemo(s1,s2,m,n-1));
			
			
		}
		}
		return memo[m][n];
	}
	static int LCSTabulation(String s1,String s2,int m,int n){
		int [][]dp =new int [m+1][n+1];
		for(int i=0;i<=m;i++)
			dp[i][0]=0;
		for(int j=0;j<=n;j++)
			dp[0][j]=0;
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j]=  1 + dp[i-1][j-1];
				else{
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		return dp[m][n];
		
	
	}
	
	static int iterativeCoinChangeCount(int [] coins,int n,int sum){
		if(sum==0) return 1;
		if(n==0) return 0;
		
		int res = iterativeCoinChangeCount(coins,n-1,sum);
		if(coins[n-1] <= sum)
			res += iterativeCoinChangeCount(coins,n,sum-coins[n-1]);
		return res;
		
	}
}
