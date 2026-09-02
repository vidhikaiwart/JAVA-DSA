public class Main{

public static class Student{
    

//ATTRIBUTES -

   public int id;
   public int age;
   public String name;



//DEFAULT CONSTRUCTOR
    // public  Student(){
//     System.out.println("default construtor are called");
       
//   }


// PARAMETERISED CONSTRUCTOR
     public  Student(int id , String name , int age ){
    System.out.println("parameterised construtor are called");
     this.id = id ;
     this.name = name;
     this.age = age;
  }
  
// COPY CONSTRUCTOR
     public  Student(Student srcObj){
     System.out.println("copy construtor are called");
     this.id = srcObj.id ;
     this.name = srcObj.name;
     this.age = srcObj.age;
  }

// METHOD/BEHAVIOURS
    public void study()
    {
    System.out.println(name + " is sleeping");
    
    }public void eat(){
    System.out.println(name +" is eating");
    
    }public void code(){
    System.out.println(name +" is coding");
    
     }

}


public static void main(String[] args) {
    System.out.println("OOP (Object-Oriented Programming) is a programming approach where we organize code using objects and classes.");
	System.out.println("Classes, Objects, Constructors, Object Lifecycle in JAVA");
	
	
//default Constructors call
// 	Student A = new Student();
// 	A.name = "vidhi";
// 	A.id = 31;
// 	A.age = 21;
	
// 	System.out.println(A.id);
// 	System.out.println(A.name);
// 	System.out.println(A.age);
	
	
//         // Calling methods
//         A.study();
//         A.eat();
//         A.code();

//parameterised Constructors called
//how to create obj
    Student A = new Student(1,"vidhi",21);
    Student M = new Student(2,"chhaya",20);
    Student V = new Student(3,"nidhi",19);
    
    System.out.println(A.id);
	System.out.println(A.name);
	System.out.println(A.age);
	
 // Calling methods
        A.study();
        A.eat();
        A.code();
        
  
//copy constructors called
    Student B = new Student(A);   
    
//     System.out.println(B.id);
// 	System.out.println(B.name);
// 	System.out.println(B.age);
	
	
// Calling methods
//         B.study();
//         B.eat();
//         B.code();
}
    
}
