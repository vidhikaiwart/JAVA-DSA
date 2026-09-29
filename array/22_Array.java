import java.util.HashMap;

public class Main
{
  static class ArrayProblem{
      
//ReverseArr ELEMENT 
   static void  ReverseArr(int[] arr){
       
       int n = arr.length;
       
       int i = 0;
       int j = n-1;
       
       while(i < j ){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           
           i++;
           j--;
       }
       
   } 
 
 
//SHIFT ARR ELEMENT BY 1 POSITION
   static void Shiftby1(int[] arr){
       
       int n = arr.length;
       int temp = arr[n-1];
       
       for(int i = n-1 ; i > 0 ; i--){
           arr[i] = arr[i-1];
       }
       arr[0] = temp;
   }
   
//FIND THE MODE OF ARR    
   static int findMode(int[] arr){
       
       HashMap<Integer,Integer> freq = new HashMap<>();
       
       for(int num:arr){
           freq.put(num,freq.getOrDefault(num,0) + 1);
       }
       
       for(int i : freq.keySet()){
           System.out.println(i + " -> " + freq.get(i));
       }
       
       
       int maxfreq = -1;
       int maxkey = -1;
       
       for(int key : freq.keySet()){
           int currkey = key;
           int currFreq = freq.get(key);
           if(currFreq > maxfreq){
               maxfreq = currFreq;
               maxkey = currFreq;
           }
       }
       return maxkey;
       
   }

    
}
 
	public static void main(String[] args) {
		System.out.println("Array Manipulation Problems ");
		
		int[] arr = {3,4,5,6,7,3,2};
		 System.out.print("Original: ");
		for(int ele :arr){
		    System.out.print(ele + " ");
		}
		
//ReverseArr ELEMENT
	System.out.print("\nreverse arr :  ");
    ArrayProblem.ReverseArr(arr);
     for(int i : arr){
         System.out.print(i + " ");
         
     }
         
//Shiftby1 ELEMENT
	System.out.print("\nshift arr element by 1:  ");
    ArrayProblem.Shiftby1(arr);
    for(int i : arr){
         System.out.print(i + " ");
         
     }        
//FIND THE MODE OF ARR      
         System.out.print("\nfind mode :  ");
         int ans =  ArrayProblem.findMode(arr);
         System.out.print("maxFreq element in arr " + ans);
        
         
     }
	}
