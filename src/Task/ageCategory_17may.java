package Task;

public class ageCategory {
    public static void main(String[] args) {
        int age =21;
        String result = age>21? "Senoir" : (age<18? "Minor": "adult");
        System.out.println(result);
    }
}
