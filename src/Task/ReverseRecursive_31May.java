package Task;

public class ReverseRecursive_31May {
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Reversed: " + reverse(str));
    }
}
