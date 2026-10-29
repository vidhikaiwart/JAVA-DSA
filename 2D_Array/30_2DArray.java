import java.util.ArrayList;
import java.util.List;

public class Main{

  public static void main (String[] arg){
  System.out.println(" Wave Print Matrix ");

  int[][] num = {{1,2,3}, {4,5,6},{7,8,9}};
   
  int n = num.length;
  int m = num[0].length;

  List<Integer> res = new ArrayList<>();

 //lets move col wise 
  for(int c = 0 ; c< m ; c++ ){
   if((c & 1) == 1){ //odd number of col
   //bottom to top 
   for(int r = m-1; r >=0; r--){
       res.add(num[r][c]);
   }
  }else{//even
  //top to bottom
  for(int r = 0 ; r < m ; r++){
      res.add(num[r][c]);
  }
      
  }
  }
  System.out.print("result array : " + res);

    }
}