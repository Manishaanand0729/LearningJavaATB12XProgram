package Task_19June;

public class SmallestOfThree {
    public static void main(String[] args) {
        int a = 2, b = 1, c = 8;
        if (a <= b && a <= c)
            System.out.println("Smallest Num is : " +a);
        else if (b <= a && b <= c) {
            System.out.println("Smallest Num is : "+ b);
        }else {
            System.out.println("Smallest is :" + c);
        }
    }
}
