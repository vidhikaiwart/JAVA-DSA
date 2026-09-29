
public class Main
{
    
    static class ArrayProblem{
        
 //sort array 0's and 1's
        
        static int[] SortArr(int[] nums){
            int n = nums.length;
            int i = 0;
            int j = n-1;
            
            while(i<j){
            if(nums[i] == 1 && nums[j]==0){
                nums[i] = 0;
                nums[j] = 1;
                i++;
                j--;
            }
            else if(nums[i] == 0){
                i++;
            } 
            else if(nums[j] == 1){
                j--;
            }
            } 
            return nums;
        }
        
        static int missingEle(int[] nums1){
            int xorSum = 0;
   
            //xor with all the arr ele
            for(int ele : nums1){
                xorSum = xorSum ^ ele;
            }
            //xor with all the ele in the range 
            int n = nums1.length;
            for(int i =0; i <= n ;i++){
                xorSum = xorSum ^ i;
            }
            return xorSum;
        }
        
        static int findUniqueEle(int[] nums2){
            int xorSum =0 ;
            
            for(int i : nums2){
                xorSum = xorSum ^ i;
            }
         return xorSum;
        }
    }
	public static void main(String[] args) {
		System.out.println("Array Problem Solving Part-3 ");
		
		int[] nums = {0,1,0,0,1,1,0,0};
		System.out.print("original array : " );
		for(int i :nums){
		    System.out.print(  i +" ");
		}

 //sort array 0's and 1's
        System.out.print("\nsort array 0's and 1's : ");
        ArrayProblem.SortArr(nums);
        for(int ele : nums){
             System.out.print( ele +" ");
        }
        


 //missing element 
      	int[] nums1 = {0,1,2,4,5};
		System.out.print("\noriginal array : " );
		for(int i :nums1){
		    System.out.print(  i +" ");
		}
      int result = ArrayProblem.missingEle(nums1);

        System.out.println("\nMissing Element: " + result);
		
//find unique element 
      	int[] nums2= {2,1,2,4,5,5,4};
		System.out.print("\noriginal array : " );
		for(int i :nums2){
		    System.out.print(  i +" ");
		}
      int res = ArrayProblem.findUniqueEle(nums2);

        System.out.println("\nfind unique element  " + res);		
		
		
		
		
	}
}