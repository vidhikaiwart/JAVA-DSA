public class Main
{
	public static void main(String[] args) {
		System.out.println("Static , Final , Private");
		
		A a = new B();
		System.out.println("Static : static method can not be Override");
		a.fun();
		

		System.out.println("Private : Private method can not be Override and also child class cant access");

		System.out.println("Final : Private method can not be Override and also child class cant access");
	}
}

class A{
    
//STATIC
    static void fun(){
        System.out.println("Class A static method");
    }
//PRIVATE
    private void run(){
        System.out.println("run is Private method");
    }
//FINAL
    final void eat(){
        System.out.println("final is not override");
    }
}

class B extends A{
     static void fun(){
        System.out.println("Class B static method");
    }
  
}