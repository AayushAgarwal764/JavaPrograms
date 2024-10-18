abstract class Vehicle {
    public void start() {

    }
}

class Car extends Vehicle {
    public void start() {
        System.out.println("Starts with Key");
    }
}

class Scooter extends Vehicle {
    public void start() {
        System.out.println("Starts with Kick");
    }
}

public class MainAbstraction {
    public static void main(String[] args) {
        Car c = new Car();
        Scooter s = new Scooter();
        c.start();
        s.start();
    }
}