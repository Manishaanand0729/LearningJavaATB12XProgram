package Task;

import java.util.Scanner;

public class MonthDaysWithLeapYear_24th_may {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month number (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        // Leap year check
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This month has 31 days.");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month has 30 days.");
                break;

            case 2:
                if (isLeap) {
                    System.out.println("This month has 29 days (Leap Year).");
                } else {
                    System.out.println("This month has 28 days.");
                }
                break;
            default:
                System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }

        sc.close();
    }
}
