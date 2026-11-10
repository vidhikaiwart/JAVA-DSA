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
   
   
   //step 1 : transpose array 
   
   for(int i = 0 ; i< n; i++){
       for(int j = i+1 ; j < n ;j++){
        //swap only upper diagonal part of array
           int temp = num[i][j];
           num[i][j]= num[j][i];        //swap num[i][j],num[j][i]
           num[j][i]=temp;
       }
   }
     System.out.println("transpose matrix : ");
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print( num[i][j] + " ");
            }
            System.out.println();
}
   
   //step 2 reverse all row of martix [[1 4 7] [2 5 8] [3 6 9]]
   //      rotated array -           [[7 4 1] [ 8 5 2 ] [9 6 3]]
      for(int r = 0 ; r < n ; r++){
          int scol = 0;
          int ecol = m-1;
          
          while(scol <= ecol){
              int temp = num[r][scol];
              num[r][scol] = num[r][ecol];
              num[r][ecol] = temp;
              scol++;
              ecol--;
          }
      }
      
      System.out.println("Rotate Image : rotate array 90 degeer clockwise " );
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
}
    }
}