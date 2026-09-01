import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
//TAKE INPUT FOR 2D ARRAY
     
     int arr[][] = new int[4][3];
     
     Scanner sc = new Scanner(System.in);
     
     for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length ; c++){
                arr[r][c] = sc.nextInt();
            }
        } 
        
     for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length ; c++){
                  System.out.print(arr[r][c] + " ");
            }
             System.out.println();
        }  
     
     
	    
	    
	    
//2D ARRAY	- ITS AN ARRAY OF ARRAY

    // int[][] arr = {
    //               {11,21,31},
    //               {41,51,61,43},
    //               {71,81,91},
    //             };
                
        // how to fing length in 2d array 
        // int row = arr.length;
        // int col = arr[0].length;  // it work only if all have same number of column 
        
        
                
        // for(int r = 0; r < row; r++){
        //     int col = arr[r].length;
        //     for(int c = 0; c < col;c++){
        //         System.out.print(arr[r][c] + " ");
        //     }
        //       System.out.println();
        // }

// traverse 2d array in short way

        // for(int r = 0; r < arr.length; r++){
        //     for(int c = 0; c < arr[r].length ; c++){
        //          System.out.print(arr[r][c] + " ");
        //     }
        //      System.out.println();
        // }  
         


                
        // System.out.println(arr[0][0]);
        // System.out.println(arr[0][1]);
        // System.out.println(arr[0][2]);
        // System.out.println(arr[1][0]);
        // System.out.println(arr[1][1]);       
        // System.out.println(arr[1][2]);
        // System.out.println(arr[2][0]);
        // System.out.println(arr[2][1]);
        // System.out.println(arr[2][2]);
	    
	    
// MINIMUM ELEMENT IN ARRAY

       //      int arr[] = {2,3,4,5,6,3,5,7};

       //      int min = arr[0];
 
       //      for(int i = 1 ; i < arr.length; i++){
  //      if(arr[i]<min){
//          min = arr[i];
//      }
 
         
//      };
 
      // 	  System.out.println(min);
	    

// ARRAY SUM 

    //   int arr[] = {1,3,5,6,7,2};
      
    //   int sum = 0;
    //   for(int val :arr){
    //       sum+=val;
    //   };
      
    //   System.out.println(sum);
	    
	    
	  
//take input for array element	    
	   //int arr[] = new int[5];
	   
	   //Scanner sc = new Scanner(System.in);
	   

	   //for(int i =0 ;i < arr.length; i++){
	          
	   //   System.out.println("provide intput " + i);
	   //    arr[i] = sc.nextInt();
	       
	   //}
	    
	   // //print array 
	   //  System.out.println("your array contains : ");
	   // for(int val :arr){
	   //     System.out.println(val);
	   // }
	    
	    
	    
// ARRAY DECLERATION 
         
    //      int[] arr = new int[5]; 
         
    //      arr[0] =1 ;
    //      arr[1] = 2 ;
    //      arr[2] =3 ;
    //      arr[3] = 5;
    //      arr[4]=7;
         
    //   System.out.println(arr[0]);
    //   System.out.println(arr[1]);
    //     System.out.println(arr[2]);
    //     System.out.println(arr[3]);
    //     System.out.println(arr[5]);
         
	}
}