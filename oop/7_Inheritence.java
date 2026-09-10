

public class Main
{
	public static void main(String[] args) {
		System.out.println("Inheritance: Inheritance allows a child class to reuse the properties and methods of a parent class. ");
	
	
	    Vehicle v = new Vehicle();
	      v.start();
	      
	    	
		System.out.println("single level Inheritance ");
		Car c = new Car();
		c.start();
		c.setgear();
		      
	   	System.out.println("multi level Inheritance ");
	    Swift s = new Swift();
	    s.petrol();
	    s.start();
		s.setgear();
		
		System.out.println("hirerchical Inheritance ");
	     Truck t = new Truck();
	     t.twoSeater();
	     t.start();
	     
	     
	    System.out.println("hirerchical Inheritance (but not supported in java) ");
	        
	}
}

class Vehicle{
    String name;
    int number;
    
    public void start(){
        System.out.println("Vehicle started");
    }
    
}
//SINGLE LEVEL INHERITANCE
class Car extends Vehicle{
    public void setgear(){
        System.out.println("change gear");
    }
    
}

//MULTILEVEL INHERITANCE
class Swift extends Car{
    public void petrol(){
        System.out.println("Petrol");
    }
}

//HIRERCHICAL INHERITANCE
class Truck extends Vehicle{
    public void twoSeater(){
        System.out.println("Truck is only for two pepole");
    }
}


//MULTIPLE INHERITANCE (BUT NOT SUPPORT IN JAVA)

/*
               Z   show()
             /  \
    show()  A     B show ();
            \   /
              C
              
              
              C c = new C();
              c.show(); // which method is excute java compiler confuse 
              
              solution - using Interfases
*/




