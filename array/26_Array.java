import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Main
{
    
    static class ArrayProblems{
        
        
        static List<Integer> findDisappearNumber(int[] nums){
            
            
            List<Integer> ans = new ArrayList<>();
            
            int n = nums.length;
            //MARKING THE ELEMENTS IN THE ARRAY
            for(int i = 0;i < n; i++){
                
                int val = Math.abs(nums[i]);
                int position = val - 1 ;
                
                if(nums[i] > 0) {
                    nums[position]  =  -nums[position];
                }
            }
            //FINDING THE MISSING ELEMENTS
            for(int i  = 0; i <n ; i++){
                
                if(nums[i] > 0){
                    ans.add(i+1);
                }
                
            }
            
            return ans;
        }
    }
    
	public static void main(String[] args) {
		System.out.println("Missing Elements from an Array of Duplicates ");
		
		int[] nums = { 3,2,3,4,5};
		System.out.print("array elements : ");
		for(int i : nums){
		    System.out.print( i + " ");
		}
		
		List<Integer> ans = ArrayProblems.findDisappearNumber(nums);

        System.out.println("\nMissing elements: " + ans);
	}
}