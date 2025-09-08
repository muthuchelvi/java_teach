// This is the abstract base class for all shapes.
// It defines common properties (x and y) and a required method (printArea()).
abstract class Shape {
    int x;
    int y;

    // Constructor to initialize the dimensions.
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // This is an abstract method. It has no body, and its
    // implementation is left to the concrete subclasses.
    public abstract void printArea();
}

// The Rectangle class extends Shape and calculates its area.
class Rectangle extends Shape {
    // Constructor for Rectangle, which passes the length and width to the superclass.
    public Rectangle(int length, int width) {
        super(length, width);
    }

    // This method provides the concrete implementation for the rectangle's area.
    @Override
    public void printArea() {
        System.out.println("The area of the Rectangle is: " + (x * y));
    }
}

// The Triangle class extends Shape and calculates its area.
class Triangle extends Shape {
    // Constructor for Triangle, passing the base and height.
    public Triangle(int base, int height) {
        super(base, height);
    }

    // This method provides the concrete implementation for the triangle's area.
    @Override
    public void printArea() {
        System.out.println("The area of the Triangle is: " + (0.5 * x * y));
    }
}

// The Circle class extends Shape and calculates its area.
class Circle extends Shape {
    // Constructor for Circle, which takes only the radius.
    // The 'y' value from the base class is not used.
    public Circle(int radius) {
        super(radius, 0);
    }

    // This method provides the concrete implementation for the circle's area.
    @Override
    public void printArea() {
        double area = Math.PI * x * x;
        System.out.println("The area of the Circle is: " + area);
    }
}

// The Main class contains the main method to run the program.
public class Main {
    public static void main(String[] args) {
        // Create an object of the Rectangle class and call its printArea method.
        Rectangle rect = new Rectangle(5, 10);
        rect.printArea();

        // Create an object of the Triangle class and call its printArea method.
        Triangle tri = new Triangle(4, 6);
        tri.printArea();

        // Create an object of the Circle class and call its printArea method.
        Circle circle = new Circle(7);
        circle.printArea();
    }
}
