package Task_19June;

public class SmallestOfTwo {
    public static void main(String[] args) {
        int a = 2, b = 9;

        if(a<b)
            System.out.println("Smallest Num :" + a);
        else if (b < a ) {
            System.out.println("Smallest num :" + b);
        }else {
            System.out.println("Both Num is Same");
        }
    }
}
