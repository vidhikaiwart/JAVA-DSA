
import java.util.ArrayList;
import java.util.List;

public class Main
{
        
	public static void main(String[] args) {
		System.out.println("Print the sum of each row in 2d array");
		int[][] num = {{1,2,3,},{4,5,6},{7,8,9}};
		// output - [6,15,24]
	
       List<Integer> res = new ArrayList<>();
         int n = num.length;
         int m = num[0].length;

         //travale arr
         for(int r = 0; r < n ; r++){

            //when row chnage sum = 0
            int sum = 0;
            for(int c = 0; c < m ;c++){
             int val = num[r][c];
             sum += val;
            }
            
            //if all val in col traverse add in res
            res.add(sum);
         }
		
             
         
	    System.out.println("result array " + res);
	}
}