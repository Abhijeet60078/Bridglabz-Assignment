package Constructor;

public class Circle {
    double radius;
    public Circle() {
        this(1.0);
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
    }
}

