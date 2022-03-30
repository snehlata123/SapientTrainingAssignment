package GFGprac;

public class SetMatrix1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int mat[][] = {{1, 0, 0, 1},
	                {0, 0, 1, 0},
	                {0, 0, 0, 0}};
		
		 System.out.println(mat.length);
		 System.out.println(mat[0].length);
		 setMatrix(mat);
		 printMatrix(mat);
	}
static void printMatrix(int mat[][]){
	 for(int i=0;i<mat.length;i++){
		 for(int j=0;j<mat[0].length;j++){
			 System.out.print( mat[i][j]+"," );
		 }
		 System.out.println();
	 }
}
static void setMatrix(int [][]max){
	int [] col = new int[max[0].length];
	int [] row = new int [max.length];
	int i,j;
	
	for( i=0;i<max.length;i++){
		for( j=0;j<max[0].length;j++){
			if(max[i][j] ==1){
				row[i]=1;
				col[j]=1;
			}
		}
	}
		 for ( i = 0; i < max.length; i++)
	        {
	            for ( j = 0; j < max[0].length; j++)
	            {
	                if ( row[i] == 1 || col[j] == 1 )
	                {
	                    max[i][j] = 1;
	                }
	            }
	        }
	    }
	}


