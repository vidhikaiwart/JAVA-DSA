import java.util.ArrayList;
import java.util.List;

public class Main{

  public static void main (String[] arg){
  System.out.println("Sprial matrix");

  int[][] num = {{1,2,3}, {4,5,6},{7,8,9}}; //old array 
   
  int n = num.length;
  int m = num[0].length;
  
    for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
   

        int startR = 0;
        int endR = n - 1;
        int startC = 0;
        int endC = m - 1;
   
   List<Integer> res = new ArrayList<>();
   
      while (startR <= endR && startC <= endC) {
   //row wise - left to right 
   
   for(int c = startC ; c <= endC; c++){
       res.add(num[startR][c]);
   }
   startR++;
   
   //col wise - top to bottom 
   for(int r = startR ;r <=endR ; r++){
       res.add(num[r][endC]);
   }
   endC--;
   
   //row wise - right to left 
   if(startR <= endR){
       for(int c = endC;c >= startC; c--){
           res.add(num[endR][c]);
       }
       endR--;
   }
   
   //col wise - bottom to top
   if(startC <= endC){
       for(int r = endR; r >= startR ; r--){
           res.add(num[r][startC]);
       }
       startC++;
   }
   }
   
   
     // Print spiral result
        System.out.println("Spiral order:");

        for (int j : res) {
            System.out.print(j + " ");
        }
    }
}