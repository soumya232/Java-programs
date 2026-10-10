public class Vehicle {

    void start() {
        System.out.println("Vehicle starting...");
    }

    public static void main(String[] args) {

        Car c = new Car();
        Bike b = new Bike();

        c.start();
        b.start();
    }
}

class Car extends Vehicle {

    void start() {
        System.out.println("Car starting...");
    }
}

class Bike extends Vehicle {

    void start() {
        System.out.println("Bike starting...");
    }
}