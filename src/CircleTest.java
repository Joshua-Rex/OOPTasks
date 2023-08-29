public class CircleTest {
    public static void main(String[] args) {
        // Instantiates two circle classes
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);

        // Prints information of the two circle classes
        printCircle(c1);
        printCircle(c2);

    }

    // Takes a circle class and prints the radius and area of the circle
    private static void printCircle(Circle c) {
        System.out.println("Circle radius = " + c.getRadius());
        System.out.println("Circle area = " + c.getArea() + "\n");
    }
}
