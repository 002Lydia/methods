
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if it's a leap year
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // If year is divisible by 400, it's a leap year
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                // If not a century year, it's a leap year
                isLeapYear = true;
            }
        }

        // Display the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
