import java.util.*;
public class TransposeMatrix {
	static final int M = 3;
    static final int N = 4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 int A[][] = { {1, 1, 1, 1},
//                 {2, 2, 2, 2},
//                 {3, 3, 3, 3}};
		
		
		//Integer.bitCount(15);
		System.out.println(Integer.bitCount(15));
		
char A[][]={{'1','.','2'},
{'1',' ','g'},
{'i','g','a'},
{'w','a','t'},
{'t','a','!'}
};
   char B[][] = new char[A.length][A[0].length], i, j;

  // transpose(A, B);

   System.out.print("Result matrix is \n");
   for (i = 0; i < A.length; i++)
   {
       for (j = 0; j < A[0].length; j++)
       System.out.print(B[i][j] + " ");
       System.out.print("\n");
   }
}
	
	 static void transpose(char A[][], char B[][])
	    {
	        int i, j;
	        for (i = 0; i < A.length; i++)
	            for (j = 0; j < A[0].length; j++)
	                B[i][j] = A[j][i];
	    }
}
