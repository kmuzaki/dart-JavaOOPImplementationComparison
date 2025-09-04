package javaFiles;

public abstract class Abstraction {
    abstract void calculateArea();
    abstract void calculateCircumference();
}

class Square extends Abstraction {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    void calculateArea() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    @Override
    void calculateCircumference() {
        double circumference = 4 * side;
        System.out.println("Circumference of Square: " + circumference);
    }
}

class AbstractionDemo {
    public static void main(String[] args) {
        Abstraction square = new Square(5);
        square.calculateArea();
        square.calculateCircumference();
    }
}