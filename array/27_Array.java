
public class Main
{
        
	public static void main(String[] args) {
		System.out.println(" Maximum Sum Contiguous SubArray || Kadane's Algorithm ");
		
		int[] num = {-2,1,-3,4,-1,2,1,-5,4};
		//4+(-1)+2+1 = 6
	
		 int sum = 0;
         int maxi = Integer.MIN_VALUE;
         
         for(int i = 0; i<num.length;i++){
            //  step : 1 create sum
             sum = sum + num[i];
            //  step:2 update max
             maxi = Math.max(sum,maxi);
            //  step:3 check sum value are not negative
             if(sum < 0){
                sum =0;
             }
         }
	    System.out.println("Maximum Sum: " + maxi);
	}
}