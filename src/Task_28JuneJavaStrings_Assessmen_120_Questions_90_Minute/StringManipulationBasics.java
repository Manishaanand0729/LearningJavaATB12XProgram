package Task_28JuneJavaStrings_Assessmen_120_Questions_90_Minute;

import java.util.Scanner;

public class StringManipulationBasics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");

        String input = sc.nextLine();

        int length = input.length();

        char firstChar = input.charAt(0);

        String[] parts = input.split(" ");
        String lastWord = parts[parts.length -1];


        System.out.println("Length: " + length);
        System.out.println("firstChar: " + firstChar);
        System.out.println("Substring: " + lastWord);


    }
}
