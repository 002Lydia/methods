
package triangle;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Triangle Area Calculator!");

        // Ask the user to enter base and height
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate the area
        double area = calculateTriangleArea(base, height);

        // Display the result
        System.out.println("The area of the triangle is: " + area);
    }

    // Method to calculate the area of a triangle
    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }
}
