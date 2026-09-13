
public class Main
{
	public static void main(String[] args) {
		System.out.println("High level Abstraction : Abstract Class  ");
		
// 			Car c = new Car(); // is not work 

	Car fc = new fuelCar(); 
	fc.start();
	fc.accelerate();
	fc.stop();
		
	Car dc = new dieselCar(); 
	dc.start();
	dc.accelerate();
	dc.stop();	
	};
}

    abstract class Car{
    
    void start(){
        System.out.println("car started");
    };
    
    abstract void accelerate();
    
    abstract void stop();
}

class fuelCar extends Car{
    
    @Override
    void accelerate(){
        System.out.println("Fuel car is accelerated");
    }
      @Override
    void stop(){
        System.out.println("fuel car is stoped");
    }
}

class dieselCar extends Car{
    
      @Override
    void accelerate(){
        System.out.println("diesel Car  is accelerated");
    }
      @Override
    void stop(){
        System.out.println("diesel Car is stoped");
    }
}
