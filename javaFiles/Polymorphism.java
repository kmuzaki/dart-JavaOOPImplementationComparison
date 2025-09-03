package javaFiles;

public class Polymorphism {
    public void carHorn() {
        System.out.println("Beep Beep!");
    }
}

class car extends Polymorphism {
    public void carHorn() {
        System.out.println("Beep beep! I'm a car!");
    }
}

class truck extends Polymorphism {
    public void carHorn() {
        System.out.println("Honk Honk!");
    }
}

class Start {
    public static void main(String[] args) {
        Polymorphism myVehicle1 = new car();
        Polymorphism myVehicle2 = new truck();

        myVehicle1.carHorn();
        myVehicle2.carHorn();
    }
}
