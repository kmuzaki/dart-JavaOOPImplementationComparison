abstract class Shape {
  void calculateArea();
  void calculateCircumference();
}

class Square extends Shape {
  double? _side;

  Square(double side) {
    this._side = side;
  }

  @override
  void calculateArea() {
    double area = _side! * _side!;
    print("Area of Square: $area");
  }

  @override
  void calculateCircumference() {
    double circumference = 4 * _side!;
    print("Circumference of Square: $circumference");
  }
}

void main() {
  Shape square = Square(5);
  square.calculateArea();
  square.calculateCircumference();
}