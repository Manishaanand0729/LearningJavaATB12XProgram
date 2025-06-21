package Task_19June;

public class LeapYearCheck {
    public static void main(String[] args) {
        int year = 2025;

        if((year % 4 == 0 && year % 100 !=0 ) || (year % 400 == 0 ))
            System.out.println(year + " This Is a Leap year");
        else
            System.out.println(year + " This Is not a Leap year");
    }
}
