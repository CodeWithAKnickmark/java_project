public interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.0);
        Shape s2 = new Square(4.0);

        System.out.println("Area of Circle: " + s1.calculateArea());
        System.out.println("Area of Square: " + s2.calculateArea());
    }
}
