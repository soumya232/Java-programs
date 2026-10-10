abstract class Shape {

    abstract void area();

    abstract void perimeter();
}

class Circle extends Shape {
    double r = 5;

    void area() {
        System.out.println("Circle Area: " + (3.14 * r * r));
    }

    void perimeter() {
        System.out.println("Circle Perimeter: " + (2 * 3.14 * r));
    }
}

class Rectangle extends Shape {
    double length = 4;
    double width = 6;

    void area() {
        System.out.println("Rectangle Area: " + (length * width));
    }

    void perimeter() {
        System.out.println("Rectangle Perimeter: " + (2 * (length + width)));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.area();
        c.perimeter();

        r.area();
        r.perimeter();
    }
}