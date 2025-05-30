package Task;

import java.util.Scanner;

public class FactorialAndGradeFeedback_24thMay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Factorial section
        System.out.print("Enter a number to calculate factorial (0 to 12): ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers.");
        } else if (n > 12) {
            System.out.println("Number too large! Please enter a number ≤ 12 to avoid integer overflow.");
        } else {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + n + " is: " + fact);
        }

        // Grade section
        System.out.print("\nEnter your grade (A, B, C, D, F): ");
        char grade = sc.next().toUpperCase().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Needs Improvement");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }

        sc.close();
    }
}
