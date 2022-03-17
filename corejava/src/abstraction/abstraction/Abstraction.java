package abstraction;

public class Abstraction {
    public static void main(String[] args) {
     Car c = new Tesla();
     c.feature();
     c.show();
     c.commonFeature();
     c.topSpeed();
    }
}

abstract class Vehicle {
 public void commonFeature() {
     System.out.println("every car has common features like accelerator and breaks");
 }
 public abstract void topSpeed();
 public abstract void show();
}

abstract class Car extends Vehicle {
public abstract void feature();
public void show() {
    System.out.println("CAR-VEHICLE");
}
}

class Tesla extends Car {
public void topSpeed() {
    System.out.println("car max speed 250km/hr");
}
    public void feature() {
        System.out.println("car is electric and auto motive too");
    }
}