package Task;

import java.util.Scanner;

public class Lab067_Max3_Number_17May {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter First Number ()N1: ");
        int N1 = input.nextInt();
        System.out.println("Enter Second Number ()N2:");
        int N2 = input.nextInt();
        System.out.println("Enter Third Number ()N3:");
        int N3 = input.nextInt();

        int max = (N1>N2)
                ?((N1>N3)? N1:N3)
                :((N2 > N3)? N2 : N3);

        System.out.println("The Maximum number is: " + max);
    }
}
