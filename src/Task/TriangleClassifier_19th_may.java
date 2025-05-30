package Task;

import java.util.Scanner;

public class TriangleClassifier_19th_may {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input side lengths
        System.out.print("Enter side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3: ");
        double side3 = scanner.nextDouble();

        // Check if the sides form a valid triangle
        if (isValidTriangle(side1, side2, side3)) {
            // Classify the triangle
            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is Equilateral.");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("The triangle is Isosceles.");
            } else {
                System.out.println("The triangle is Scalene.");
            }
        } else {
            System.out.println("The sides do not form a valid triangle.");
        }

        scanner.close();
    }

    // Method to check if sides form a valid triangle
    public static boolean isValidTriangle(double a, double b, double c) {
        // Triangle inequality theorem:
        // Sum of any two sides must be greater than the third side
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
