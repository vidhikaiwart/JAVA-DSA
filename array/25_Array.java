import java.util.Arrays;

public class Main
{
 static class ArrayProblem{
     
     //two Sum
     static int[] TwoSum(int[] num,int  target){
         int l = num.length;
         cl
         //BRUTE FORCE APPROACH
         for(int i = 0; i< l ; i++){
             for(int j = i+1; j < l; j++){
                 if(num[i] + num[j] == target){
                     int ans[] = { num[i] , num[j]};
                     return ans;
                 }
             }
         }
         
         //NO PAIR FOUND
         return new int[]{};
     }

    static int removeDuplicates(int[] nums) {

        int i =0;
        int j = 1;
        int n = nums.length;

        while(j < n){
        
        if(nums[i] == nums[j]){
            j++;
        }else{
          i++;
          nums[i] = nums[j];
          j++;s
        }


        }
        return i+1;
    }
}


	public static void main(String[] args) {
		System.out.println("Two Sum Problem ");
		
		int[] num = {2 ,4 , 6, 7, 8 };
		int target = 6;
		
		int result[] = ArrayProblem.TwoSum(num,target);
		System.out.println( "Pair : " + Arrays.toString(result));
	}
}