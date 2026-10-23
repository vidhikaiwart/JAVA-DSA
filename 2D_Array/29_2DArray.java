import java.util.ArrayList;
import java.util.List;

public class Main{

  public static void main (String[] arg){
  System.out.println("print hte sum of each column in a 2D Array");

  int[][] num = {{1,2,3}, {4,5,6},{7,8,9}};
   
  int n = num.length;
  int m = num[0].length;

  List<Integer> res = new ArrayList<>();

  for(int c = 0 ; c< m ; c++ ){
    int sum = 0;
    for(int r = 0 ; r < n ; r++){
        int val = num[r][c];
        sum += val;
    }
    res.add(sum);
  }
  System.out.print("result array : " + res);

    }
}