public class Main
{
 static class ArrayProblems{

//FIND THE AVERAGE OF ARRAY ELEMENTS
    static double getAvg(int[] arr){
        double sum = 0;
        
        for(int ele : arr){
            sum+= ele;
        }
        int size = arr.length;
        double avg = sum/size;
        return avg;
    }
    
//MULTIPY EACH ELEMENT OF ARRAY BY 10

 static int[] mulBy10(int[] arr){
     int size = arr.length;
     int newArr[] = new int[size];
     
     for(int i =0 ; i<size;i++){
         int ele = arr[i];
         int newEle = ele * 10;
         newArr[i] = newEle;
     }
     return newArr;
 }
 
 
//SEARCH ELEMENT INSIDE ARRAY USING LINEAR SEARCH
 static boolean linearSearch(int[] arr, int tar){
     
     for(int ele:arr){
         if(ele == tar){
             return true;
         }
     }
      return false;
 }
 
 //FIND MAXIMUM ELEMENT IN ARRAY
   static int maxElement(int[] arr){
      
      int max = arr[0];
      
      for(int i =1 ; i<arr.length;i++ ){
          if(arr[i]>max){
              max = arr[i];
          }
      }
            return max;
   } 
   
//RETURN SUM OF -VE AND -VE NUMBER
static int[] sumAns(int[] arr){
    
    int pSum= 0;
    int nSum= 0;
    
    for(int i  =0; i < arr.length; i++){
        
        if(arr[i] > 0){
            pSum += arr[i];
        }else{
            nSum += arr[i];
        }
    }
    int ansSum[] = {pSum , nSum}; 
    return ansSum;
}
  
}
  
	public static void main(String[] args) {

         System.out.print("Array Problem Solving Part-1");
	 
	  int[] arr = {2,4,5,6,8,9};
	  
//AVERAGE OF ARRAY
      System.out.print("Avg of array elemetns :  ");
	  System.out.println(ArrayProblems.getAvg(arr));
	  
//MULTIPLY EACH ELEMENT BY 10
     	System.out.print("multiply by 10 : ");
     int[] ans = ArrayProblems.mulBy10(arr);
     for(int i : ans){
         
         System.out.println(i);
     }
     
//SEARCH ELEMENT INSIDE ARRAY USING LINEAR SEARCH
     System.out.print("target element is : ");
     boolean res = ArrayProblems.linearSearch(arr,8);
     System.out.println(res);
     
 //FIND MAXIMUM ELEMENT IN ARRAY
      System.out.print("max element in arr :  ");
     int maxAns = ArrayProblems.maxElement(arr);
     System.out.println(maxAns);
     
 //RETURN SUM OF -VE AND -VE NUMBER
    
  int[] sum = ArrayProblems.sumAns(arr);

  System.out.println("Positive sum: " + sum[0]);
  System.out.println("Negative sum: " + sum[1]);
     
     
     
     
	}
}