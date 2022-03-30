
public class Karat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String message1 = "One does not simply walk into Mordor";
		    int rows1 = 6; int cols1 = 6;
		    // char [][]matrix = new char[rows1][cols1];
		// formMatrix(message1,rows1,cols1,matrix);
		// String result1 = transpose(matrix,rows1,cols1);
		//System.out.println(result1);

		    String message2 = "1.21 gigawatts!";
		    int rows2 = 5; int cols2 = 3;
		    int rows3 = 3; int cols3 = 5;
		    char [][]matrix = new char[rows2][cols2];
		    formMatrix(message2,rows2,cols2,matrix);
		    String result2 = transpose(matrix,rows2,cols2);
		    /*
		     * 11iwt. gas2gat!
		     */
		System.out.println(result2);
	}

static void formMatrix(String message,int row,int col,char [][]matrix){
  char[] messageArr = message.toCharArray();
  
  int temp=0;
  for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){
matrix[i][j] = messageArr[temp++];

    }
  }
 
	  
}


static String transpose(char [][]matrix,int row,int col){
  String result  = "";
  char[][] matrix2 = new char[row][col];
for(int i=0;i<row;i++){
  for(int j=0;j<col;j++){

//      char temp = matrix[i][j];
//      matrix[i][j] = matrix[j][i];
//      matrix[j][i] = temp;
	  matrix2[i][j] = matrix[j][i];
      
  }
}
for(int i=0;i<row;i++){
  for(int j=0;j<col;j++){

result += matrix2[i][j];

  }
}

  return result;
}

}
