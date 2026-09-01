
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
//COMMON METHOD 

     String a = "";
     System.out.println(a.isEmpty()); // length - 0
     System.out.println(a.isBlank()); // empty or spaces
      
     String tri = " asedfd   ";
     System.out.println(tri.length());
     tri = tri.trim();
     System.out.println(tri.length());
  

// STRING INPUT 

      Scanner sc = new Scanner(System.in);
      System.out.println("enter string contain: ");
      String str = sc.nextLine();
      System.out.println("use nextline : "+str);

      System.out.println("enter string contain: ");
      String str1 = sc.next();
      System.out.println("use next : "+str1);


	    
//COMPARING STRING   

          System.out.println("COMPARING STRING");
       //== 
       String lan = "java";
       String lan1 ="JAva";
       
       if(lan == lan1) {
           System.out.println(" (==) - it comparing refence is both varible refer same address");
       }else{
           System.out.println(" (==) - not refer same address");
       }
       
       
       //.equal - case sensitive
          if(lan.equals(lan1) ){
           System.out.println(".equals - it compare value ");
       }else{
           System.out.println(".equals - also compare capital and small ");
       }
       
           //.equal - case sensitive
          if(lan.equalsIgnoreCase(lan1) ){
           System.out.println(".equals - it compare value ");
       }else{
           System.out.println(".equals - also compare capital and small ");
       }
	
	    

//TWO WAY TO CREATE STRING LITRAL	   

	    String firstname = "vidhi";
	    String lastname = new String("kaiwart");
	    
		System.out.println(firstname + " " + lastname);

//WRONG WAY TO ACCESS STRING ELEMENT
      //System.out.println(firstname[0]);
		System.out.println(firstname.charAt(0));


//STRING NOT UPDATE VALUE , ITS REFENCING IN NEW VALUE UPDATE STRING
        firstname = "chhaya"; 
     	System.out.println(firstname);

	}
}