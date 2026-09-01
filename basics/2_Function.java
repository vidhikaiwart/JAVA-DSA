// Functions & Methods

import java.util.*;

public class Main{

//  returnType methodName(paramters){
//  // method body  }


//     public static void printName(String name){
//     System.out.println(name);
//     return;
// }


      public static int calSum(int a, int b){
        int sum = a+b;
          return sum ;
      }

	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
// 	 String name = input.next();
     int a = input.nextInt();
     int b = input.nextInt();
	 
// 	 printName(name); // invoke the method
     int sum = calSum(a,b);
     System.out.println(sum);
	}
}