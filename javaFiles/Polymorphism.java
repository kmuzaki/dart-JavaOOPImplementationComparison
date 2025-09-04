package javaFiles;

public class Polymorphism {
    public void carHorn() {
        System.out.println("Beep Beep!");
    }
}

class Car extends Polymorphism {
    public void carHorn() {
        System.out.println("Beep beep! I'm a car!");
    }
}

class Truck extends Polymorphism {
    public void carHorn() {
        System.out.println("Honk Honk!");
    }
}

class Start {
    public static void main(String[] args) {
        Polymorphism myVehicle1 = new Car();
        Polymorphism myVehicle2 = new Truck();

        myVehicle1.carHorn();
        myVehicle2.carHorn();
    }
}
