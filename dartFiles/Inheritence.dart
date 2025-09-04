class Ride {
  String category = "Roller Coasters";
  void startRide() {
    print("The ride has started!");
  }
}

class ThemeParkRide extends Ride {
  String _ridename = "Bumble Bee";
}

void main() {
  ThemeParkRide ride = ThemeParkRide();
  
  ride.startRide();
  print("Ride Name: ${ride._ridename}.");
}