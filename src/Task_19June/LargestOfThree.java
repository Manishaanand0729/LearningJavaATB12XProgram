package Task_19June;

public class LargestOfThree {
    public static void main(String[] args) {
        int a = 20, b = 230, c = 80;
        if(a >= b && b >= c)
            System.out.println("Largets Num :" + a);
        else if (b >= a && b >= c) {
            System.out.println("Largest Num :" + b );
        }else {
            System.out.println("Largest Num :" + c);
        }
    }
}
