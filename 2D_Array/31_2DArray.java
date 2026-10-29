import java.util.ArrayList;
import java.util.List;

public class Main{

  public static void main (String[] arg){
  System.out.println("Original matrix");

  int[][] num = {{1,2,3}, {4,5,6},{7,8,9}}; //old array 
   
  int n = num.length;
  int m = num[0].length;
  
    for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
  
  //for new array
  int newRow = m;
  int newCol = n;
  
  int ans[][] = new int[newRow][newCol];
  
  for(int i = 0 ; i < n;i++ ){
      for(int j = 0; j < m ;j++){
          ans[j][i] = num[i][j];
      }
  }

      // Print transpose
        System.out.println("Transpose Array:");

        for (int i = 0; i < newRow; i++) {
            for (int j = 0; j < newCol; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
}