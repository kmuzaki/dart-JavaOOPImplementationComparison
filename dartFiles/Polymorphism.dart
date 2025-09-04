class Horn {
  void carHorn() {
    print("Beep Beep!");
  }
}

class Car extends Horn {
  void carHorn() {
    print("Beep beep! I'm a car!");
  }
}

class Truck extends Horn {
  void carHorn() {
    print("Honk Honk!");
  }
}

void main() {
  Horn myVehicle1 = Car();
  Horn myVehicle2 = Truck();

  myVehicle1.carHorn();
  myVehicle2.carHorn();
}