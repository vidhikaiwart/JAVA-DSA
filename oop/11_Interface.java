

public class Main
{
	public static void main(String[] args) {
		System.out.println("High Level Abstration : Interface");
		 
		System.out.println("Interface :An interface in Java is a reference type that defines a set of methods that a class must implement. It is used to achieve abstraction and multiple inheritance in Java."); 
		
		Car fc = new FuelCar();
		fc.Start();
		fc.Accelerate();
		fc.Stop();
		
		Car dc = new DieselCar();
		dc.Start();
		dc.Accelerate();
		dc.Stop();
	}
}

interface Car{
    void Start();
    void Accelerate();
    void Stop();
}

class FuelCar implements Car{
    
      public void Start(){
        System.out.println("FuelCar started");
    };
      public void Accelerate(){
        System.out.println("FuelCar Accelerate");
    };
      public void Stop(){
        System.out.println("FuelCar stopted");
    };
};


class DieselCar implements Car{
    
    public void Start(){
        System.out.println("DieselCar started");
    };
       public void Accelerate(){
        System.out.println("DieselCar Accelerate");
    };
      public void Stop(){
        System.out.println("DieselCar stopted");
    };
}