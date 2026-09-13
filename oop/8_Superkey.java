public class Main {
    public static void main(String[] args) {

        System.out.println("super Keyword");

        Swift s = new Swift();

        s.name = "Rampayari";
        s.color = "Red";
        // s.wheels = 4;

        s.print();
    }
}

class Car {

    String name;
    String color;
    int wheels = 4;
}

class Swift extends Car {

    int wheels = 5;

    void print() {
        System.out.println("Name: " + super.name);
        System.out.println("Color: " + super.color);

        // Swift class wheels
        System.out.println("Swift wheels: " + wheels);

        // Car class wheels
        System.out.println("Car wheels: " + super.wheels);
    }
}