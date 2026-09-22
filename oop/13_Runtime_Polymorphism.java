public class Main
{
	public static void main(String[] args) {
	System.out.println("Runtime polymorphism : means a child class provides its own implementation of a parent class method, and the method to execute is decided at runtime.");
	
	Animal d = new Dog();
	d.run();

	
	Animal c = new Cat();
	c.run();

   }	
    
}

abstract class Animal{
    abstract void run();
}
	
class Dog extends Animal{

//@Override 
    void run(){
        System.out.println("Dog is running");
    }

}

class Cat  extends Animal{

//@Override 
    void run(){
        System.out.println("Cat is running");
    }
    
}
