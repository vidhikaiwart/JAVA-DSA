

public class Main
{
    
static class BankAccount{
    private double balance;
    
    public void deposit(int amount){
        balance += amount;
    }
    public void withdraw(int amount){
        balance -= amount;
    }
    
    // Getter
    public double getBalance() {
      return balance;
     }
}

static class Student{
    private String name ;
    private int rollNumber;
    private int age;
    private String college;
    
    
    Student(String name, int rollnumber, int age, String college){
        System.out.println("parameterised construtor are called");
        
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.college = college;
    }
    
    //Getter & Setter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCollege(){
        return college;
    }
    public void setCollege(String college){
        //validations --> college should be Real
        this.college = college;
        
    }
}
    
    
	public static void main(String[] args) {
		System.out.println("Encapsulation : Encapsulation means wrapping data and methods together in a class and protecting data using access modifiers like private.");
		
		BankAccount ba = new BankAccount();
		ba.deposit(500);
		ba.withdraw(200);
		System.out.println(ba.getBalance());
		
		Student a = new Student("Ram", 1, 11,"BIT");
// 		a.name(Ram);
// 		a.rollNumber(1);
// 		a.age(11);
// 		a.college(BIT);
		
		 System.out.println("Name: " + a.getName());
    
        System.out.println("College: " + a.getCollege());
		
		
	}
}