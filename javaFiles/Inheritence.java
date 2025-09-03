package javaFiles;

public class Inheritence {
    String category = "Roller Coasters";
    public void startRide() {
        System.out.println("The ride has started!");
    }
}

class ThemeParkRide extends Inheritence {
    private String rideName = "Bumble Bee";

    public static void main(String[] args) {
        ThemeParkRide ride = new ThemeParkRide();

        ride.startRide();
        System.out.println("Ride Name: " + ride.rideName);
    }
}