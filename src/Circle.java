public class Circle {

    // Variables used within the circle class
    private double radius = 1.0;
    private final String colour = "red";

    // Empty constructor for the circle class
    public Circle() {

    }

    // Constructor class that allows for a new input for the radius
    public Circle(double r) {
        this.radius = r;
    }

    // Getter for the radius of the circle
    public double getRadius() {
        return radius;
    }

    // Calculates and returns the area of the circle
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
