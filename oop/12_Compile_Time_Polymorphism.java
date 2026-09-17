public class Main
{
	public static void main(String[] args) {
		System.out.println("Compile-Time Polymorphism : means same method name with different parameters, and the method to execute is decided at compile time. ");
		
	Dog d = new Dog();
	d.run();
	d.run(false);
	
	Cat c = new Cat();
	c.run();
	c.run(true);
   }	
    
}
	
class Dog {

//1 METHOD
    void run(){
        System.out.println("Dog is running");
    }

//2 METHOD  - @Overloading  
    void run(boolean see){
        if(see){
            System.out.println("Dog sees Cat");
        }else{
            System.out.println("Dog cannot see cat");
        }
    }
}

class Cat {

//1 METHOD    
    void run(){
        System.out.println("Cat is running");
    }
    
//2 METHOD    - @Overloading
    void run(boolean see){
        if(see){
            System.out.println("Cat sees rat");
        }else{
            System.out.println("Cat cannot see rat");
        }
    }
}
