import java.util.Scanner;

public class Circle {
    // Data Members
    private double radius;
    private String color;

    // Method to get input
    public void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        radius = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Color: ");
        color = scanner.nextLine();

        scanner.close();
    }

    // Method to calculate area
    public void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("\nCircle Details:");
        System.out.println("Radius: " + radius);
        System.out.println("Color: " + color);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        // Create an object of Circle
        Circle c1 = new Circle();

        // Get input and calculate area
        c1.getInput();
        c1.calcArea();
    }
}